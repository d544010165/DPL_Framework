package com.system.bean.project;

import java.util.Date;
import javax.persistence.*;

@Table(name = "p_organize")
public class POrganize {
    /**
     * 主键id
     */
    @Id
    @Column(name = "F_ID")
    private String fId;

    /**
     * 父级
     */
    @Column(name = "F_PARENTID")
    private String fParentid;

    /**
     * 层次
     */
    @Column(name = "F_LAYERS")
    private Integer fLayers;

    /**
     * 编码
     */
    @Column(name = "F_ENCODE")
    private String fEncode;

    /**
     * 名称
     */
    @Column(name = "F_FULLNAME")
    private String fFullname;

    /**
     * 简称
     */
    @Column(name = "F_SHORTNAME")
    private String fShortname;

    /**
     * 分类
     */
    @Column(name = "F_CATEGORYID")
    private String fCategoryid;

    /**
     * 负责人
     */
    @Column(name = "F_MANAGERID")
    private String fManagerid;

    /**
     * 电话
     */
    @Column(name = "F_TELEPHONE")
    private String fTelephone;

    /**
     * 手机
     */
    @Column(name = "F_MOBILEPHONE")
    private String fMobilephone;

    /**
     * 微信
     */
    @Column(name = "F_WECHAT")
    private String fWechat;

    /**
     * 传真
     */
    @Column(name = "F_FAX")
    private String fFax;

    /**
     * 邮箱
     */
    @Column(name = "F_EMAIL")
    private String fEmail;

    /**
     * 归属区域
     */
    @Column(name = "F_AREAID")
    private String fAreaid;

    /**
     * 详细地址
     */
    @Column(name = "F_ADDRESS")
    private String fAddress;

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

    @Column(name = "F_CREATORTIME")
    private Date fCreatortime;

    @Column(name = "F_CREATORUSERID")
    private String fCreatoruserid;

    @Column(name = "F_LASTMODIFYTIME")
    private Date fLastmodifytime;

    @Column(name = "F_LASTMODIFYUSERID")
    private String fLastmodifyuserid;

    @Column(name = "F_DELETETIME")
    private Date fDeletetime;

    @Column(name = "F_DELETEUSERID")
    private String fDeleteuserid;

    /**
     * 获取主键id
     *
     * @return F_ID - 主键id
     */
    public String getfId() {
        return fId;
    }

    /**
     * 设置主键id
     *
     * @param fId 主键id
     */
    public void setfId(String fId) {
        this.fId = fId;
    }

    /**
     * 获取父级
     *
     * @return F_PARENTID - 父级
     */
    public String getfParentid() {
        return fParentid;
    }

    /**
     * 设置父级
     *
     * @param fParentid 父级
     */
    public void setfParentid(String fParentid) {
        this.fParentid = fParentid;
    }

    /**
     * 获取层次
     *
     * @return F_LAYERS - 层次
     */
    public Integer getfLayers() {
        return fLayers;
    }

    /**
     * 设置层次
     *
     * @param fLayers 层次
     */
    public void setfLayers(Integer fLayers) {
        this.fLayers = fLayers;
    }

    /**
     * 获取编码
     *
     * @return F_ENCODE - 编码
     */
    public String getfEncode() {
        return fEncode;
    }

    /**
     * 设置编码
     *
     * @param fEncode 编码
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
     * 获取简称
     *
     * @return F_SHORTNAME - 简称
     */
    public String getfShortname() {
        return fShortname;
    }

    /**
     * 设置简称
     *
     * @param fShortname 简称
     */
    public void setfShortname(String fShortname) {
        this.fShortname = fShortname;
    }

    /**
     * 获取分类
     *
     * @return F_CATEGORYID - 分类
     */
    public String getfCategoryid() {
        return fCategoryid;
    }

    /**
     * 设置分类
     *
     * @param fCategoryid 分类
     */
    public void setfCategoryid(String fCategoryid) {
        this.fCategoryid = fCategoryid;
    }

    /**
     * 获取负责人
     *
     * @return F_MANAGERID - 负责人
     */
    public String getfManagerid() {
        return fManagerid;
    }

    /**
     * 设置负责人
     *
     * @param fManagerid 负责人
     */
    public void setfManagerid(String fManagerid) {
        this.fManagerid = fManagerid;
    }

    /**
     * 获取电话
     *
     * @return F_TELEPHONE - 电话
     */
    public String getfTelephone() {
        return fTelephone;
    }

    /**
     * 设置电话
     *
     * @param fTelephone 电话
     */
    public void setfTelephone(String fTelephone) {
        this.fTelephone = fTelephone;
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
     * 获取传真
     *
     * @return F_FAX - 传真
     */
    public String getfFax() {
        return fFax;
    }

    /**
     * 设置传真
     *
     * @param fFax 传真
     */
    public void setfFax(String fFax) {
        this.fFax = fFax;
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
     * 获取归属区域
     *
     * @return F_AREAID - 归属区域
     */
    public String getfAreaid() {
        return fAreaid;
    }

    /**
     * 设置归属区域
     *
     * @param fAreaid 归属区域
     */
    public void setfAreaid(String fAreaid) {
        this.fAreaid = fAreaid;
    }

    /**
     * 获取详细地址
     *
     * @return F_ADDRESS - 详细地址
     */
    public String getfAddress() {
        return fAddress;
    }

    /**
     * 设置详细地址
     *
     * @param fAddress 详细地址
     */
    public void setfAddress(String fAddress) {
        this.fAddress = fAddress;
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
     * @return F_CREATORTIME
     */
    public Date getfCreatortime() {
        return fCreatortime;
    }

    /**
     * @param fCreatortime
     */
    public void setfCreatortime(Date fCreatortime) {
        this.fCreatortime = fCreatortime;
    }

    /**
     * @return F_CREATORUSERID
     */
    public String getfCreatoruserid() {
        return fCreatoruserid;
    }

    /**
     * @param fCreatoruserid
     */
    public void setfCreatoruserid(String fCreatoruserid) {
        this.fCreatoruserid = fCreatoruserid;
    }

    /**
     * @return F_LASTMODIFYTIME
     */
    public Date getfLastmodifytime() {
        return fLastmodifytime;
    }

    /**
     * @param fLastmodifytime
     */
    public void setfLastmodifytime(Date fLastmodifytime) {
        this.fLastmodifytime = fLastmodifytime;
    }

    /**
     * @return F_LASTMODIFYUSERID
     */
    public String getfLastmodifyuserid() {
        return fLastmodifyuserid;
    }

    /**
     * @param fLastmodifyuserid
     */
    public void setfLastmodifyuserid(String fLastmodifyuserid) {
        this.fLastmodifyuserid = fLastmodifyuserid;
    }

    /**
     * @return F_DELETETIME
     */
    public Date getfDeletetime() {
        return fDeletetime;
    }

    /**
     * @param fDeletetime
     */
    public void setfDeletetime(Date fDeletetime) {
        this.fDeletetime = fDeletetime;
    }

    /**
     * @return F_DELETEUSERID
     */
    public String getfDeleteuserid() {
        return fDeleteuserid;
    }

    /**
     * @param fDeleteuserid
     */
    public void setfDeleteuserid(String fDeleteuserid) {
        this.fDeleteuserid = fDeleteuserid;
    }
}