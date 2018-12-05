package com.system.bean.project;

import java.util.Date;
import javax.persistence.*;

@Table(name = "p_userrole")
public class PUserrole {
    @Id
    @Column(name = "F_ID")
    private String fId;

    /**
     * 用户id
     */
    @Column(name = "F_USERID")
    private String fUserid;

    /**
     * 角色id
     */
    @Column(name = "F_ROLEID")
    private String fRoleid;

    /**
     * 排序码
     */
    @Column(name = "F_SORTCODE")
    private Integer fSortcode;

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
     * 1 无效  0 有效
     */
    @Column(name = "F_DELETEMARK")
    private Integer fDeletemark;

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
     * 获取用户id
     *
     * @return F_USERID - 用户id
     */
    public String getfUserid() {
        return fUserid;
    }

    /**
     * 设置用户id
     *
     * @param fUserid 用户id
     */
    public void setfUserid(String fUserid) {
        this.fUserid = fUserid;
    }

    /**
     * 获取角色id
     *
     * @return F_ROLEID - 角色id
     */
    public String getfRoleid() {
        return fRoleid;
    }

    /**
     * 设置角色id
     *
     * @param fRoleid 角色id
     */
    public void setfRoleid(String fRoleid) {
        this.fRoleid = fRoleid;
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
     * 获取1 无效  0 有效
     *
     * @return F_DELETEMARK - 1 无效  0 有效
     */
    public Integer getfDeletemark() {
        return fDeletemark;
    }

    /**
     * 设置1 无效  0 有效
     *
     * @param fDeletemark 1 无效  0 有效
     */
    public void setfDeletemark(Integer fDeletemark) {
        this.fDeletemark = fDeletemark;
    }
}