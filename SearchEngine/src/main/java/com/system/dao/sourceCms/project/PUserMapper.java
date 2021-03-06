package com.system.dao.sourceCms.project;

import com.system.bean.project.PUser;
import com.system.util.generate.MyMapper;
import org.apache.ibatis.annotations.Param;

public interface PUserMapper extends MyMapper<PUser> {


    /**
     * 更新用户头像
     * @param id 用户id
     * @param avatar 用户头像在服务器端的路径
     * @return 受影响的行数
     */
    Integer updateHeadIcon(@Param("id") String id,
                           @Param("avatar") String avatar);


    /**
     * 通过用户名查找 用户的角色 2 ( return Puser )
     * @param f_account 用户名
     */
    PUser selectRoleByName(String f_account) ;
}