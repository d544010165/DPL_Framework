package com.system.bean.project;

import java.util.Date;
import javax.persistence.*;

@Table(name = "p_role")
public class PRole {
    public static final String PUBLIC_ROLENAME = "public";
    public static final String ADMIN_ROLENAME = "admin";

    @Id
    @Column(name = "F_ID")
    private String fId;

    /**
     * 组织主键
     */
    @Column(name = "F_ORGANIZEID")
    private String fOrganizeid;

    /**
     * 分类:1-管理员 2-公共用户
     */
    @Column(name = "F_CATEGORY")
    private Integer fCategory;

    /**
     * 编号
     */
    @Column(name = "F_ENCODE")
    private String fEncode;

    /**
     * 名称
     */
    @Column(name = "F_FULLNAME")
    private String fFullname;

    /**
     * 岗位职责
     */
    @Column(name = "F_RESPONSIBILITY")
    private String fResponsibility;

    /**
     * 排序码
     */
    @Column(name = "F_SORTCODE")
    private Integer fSortcode;

    /**
     * 删除标志
     */
    @Column(name = "F_DELETEMARK")
    private Integer fDeletemark;

    /**
     * 有效标志
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
     * 获取分类:1-管理员 2-公共用户
     *
     * @return F_CATEGORY - 分类:1-管理员 2-公共用户
     */
    public Integer getfCategory() {
        return fCategory;
    }

    /**
     * 设置分类:1-管理员 2-公共用户
     *
     * @param fCategory 分类:1-管理员 2-公共用户
     */
    public void setfCategory(Integer fCategory) {
        this.fCategory = fCategory;
    }

    /**
     * 获取编号
     *
     * @return F_ENCODE - 编号
     */
    public String getfEncode() {
        return fEncode;
    }

    /**
     * 设置编号
     *
     * @param fEncode 编号
     */
    public void setfEncode(String fEncode) {
        this.fEncode = fEncode;
    }

    /**
     * 获取名称
     *
     * @return F_FULLNAME - 名称
     */
    public String getfFullname() {
        return fFullname;
    }

    /**
     * 设置名称
     *
     * @param fFullname 名称
     */
    public void setfFullname(String fFullname) {
        this.fFullname = fFullname;
    }

    /**
     * 获取岗位职责
     *
     * @return F_RESPONSIBILITY - 岗位职责
     */
    public String getfResponsibility() {
        return fResponsibility;
    }

    /**
     * 设置岗位职责
     *
     * @param fResponsibility 岗位职责
     */
    public void setfResponsibility(String fResponsibility) {
        this.fResponsibility = fResponsibility;
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
     * 获取删除标志
     *
     * @return F_DELETEMARK - 删除标志
     */
    public Integer getfDeletemark() {
        return fDeletemark;
    }

    /**
     * 设置删除标志
     *
     * @param fDeletemark 删除标志
     */
    public void setfDeletemark(Integer fDeletemark) {
        this.fDeletemark = fDeletemark;
    }

    /**
     * 获取有效标志
     *
     * @return F_ENABLEDMARK - 有效标志
     */
    public Integer getfEnabledmark() {
        return fEnabledmark;
    }

    /**
     * 设置有效标志
     *
     * @param fEnabledmark 有效标志
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


}