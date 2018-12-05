package com.system.util.fileUpload;

import com.system.bean.project.PUser;
import com.system.exception.custom.FileException;
import com.system.util.common.PubUtil;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * 头像上传
 */
public class HeadIconUpload {

    /**
     * 用户上传的头像的最大尺寸，单位：字节
     */
    private static final long AVATAR_MAX_SIZE = 1 * 1024 * 1024;
    /**
     * 头像类型白名单
     */
    private static final List<String> AVATAR_TYPE_WHITE_LIST = new ArrayList<String>();

    /**
     * 图片格式
     */
    static {
        AVATAR_TYPE_WHITE_LIST.add("image/jpeg");
        AVATAR_TYPE_WHITE_LIST.add("image/png");
    }

    /**
     * @return map
     *         id:当前登录用户id,
     *         avatar: 当前头像保存地址
     * @throws Exception
     */
    public static HashMap<String,String> headIconUpload(HttpServletRequest request,
           CommonsMultipartFile file) throws Exception{

        // 检查是否上传了文件
        if (file.isEmpty()) {
            throw new FileException("没有选择上传的文件，或上传的文件的内容为空！");
        }
        // 检查文件大小
        long fileSize = file.getSize();
        if (fileSize > AVATAR_MAX_SIZE) {
            throw new FileException("上传的文件大小超出限制！限制值为" + (AVATAR_MAX_SIZE / 1024) + "KByte。");
        }
        // 检查文件类型
        String contentType = file.getContentType();
        if (!AVATAR_TYPE_WHITE_LIST
                .contains(contentType)) {
            throw new FileException("上传文件类型错误！允许的文件类型：" + AVATAR_TYPE_WHITE_LIST);
        }

        // 获取当前登录的用户的id
        String id = ((PUser)PubUtil.getUser()).getfId();

        // 用户上传的文件存储到的文件夹的名称
        String uploadDirName = "upload";
        // 用户上传的文件存储到的文件夹的路径
        String parentDirPath
                = request.getServletContext()
                .getRealPath(uploadDirName);
        // 用户上传的文件存储到的文件夹
        File parentDir = new File(parentDirPath);
        // 确保文件夹存在
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        // 获取原始文件名
        String originalFileName = file.getOriginalFilename();
        // 获取原始文件的扩展名
        int beginIndex = originalFileName.lastIndexOf(".");
        String suffix = originalFileName.substring(beginIndex);
        // 用户上传的文件存储的文件名
        String fileName = getFileName(id) + suffix;
        // 确定用户上传的文件在服务器端的路径
        String avatar = uploadDirName + "/" + fileName;

        // 用户上传的文件存储到服务器端的文件对象
        File dest = new File(parentDir, fileName);

        // 将用户上传的文件存储到指定文件夹
        try {
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            throw new FileException("读取文件中断，文件路径可能已经发生变化！");
        } catch (IOException e) {
            throw new FileException("读取数据出错！文件可能已被移动、删除，或网络连接中断！");
        }

        //返回
        // id:当前登录用户id
        // avatar: 当前头像保存地址
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("id",id);
        map.put("avatar",avatar);
        return map;
    }


    /**
     * 获取上传文件的文件名，文件名的命名规则是：uid-yyyyMMddHHmmss
     * @param uid 用户id
     * @return 匹配格式的字符串
     */
    private static String getFileName(String uid) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(
                "yyyyMMddHHmmss");
        return uid + "-" + sdf.format(date);
    }

    /*public static void filesUpload(HttpServletRequest request,MultipartFile[] files) throws FileException {
        List<String> list = new ArrayList<String>();
        if (files != null && files.length > 0) {
            for (int i = 0; i < files.length; i++) {
                MultipartFile file = files[i];
                // 保存文件
                list = saveFile(request, file, list);
            }
        }
        //写着测试，删了就可以
        for (int i = 0; i < list.size(); i++) {
            System.out.println("集合里面的数据" + list.get(i));
        }
    }


    private static List<String> saveFile(HttpServletRequest request,
                                  MultipartFile file, List<String> list) throws FileException{
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                // 保存的文件路径(如果用的是Tomcat服务器，文件会上传到\\%TOMCAT_HOME%\\webapps\\YourWebProject\\upload\\文件夹中
                // )
                String filePath = request.getSession().getServletContext()
                        .getRealPath("/")
                        + "upload/" + file.getOriginalFilename();
                list.add(file.getOriginalFilename());
                File saveDir = new File(filePath);
                if (!saveDir.getParentFile().exists())
                    saveDir.getParentFile().mkdirs();

                // 转存文件
                file.transferTo(saveDir);
                return list;
            } catch (Exception e) {
                throw new FileException("文件上传失败,请重试");
            }
        }
        return list;
    }*/
}
