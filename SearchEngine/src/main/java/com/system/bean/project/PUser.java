package com.system.bean.project;

import java.util.Date;
import javax.persistence.*;

@Table(name = "p_user")
public class PUser {
    @Id
    @Column(name = "F_ID")
    private String fId;

    /**
     * 账户
     */
    @Column(name = "F_ACCOUNT")
    private String fAccount;

    /**
     * 姓名1
     */
    @Column(name = "F_REALNAME")
    private String fRealname;

    /**
     * 呢称
     */
    @Column(name = "F_NICKNAME")
    private String fNickname;

    /**
     * 头像
     */
    @Column(name = "F_HEADICON")
    private String fHeadicon;

    /**
     * 性别
     */
    @Column(name = "F_GENDER")
    private Integer fGender;

    /**
     * 生日
     */
    @Column(name = "F_BIRTHDAY")
    private Date fBirthday;

    /**
     * 手机
     */
    @Column(name = "F_MOBILEPHONE")
    private String fMobilephone;

    /**
     * 邮箱
     */
    @Column(name = "F_EMAIL")
    private String fEmail;

    /**
     * 微信
     */
    @Column(name = "F_WECHAT")
    private String fWechat;

    /**
     * 主管主键
     */
    @Column(name = "F_MANAGERID")
    private String fManagerid;

    /**
     * 安全级别
     */
    @Column(name = "F_SECURITYLEVEL")
    private Integer fSecuritylevel;

    /**
     * 个性签名
     */
    @Column(name = "F_SIGNATURE")
    private String fSignature;

    /**
     * 组织主键
     */
    @Column(name = "F_ORGANIZEID")
    private String fOrganizeid;

    /**
     * 部门主键
     */
    @Column(name = "F_DEPARTMENTID")
    private String fDepartmentid;

    /**
     * 岗位主键
     */
    @Column(name = "F_DUTYID")
    private String fDutyid;

    /**
     * 工作编号
     */
    @Column(name = "F_JOBNUMBER")
    private String fJobnumber;

    /**
     * 是否管理员
     */
    @Column(name = "F_ISADMINISTRATOR")
    private Integer fIsadministrator;

    /**
     * 排序码
     */
    @Column(name = "F_SORTCODE")
    private Integer fSortcode;

    /**
     * 0 未删除   1 已删除
     */
    @Column(name = "F_DELETEMARK")
    private Integer fDeletemark;

    /**
     * 1有效  0 无效
     */
    @Column(name = "F_ENABLEDMARK")
    private Integer fEnabledmark;

    /**
     * 描述
     */
    @Column(name = "F_DESCRIPTION")
    private String fDescription;

    /**
     * 创建时间
     */
    @Column(name = "F_CREATORTIME")
    private Date fCreatortime;

    /**
     * 创建用户
     */
    @Column(name = "F_CREATORUSERID")
    private String fCreatoruserid;

    /**
     * 最后修改时间
     */
    @Column(name = "F_LASTMODIFYTIME")
    private Date fLastmodifytime;

    /**
     * 最后修改用户
     */
    @Column(name = "F_LASTMODIFYUSERID")
    private String fLastmodifyuserid;

    /**
     * 删除时间
     */
    @Column(name = "F_DELETETIME")
    private Date fDeletetime;

    /**
     * 删除用户
     */
    @Column(name = "F_DELETEUSERID")
    private String fDeleteuserid;

    /**
     * 登录密码md5
     */
    @Column(name = "F_PASSWORD")
    private String fPassword;

    @Column(name = "F_SALT")
    private String fSalt;

    /**
     * @return F_ID
     */
    public String getfId() {
        return fId;
    }

    /**
     * @param fId
     */
    public void setfId(String fId) {
        this.fId = fId;
    }

    /**
     * 获取账户
     *
     * @return F_ACCOUNT - 账户
     */
    public String getfAccount() {
        return fAccount;
    }

    /**
     * 设置账户
     *
     * @param fAccount 账户
     */
    public void setfAccount(String fAccount) {
        this.fAccount = fAccount;
    }

    /**
     * 获取姓名
     *
     * @return F_REALNAME - 姓名
     */
    public String getfRealname() {
        return fRealname;
    }

    /**
     * 设置姓名
     *
     * @param fRealname 姓名
     */
    public void setfRealname(String fRealname) {
        this.fRealname = fRealname;
    }

    /**
     * 获取呢称
     *
     * @return F_NICKNAME - 呢称
     */
    public String getfNickname() {
        return fNickname;
    }

    /**
     * 设置呢称
     *
     * @param fNickname 呢称
     */
    public void setfNickname(String fNickname) {
        this.fNickname = fNickname;
    }

    /**
     * 获取头像
     *
     * @return F_HEADICON - 头像
     */
    public String getfHeadicon() {
        return fHeadicon;
    }

    /**
     * 设置头像
     *
     * @param fHeadicon 头像
     */
    public void setfHeadicon(String fHeadicon) {
        this.fHeadicon = fHeadicon;
    }

    /**
     * 获取性别
     *
     * @return F_GENDER - 性别
     */
    public Integer getfGender() {
        return fGender;
    }

    /**
     * 设置性别
     *
     * @param fGender 性别
     */
    public void setfGender(Integer fGender) {
        this.fGender = fGender;
    }

    /**
     * 获取生日
     *
     * @return F_BIRTHDAY - 生日
     */
    public Date getfBirthday() {
        return fBirthday;
    }

    /**
     * 设置生日
     *
     * @param fBirthday 生日
     */
    public void setfBirthday(Date fBirthday) {
        this.fBirthday = fBirthday;
    }

    /**
     * 获取手机
     *
     * @return F_MOBILEPHONE - 手机
     */
    public String getfMobilephone() {
        return fMobilephone;
    }

    /**
     * 设置手机
     *
     * @param fMobilephone 手机
     */
    public void setfMobilephone(String fMobilephone) {
        this.fMobilephone = fMobilephone;
    }

    /**
     * 获取邮箱
     *
     * @return F_EMAIL - 邮箱
     */
    public String getfEmail() {
        return fEmail;
    }

    /**
     * 设置邮箱
     *
     * @param fEmail 邮箱
     */
    public void setfEmail(String fEmail) {
        this.fEmail = fEmail;
    }

    /**
     * 获取微信
     *
     * @return F_WECHAT - 微信
     */
    public String getfWechat() {
        return fWechat;
    }

    /**
     * 设置微信
     *
     * @param fWechat 微信
     */
    public void setfWechat(String fWechat) {
        this.fWechat = fWechat;
    }

    /**
     * 获取主管主键
     *
     * @return F_MANAGERID - 主管主键
     */
    public String getfManagerid() {
        return fManagerid;
    }

    /**
     * 设置主管主键
     *
     * @param fManagerid 主管主键
     */
    public void setfManagerid(String fManagerid) {
        this.fManagerid = fManagerid;
    }

    /**
     * 获取安全级别
     *
     * @return F_SECURITYLEVEL - 安全级别
     */
    public Integer getfSecuritylevel() {
        return fSecuritylevel;
    }

    /**
     * 设置安全级别
     *
     * @param fSecuritylevel 安全级别
     */
    public void setfSecuritylevel(Integer fSecuritylevel) {
        this.fSecuritylevel = fSecuritylevel;
    }

    /**
     * 获取个性签名
     *
     * @return F_SIGNATURE - 个性签名
     */
    public String getfSignature() {
        return fSignature;
    }

    /**
     * 设置个性签名
     *
     * @param fSignature 个性签名
     */
    public void setfSignature(String fSignature) {
        this.fSignature = fSignature;
    }

    /**
     * 获取组织主键
     *
     * @return F_ORGANIZEID - 组织主键
     */
    public String getfOrganizeid() {
        return fOrganizeid;
    }

    /**
     * 设置组织主键
     *
     * @param fOrganizeid 组织主键
     */
    public void setfOrganizeid(String fOrganizeid) {
        this.fOrganizeid = fOrganizeid;
    }

    /**
     * 获取部门主键
     *
     * @return F_DEPARTMENTID - 部门主键
     */
    public String getfDepartmentid() {
        return fDepartmentid;
    }

    /**
     * 设置部门主键
     *
     * @param fDepartmentid 部门主键
     */
    public void setfDepartmentid(String fDepartmentid) {
        this.fDepartmentid = fDepartmentid;
    }

    /**
     * 获取岗位主键
     *
     * @return F_DUTYID - 岗位主键
     */
    public String getfDutyid() {
        return fDutyid;
    }

    /**
     * 设置岗位主键
     *
     * @param fDutyid 岗位主键
     */
    public void setfDutyid(String fDutyid) {
        this.fDutyid = fDutyid;
    }

    /**
     * 获取工作编号
     *
     * @return F_JOBNUMBER - 工作编号
     */
    public String getfJobnumber() {
        return fJobnumber;
    }

    /**
     * 设置工作编号
     *
     * @param fJobnumber 工作编号
     */
    public void setfJobnumber(String fJobnumber) {
        this.fJobnumber = fJobnumber;
    }

    /**
     * 获取是否管理员
     *
     * @return F_ISADMINISTRATOR - 是否管理员
     */
    public Integer getfIsadministrator() {
        return fIsadministrator;
    }

    /**
     * 设置是否管理员
     *
     * @param fIsadministrator 是否管理员
     */
    public void setfIsadministrator(Integer fIsadministrator) {
        this.fIsadministrator = fIsadministrator;
    }

    /**
     * 获取排序码
     *
     * @return F_SORTCODE - 排序码
     */
    public Integer getfSortcode() {
        return fSortcode;
    }

    /**
     * 设置排序码
     *
     * @param fSortcode 排序码
     */
    public void setfSortcode(Integer fSortcode) {
        this.fSortcode = fSortcode;
    }

    /**
     * 获取0 未删除   1 已删除
     *
     * @return F_DELETEMARK - 0 未删除   1 已删除
     */
    public Integer getfDeletemark() {
        return fDeletemark;
    }

    /**
     * 设置0 未删除   1 已删除
     *
     * @param fDeletemark 0 未删除   1 已删除
     */
    public void setfDeletemark(Integer fDeletemark) {
        this.fDeletemark = fDeletemark;
    }

    /**
     * 获取1有效  0 无效
     *
     * @return F_ENABLEDMARK - 1有效  0 无效
     */
    public Integer getfEnabledmark() {
        return fEnabledmark;
    }

    /**
     * 设置1有效  0 无效
     *
     * @param fEnabledmark 1有效  0 无效
     */
    public void setfEnabledmark(Integer fEnabledmark) {
        this.fEnabledmark = fEnabledmark;
    }

    /**
     * 获取描述
     *
     * @return F_DESCRIPTION - 描述
     */
    public String getfDescription() {
        return fDescription;
    }

    /**
     * 设置描述
     *
     * @param fDescription 描述
     */
    public void setfDescription(String fDescription) {
        this.fDescription = fDescription;
    }

    /**
     * 获取创建时间
     *
     * @return F_CREATORTIME - 创建时间
     */
    public Date getfCreatortime() {
        return fCreatortime;
    }

    /**
     * 设置创建时间
     *
     * @param fCreatortime 创建时间
     */
    public void setfCreatortime(Date fCreatortime) {
        this.fCreatortime = fCreatortime;
    }

    /**
     * 获取创建用户
     *
     * @return F_CREATORUSERID - 创建用户
     */
    public String getfCreatoruserid() {
        return fCreatoruserid;
    }

    /**
     * 设置创建用户
     *
     * @param fCreatoruserid 创建用户
     */
    public void setfCreatoruserid(String fCreatoruserid) {
        this.fCreatoruserid = fCreatoruserid;
    }

    /**
     * 获取最后修改时间
     *
     * @return F_LASTMODIFYTIME - 最后修改时间
     */
    public Date getfLastmodifytime() {
        return fLastmodifytime;
    }

    /**
     * 设置最后修改时间
     *
     * @param fLastmodifytime 最后修改时间
     */
    public void setfLastmodifytime(Date fLastmodifytime) {
        this.fLastmodifytime = fLastmodifytime;
    }

    /**
     * 获取最后修改用户
     *
     * @return F_LASTMODIFYUSERID - 最后修改用户
     */
    public String getfLastmodifyuserid() {
        return fLastmodifyuserid;
    }

    /**
     * 设置最后修改用户
     *
     * @param fLastmodifyuserid 最后修改用户
     */
    public void setfLastmodifyuserid(String fLastmodifyuserid) {
        this.fLastmodifyuserid = fLastmodifyuserid;
    }

    /**
     * 获取删除时间
     *
     * @return F_DELETETIME - 删除时间
     */
    public Date getfDeletetime() {
        return fDeletetime;
    }

    /**
     * 设置删除时间
     *
     * @param fDeletetime 删除时间
     */
    public void setfDeletetime(Date fDeletetime) {
        this.fDeletetime = fDeletetime;
    }

    /**
     * 获取删除用户
     *
     * @return F_DELETEUSERID - 删除用户
     */
    public String getfDeleteuserid() {
        return fDeleteuserid;
    }

    /**
     * 设置删除用户
     *
     * @param fDeleteuserid 删除用户
     */
    public void setfDeleteuserid(String fDeleteuserid) {
        this.fDeleteuserid = fDeleteuserid;
    }

    /**
     * 获取登录密码md5
     *
     * @return F_PASSWORD - 登录密码md5
     */
    public String getfPassword() {
        return fPassword;
    }

    /**
     * 设置登录密码md5
     *
     * @param fPassword 登录密码md5
     */
    public void setfPassword(String fPassword) {
        this.fPassword = fPassword;
    }

    /**
     * @return F_SALT
     */
    public String getfSalt() {
        return fSalt;
    }

    /**
     * @param fSalt
     */
    public void setfSalt(String fSalt) {
        this.fSalt = fSalt;
    }
}