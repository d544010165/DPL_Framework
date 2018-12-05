/*
Navicat MySQL Data Transfer

Source Server         : dpl
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : project

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2018-12-05 14:53:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for p_organize
-- ----------------------------
DROP TABLE IF EXISTS `p_organize`;
CREATE TABLE `p_organize` (
  `F_ID` varchar(50) NOT NULL COMMENT '主键id',
  `F_PARENTID` varchar(50) DEFAULT NULL COMMENT '父级',
  `F_LAYERS` decimal(8,0) DEFAULT NULL COMMENT '层次',
  `F_ENCODE` varchar(50) DEFAULT NULL COMMENT '编码',
  `F_FULLNAME` varchar(50) DEFAULT NULL COMMENT '名称',
  `F_SHORTNAME` varchar(50) DEFAULT NULL COMMENT '简称',
  `F_CATEGORYID` varchar(50) DEFAULT NULL COMMENT '分类',
  `F_MANAGERID` varchar(50) DEFAULT NULL COMMENT '负责人',
  `F_TELEPHONE` varchar(20) DEFAULT NULL COMMENT '电话',
  `F_MOBILEPHONE` varchar(20) DEFAULT NULL COMMENT '手机',
  `F_WECHAT` varchar(50) DEFAULT NULL COMMENT '微信',
  `F_FAX` varchar(20) DEFAULT NULL COMMENT '传真',
  `F_EMAIL` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `F_AREAID` varchar(50) DEFAULT NULL COMMENT '归属区域',
  `F_ADDRESS` varchar(500) DEFAULT NULL COMMENT '详细地址',
  `F_SORTCODE` decimal(8,0) DEFAULT NULL COMMENT '排序码',
  `F_DELETEMARK` decimal(8,0) DEFAULT '0' COMMENT '删除标志',
  `F_ENABLEDMARK` decimal(8,0) DEFAULT '1' COMMENT '有效标志',
  `F_DESCRIPTION` varchar(4000) DEFAULT NULL COMMENT '描述',
  `F_CREATORTIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `F_CREATORUSERID` varchar(50) DEFAULT NULL,
  `F_LASTMODIFYTIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `F_LASTMODIFYUSERID` varchar(50) DEFAULT NULL,
  `F_DELETETIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `F_DELETEUSERID` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`F_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of p_organize
-- ----------------------------

-- ----------------------------
-- Table structure for p_role
-- ----------------------------
DROP TABLE IF EXISTS `p_role`;
CREATE TABLE `p_role` (
  `F_ID` varchar(50) NOT NULL,
  `F_ORGANIZEID` varchar(50) DEFAULT NULL COMMENT '组织主键',
  `F_CATEGORY` decimal(8,0) DEFAULT NULL COMMENT '分类:1-角色2-岗位',
  `F_ENCODE` varchar(50) DEFAULT NULL COMMENT '编号',
  `F_FULLNAME` varchar(50) DEFAULT NULL COMMENT '名称',
  `F_RESPONSIBILITY` varchar(4000) DEFAULT NULL COMMENT '岗位职责',
  `F_SORTCODE` decimal(8,0) DEFAULT NULL COMMENT '排序码',
  `F_DELETEMARK` decimal(8,0) DEFAULT '0' COMMENT '删除标志',
  `F_ENABLEDMARK` decimal(8,0) DEFAULT '1' COMMENT '有效标志',
  `F_DESCRIPTION` varchar(500) DEFAULT NULL COMMENT '描述',
  `F_CREATORTIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `F_CREATORUSERID` varchar(50) DEFAULT NULL COMMENT '创建用户',
  `F_LASTMODIFYTIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '最后修改时间',
  `F_LASTMODIFYUSERID` varchar(50) DEFAULT NULL COMMENT '最后修改用户',
  `F_DELETETIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '删除时间',
  `F_DELETEUSERID` varchar(50) DEFAULT NULL COMMENT '删除用户',
  PRIMARY KEY (`F_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of p_role
-- ----------------------------
INSERT INTO `p_role` VALUES ('1', null, null, '001', 'admin', null, '1', '0', '1', '1', '2018-08-20 12:43:57', '1', '2018-11-21 16:18:29', '1', '2018-08-27 09:50:52', '1');
INSERT INTO `p_role` VALUES ('2', '12', '2', '003', 'public', '12', '1', '0', '1', '1231', '2018-09-18 11:09:16', null, '2018-11-21 16:18:29', null, '2018-11-21 16:18:29', null);

-- ----------------------------
-- Table structure for p_user
-- ----------------------------
DROP TABLE IF EXISTS `p_user`;
CREATE TABLE `p_user` (
  `F_ID` varchar(50) NOT NULL,
  `F_ACCOUNT` varchar(50) DEFAULT NULL COMMENT '账户',
  `F_REALNAME` varchar(50) DEFAULT NULL COMMENT '姓名',
  `F_NICKNAME` varchar(50) DEFAULT NULL COMMENT '呢称',
  `F_HEADICON` varchar(50) DEFAULT NULL COMMENT '头像',
  `F_GENDER` decimal(8,0) DEFAULT NULL COMMENT '性别',
  `F_BIRTHDAY` datetime DEFAULT NULL COMMENT '生日',
  `F_MOBILEPHONE` varchar(20) DEFAULT NULL COMMENT '手机',
  `F_EMAIL` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `F_WECHAT` varchar(50) DEFAULT NULL COMMENT '微信',
  `F_MANAGERID` varchar(50) DEFAULT NULL COMMENT '主管主键',
  `F_SECURITYLEVEL` decimal(8,0) DEFAULT NULL COMMENT '安全级别',
  `F_SIGNATURE` varchar(500) DEFAULT NULL COMMENT '个性签名',
  `F_ORGANIZEID` varchar(50) DEFAULT NULL COMMENT '组织主键',
  `F_DEPARTMENTID` varchar(500) DEFAULT NULL COMMENT '部门主键',
  `F_DUTYID` varchar(500) DEFAULT NULL COMMENT '岗位主键',
  `F_JOBNUMBER` varchar(50) DEFAULT NULL COMMENT '工作编号',
  `F_ISADMINISTRATOR` decimal(8,0) DEFAULT NULL COMMENT '是否管理员',
  `F_SORTCODE` decimal(8,0) DEFAULT NULL COMMENT '排序码',
  `F_DELETEMARK` decimal(8,0) DEFAULT '0' COMMENT '0 未删除   1 已删除',
  `F_ENABLEDMARK` decimal(8,0) DEFAULT NULL COMMENT '1有效  0 无效',
  `F_DESCRIPTION` varchar(500) DEFAULT NULL COMMENT '描述',
  `F_CREATORTIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `F_CREATORUSERID` varchar(50) DEFAULT NULL COMMENT '创建用户',
  `F_LASTMODIFYTIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '最后修改时间',
  `F_LASTMODIFYUSERID` varchar(50) DEFAULT NULL COMMENT '最后修改用户',
  `F_DELETETIME` datetime DEFAULT NULL COMMENT '删除时间',
  `F_DELETEUSERID` varchar(500) DEFAULT NULL COMMENT '删除用户',
  `F_PASSWORD` varchar(64) DEFAULT NULL COMMENT '登录密码md5',
  `F_SALT` varchar(255) NOT NULL,
  PRIMARY KEY (`F_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of p_user
-- ----------------------------
INSERT INTO `p_user` VALUES ('181128B7616C3N54', 'dpl1', null, 'dpl', 'dpl', null, '2018-11-05 18:17:31', 'dpl', 'dpl', 'dpl', null, null, null, null, null, null, null, null, null, '0', '1', null, '2018-11-28 15:46:26', null, '2018-11-28 15:46:26', null, null, null, '202CB962AC59075B964B07152D234B70', '');
INSERT INTO `p_user` VALUES ('1811299C510WZ44H', 'aaaa', null, null, 'upload/1811299C510WZ44H-20181205091915.jpg', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', null, '2018-11-29 13:13:12', null, '2018-11-29 13:13:12', null, null, null, '74B87337454200D4D33F80C4663DC5E518112999807691538432', '18112999807691538432');
INSERT INTO `p_user` VALUES ('18113078FFFT13MW', 'd544010165', '邓培林', 'A-dpl', '没有头像', '1', '1997-03-19 00:00:00', '18190738991', '544010165@qq.com', 'peilin0319', null, null, '今天没有签名', null, null, null, null, null, '1', '0', '1', 'hhha', '2018-11-30 10:14:04', null, '2018-11-30 10:35:05', '18113078FFFT13MW', null, null, 'E10ADC3949BA59ABBE56E057F20F883E18113077267512328192', '18113077267512328192');
INSERT INTO `p_user` VALUES ('181130ATN34CHM80', '1111', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', null, '2018-11-30 15:11:48', null, '2018-11-30 15:11:48', null, null, null, 'B59C67BF196A4758191E42F76670CEBA181130114731893391361', '181130114731893391361');
INSERT INTO `p_user` VALUES ('181130B4452KPZC0', 'dengpeilin', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', null, '2018-11-30 15:37:13', null, '2018-11-30 15:37:14', null, null, null, '202CB962AC59075B964B07152D234B70181130117930654171136', '181130117930654171136');

-- ----------------------------
-- Table structure for p_userrole
-- ----------------------------
DROP TABLE IF EXISTS `p_userrole`;
CREATE TABLE `p_userrole` (
  `F_ID` varchar(50) NOT NULL,
  `F_USERID` varchar(50) DEFAULT NULL COMMENT '用户id',
  `F_ROLEID` varchar(50) DEFAULT NULL COMMENT '角色id',
  `F_SORTCODE` decimal(8,0) DEFAULT NULL COMMENT '排序码',
  `F_CREATORTIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `F_CREATORUSERID` varchar(50) DEFAULT NULL COMMENT '创建用户',
  `F_DELETEMARK` decimal(8,0) DEFAULT '0' COMMENT '1 无效  0 有效',
  PRIMARY KEY (`F_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of p_userrole
-- ----------------------------
INSERT INTO `p_userrole` VALUES ('1811299C5113S614', '1811299C510WZ44H', '2', '1', '2018-11-29 13:13:12', null, '0');
INSERT INTO `p_userrole` VALUES ('18113078FFG57PDP', '18113078FFFT13MW', '2', '1', '2018-11-30 10:14:04', null, '0');
INSERT INTO `p_userrole` VALUES ('181130ATN34NBP4H', '181130ATN34CHM80', '2', '1', '2018-11-30 15:11:48', null, '0');
INSERT INTO `p_userrole` VALUES ('181130B4452ZZH6W', '181130B4452KPZC0', '2', '1', '2018-11-30 15:37:13', null, '0');
INSERT INTO `p_userrole` VALUES ('181202A2FNFRTA16', '181202A2FNFRTA14', '2', '1', '2018-12-02 14:08:16', null, '0');
INSERT INTO `p_userrole` VALUES ('181202DGFAPWDP00', '181202DGFAP7C18H', '2', '1', '2018-12-02 18:59:29', null, '0');
INSERT INTO `p_userrole` VALUES ('181202DHCY3PBTR6', '181202DHCY3PBTR4', '2', '1', '2018-12-02 19:02:20', null, '0');
INSERT INTO `p_userrole` VALUES ('181202DHZN50ADWH', '181202DHZN4WYYY8', '2', '1', '2018-12-02 19:03:55', null, '0');
INSERT INTO `p_userrole` VALUES ('181202DK9KPRC1YY', '181202DK9KPRC1YW', '2', '1', '2018-12-02 19:04:59', null, '0');
INSERT INTO `p_userrole` VALUES ('181202DW3Z0Z2DGF', '181202DW3Z0Z2DGC', '2', '1', '2018-12-02 19:25:23', null, '0');
INSERT INTO `p_userrole` VALUES ('999', '181128B7616C3N54', '1', '1', '2018-11-28 18:23:27', null, '0');

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `F_ID` varchar(50) NOT NULL,
  `F_USERID` varchar(50) DEFAULT NULL COMMENT '用户id',
  `F_REALNAME` varchar(50) DEFAULT NULL COMMENT '姓名',
  `F_TYPE` varchar(50) DEFAULT NULL COMMENT '类型',
  `F_IPADDRESS` varchar(50) DEFAULT NULL COMMENT 'IP地址',
  `F_IPADDRESSNAME` varchar(50) DEFAULT NULL COMMENT 'IP所在城市',
  `F_MODULEID` varchar(50) DEFAULT NULL COMMENT '系统模块Id',
  `F_MODULENAME` varchar(50) DEFAULT NULL COMMENT '系统模块',
  `F_RESULT` decimal(8,0) DEFAULT '1' COMMENT '1成功0失败',
  `F_DESCRIPTION` varchar(255) DEFAULT NULL COMMENT '操作日志内容',
  `F_CREATORTIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `F_CREATORUSERID` varchar(50) DEFAULT NULL COMMENT '创建用户',
  `F_KEY` varchar(4000) DEFAULT NULL COMMENT '日志描述关键信息',
  PRIMARY KEY (`F_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_log
-- ----------------------------
INSERT INTO `sys_log` VALUES ('181130B447GTP0M8', '已过滤url', '已过滤url', null, '0:0:0:0:0:0:0:1', null, null, '登录及注册', '1', '用户注册', '2018-11-30 15:37:14', null, null);
INSERT INTO `sys_log` VALUES ('181130BB5DRD539P', '181128B7616C3N54', null, null, '0:0:0:0:0:0:0:1', null, null, '登录及注册', '1', '用户登录', '2018-11-30 15:58:23', null, null);
INSERT INTO `sys_log` VALUES ('181130BB5F3HAB7C', '181128B7616C3N54', null, null, '0:0:0:0:0:0:0:1', null, null, null, '1', '管理员角色主页', '2018-11-30 15:58:23', null, null);
INSERT INTO `sys_log` VALUES ('1812028KA3NTFZHH', '已过滤url', '已过滤url', null, '0:0:0:0:0:0:0:1', null, null, '登录及注册', '0', '用户登录', '2018-12-02 12:04:41', null, null);
INSERT INTO `sys_log` VALUES ('1812028KAKYMP65P', '1811299C510WZ44H', null, null, '0:0:0:0:0:0:0:1', null, null, '登录及注册', '1', '用户登录', '2018-12-02 12:04:44', null, null);
INSERT INTO `sys_log` VALUES ('1812028KAMGHZANC', '1811299C510WZ44H', null, null, '0:0:0:0:0:0:0:1', null, null, null, '1', '公共角色主页', '2018-12-02 12:04:44', null, null);
INSERT INTO `sys_log` VALUES ('1812028KT2WSAY80', '已过滤url', '已过滤url', null, '0:0:0:0:0:0:0:1', null, null, '登录及注册', '0', '用户登录', '2018-12-02 12:06:04', null, null);
INSERT INTO `sys_log` VALUES ('1812028KTFGTYXYW', '已过滤url', '已过滤url', null, '0:0:0:0:0:0:0:1', null, null, '登录及注册', '0', '用户登录', '2018-12-02 12:06:07', null, null);
INSERT INTO `sys_log` VALUES ('1812028KZ0HK7KWH', '已过滤url', '已过滤url', null, '0:0:0:0:0:0:0:1', null, null, '登录及注册', '0', '用户注册', '2018-12-02 12:06:30', null, null);
INSERT INTO `sys_log` VALUES ('1812028M0MZT232W', '已过滤url', '已过滤url', null, '0:0:0:0:0:0:0:1', null, null, '登录及注册', '0', '用户注册', '2018-12-02 12:06:40', null, null);
INSERT INTO `sys_log` VALUES ('181202A2CY467YNC', '已过滤url', '已过滤url', null, '127.0.0.1', '本地', null, '登录及注册', '0', '用户登录', '2018-12-02 14:08:05', null, null);
INSERT INTO `sys_log` VALUES ('181202A2FNWRK30H', '已过滤url', '已过滤url', null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户注册', '2018-12-02 14:08:16', null, null);
INSERT INTO `sys_log` VALUES ('181202DGD26B3WPH', '已过滤url', '已过滤url', null, '127.0.0.1', '本地', null, '登录及注册', '0', '用户注册', '2018-12-02 18:59:21', null, null);
INSERT INTO `sys_log` VALUES ('181202DGDXGX65AW', '已过滤url', '已过滤url', null, '127.0.0.1', '本地', null, '登录及注册', '0', '用户注册', '2018-12-02 18:59:26', null, null);
INSERT INTO `sys_log` VALUES ('181202DGFC1GD8H0', '已过滤url', '已过滤url', null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户注册', '2018-12-02 18:59:29', null, null);
INSERT INTO `sys_log` VALUES ('181202DHCYCAMPBC', '已过滤url', '已过滤url', null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户注册', '2018-12-02 19:02:20', null, null);
INSERT INTO `sys_log` VALUES ('181202DHZNPZ9AW0', '已过滤url', '已过滤url', null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户注册', '2018-12-02 19:03:55', null, null);
INSERT INTO `sys_log` VALUES ('181202DK9M4CZ828', '已过滤url', '已过滤url', null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户注册', '2018-12-02 19:04:59', null, null);
INSERT INTO `sys_log` VALUES ('181202DKTM51ZCZC', '已过滤url', '已过滤url', null, '127.0.0.1', '本地', null, '登录及注册', '0', '用户注册', '2018-12-02 19:06:29', null, null);
INSERT INTO `sys_log` VALUES ('181202DKY1DS0G0H', '已过滤url', '已过滤url', null, '127.0.0.1', '本地', null, '登录及注册', '0', '用户注册', '2018-12-02 19:06:44', null, null);
INSERT INTO `sys_log` VALUES ('181202DM68CH4TTC', '181128B7616C3N54', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-02 19:07:37', null, null);
INSERT INTO `sys_log` VALUES ('181202DM68YYRSK4', '181128B7616C3N54', null, null, '127.0.0.1', '本地', null, null, '1', '管理员角色主页', '2018-12-02 19:07:37', null, null);
INSERT INTO `sys_log` VALUES ('181202DW3ZCXCRGC', '181128B7616C3N54', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户注册', '2018-12-02 19:25:23', null, null);
INSERT INTO `sys_log` VALUES ('181202FA4X97RS80', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-02 20:07:31', null, null);
INSERT INTO `sys_log` VALUES ('181202FA4XNR5N0H', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-02 20:07:31', null, null);
INSERT INTO `sys_log` VALUES ('181202FA5BZGN540', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '用户管理', '1', '用户列表查询', '2018-12-02 20:07:35', null, null);
INSERT INTO `sys_log` VALUES ('18120364F8YZ5PZC', '已过滤url', '已过滤url', null, '127.0.0.1', '本地', null, '登录及注册', '0', '用户登录', '2018-12-03 08:37:57', null, null);
INSERT INTO `sys_log` VALUES ('18120364G2BNY140', '已过滤url', '已过滤url', null, '127.0.0.1', '本地', null, '登录及注册', '0', '用户登录', '2018-12-03 08:38:02', null, null);
INSERT INTO `sys_log` VALUES ('18120364GCP0FA80', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 08:38:05', null, null);
INSERT INTO `sys_log` VALUES ('18120364GCY6FH4H', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 08:38:05', null, null);
INSERT INTO `sys_log` VALUES ('18120384A56X93MW', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 11:25:39', null, null);
INSERT INTO `sys_log` VALUES ('18120384A5CAW3XP', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 11:25:39', null, null);
INSERT INTO `sys_log` VALUES ('18120384ZTB523R4', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 11:27:33', null, null);
INSERT INTO `sys_log` VALUES ('18120385M48B9H28', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 11:29:31', null, null);
INSERT INTO `sys_log` VALUES ('18120385XWBC1DS8', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 11:30:20', null, null);
INSERT INTO `sys_log` VALUES ('18120385XWY1DFCH', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 11:30:20', null, null);
INSERT INTO `sys_log` VALUES ('1812038CPY4HFGF8', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 11:50:50', null, null);
INSERT INTO `sys_log` VALUES ('1812038CPYMA1THH', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 11:50:50', null, null);
INSERT INTO `sys_log` VALUES ('1812038F9K6Y20SW', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 11:55:37', null, null);
INSERT INTO `sys_log` VALUES ('1812038F9KSBAS14', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 11:55:37', null, null);
INSERT INTO `sys_log` VALUES ('1812038MG15GYPPH', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 12:08:13', null, null);
INSERT INTO `sys_log` VALUES ('1812038MG22S651P', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 12:08:13', null, null);
INSERT INTO `sys_log` VALUES ('1812038SPDRR47TC', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 12:20:48', null, null);
INSERT INTO `sys_log` VALUES ('1812038SPFHS037C', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 12:20:48', null, null);
INSERT INTO `sys_log` VALUES ('1812038W1K4KMT9P', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 12:24:47', null, null);
INSERT INTO `sys_log` VALUES ('1812038W1KN72W00', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 12:24:47', null, null);
INSERT INTO `sys_log` VALUES ('1812038WR5GNDP94', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 12:26:53', null, null);
INSERT INTO `sys_log` VALUES ('1812038WR62XZBMW', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 12:26:53', null, null);
INSERT INTO `sys_log` VALUES ('181203A6R5K3S614', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 14:20:59', null, null);
INSERT INTO `sys_log` VALUES ('181203A6R65CZNTC', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 14:20:59', null, null);
INSERT INTO `sys_log` VALUES ('181203B3B4K1B6CH', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 15:34:58', null, null);
INSERT INTO `sys_log` VALUES ('181203B3B53XM8ZC', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 15:34:58', null, null);
INSERT INTO `sys_log` VALUES ('181203C1DKGHYT0H', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 16:53:18', null, null);
INSERT INTO `sys_log` VALUES ('181203C1DM3Y48SW', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 16:53:18', null, null);
INSERT INTO `sys_log` VALUES ('181203C4K381Y894', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 17:02:41', null, null);
INSERT INTO `sys_log` VALUES ('181203C4K3SCG72W', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 17:02:41', null, null);
INSERT INTO `sys_log` VALUES ('181203C53H9ZTZMW', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 17:04:14', null, null);
INSERT INTO `sys_log` VALUES ('181203C53HWZFK40', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 17:04:14', null, null);
INSERT INTO `sys_log` VALUES ('181203C6NRRTBP4H', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 17:08:58', null, null);
INSERT INTO `sys_log` VALUES ('181203C6NSF1S800', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 17:08:58', null, null);
INSERT INTO `sys_log` VALUES ('181203C7TR01G2W0', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 17:12:24', null, null);
INSERT INTO `sys_log` VALUES ('181203C7TRKHTY14', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 17:12:24', null, null);
INSERT INTO `sys_log` VALUES ('181203C90PH0TWPH', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 17:15:56', null, null);
INSERT INTO `sys_log` VALUES ('181203C90R3ZSRP0', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 17:15:56', null, null);
INSERT INTO `sys_log` VALUES ('181203CAR281FG54', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 17:21:07', null, null);
INSERT INTO `sys_log` VALUES ('181203CAR2S58C28', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 17:21:07', null, null);
INSERT INTO `sys_log` VALUES ('181203CBB0CS08DP', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 17:23:02', null, null);
INSERT INTO `sys_log` VALUES ('181203CBB0Z80S5P', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 17:23:03', null, null);
INSERT INTO `sys_log` VALUES ('181203CCR71HR8X4', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 17:27:08', null, null);
INSERT INTO `sys_log` VALUES ('181203CCR7N42428', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 17:27:09', null, null);
INSERT INTO `sys_log` VALUES ('181203CFT4CDWMK4', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 17:33:21', null, null);
INSERT INTO `sys_log` VALUES ('181203CFT4YF70H0', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 17:33:21', null, null);
INSERT INTO `sys_log` VALUES ('181203CHB8X14WSW', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 17:38:05', null, null);
INSERT INTO `sys_log` VALUES ('181203CHB9DPHZC0', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 17:38:05', null, null);
INSERT INTO `sys_log` VALUES ('181203CK9GP5WH00', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 17:40:54', null, null);
INSERT INTO `sys_log` VALUES ('181203CK9H62TB0H', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 17:40:54', null, null);
INSERT INTO `sys_log` VALUES ('181203CKZH9G7NTC', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 17:42:50', null, null);
INSERT INTO `sys_log` VALUES ('181203CKZK0XRG2W', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 17:42:50', null, null);
INSERT INTO `sys_log` VALUES ('181203CRSGDP9400', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 17:54:18', null, null);
INSERT INTO `sys_log` VALUES ('181203CRSGZDWC28', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 17:54:18', null, null);
INSERT INTO `sys_log` VALUES ('181203CX9ZA78BC0', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 18:04:58', null, null);
INSERT INTO `sys_log` VALUES ('181203CX9ZX03Z0H', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 18:04:58', null, null);
INSERT INTO `sys_log` VALUES ('181203FFMMNGG7C0', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 20:21:01', null, null);
INSERT INTO `sys_log` VALUES ('181203FFMN02AK40', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 20:21:01', null, null);
INSERT INTO `sys_log` VALUES ('181203FNBDN2SNC0', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 20:35:15', null, null);
INSERT INTO `sys_log` VALUES ('181203FNBF38018H', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 20:35:15', null, null);
INSERT INTO `sys_log` VALUES ('181203FRW6CC8754', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-03 20:42:37', null, null);
INSERT INTO `sys_log` VALUES ('181203FRW76DTT2W', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-03 20:42:38', null, null);
INSERT INTO `sys_log` VALUES ('1812056CZC21H3HH', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-05 09:03:23', null, null);
INSERT INTO `sys_log` VALUES ('1812056CZCYS5C4H', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-05 09:03:23', null, null);
INSERT INTO `sys_log` VALUES ('1812056DMW3R3KGC', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-05 09:05:28', null, null);
INSERT INTO `sys_log` VALUES ('1812056GDMGTWN7C', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-05 09:10:55', null, null);
INSERT INTO `sys_log` VALUES ('1812056GDND243HH', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-05 09:10:55', null, null);
INSERT INTO `sys_log` VALUES ('1812056GP2Z1W094', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-05 09:11:36', null, null);
INSERT INTO `sys_log` VALUES ('1812056GP3G7KZ54', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-05 09:11:36', null, null);
INSERT INTO `sys_log` VALUES ('1812056HF28DNKGC', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '1', '用户登录', '2018-12-05 09:13:58', null, null);
INSERT INTO `sys_log` VALUES ('1812056HF30D73F8', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, null, '1', '公共角色主页', '2018-12-05 09:13:58', null, null);
INSERT INTO `sys_log` VALUES ('1812058K2D1KSSA8', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '0', '用户登录', '2018-12-05 12:03:52', null, null);
INSERT INTO `sys_log` VALUES ('1812058K2YW7SN2W', '1811299C510WZ44H', null, null, '127.0.0.1', '本地', null, '登录及注册', '0', '用户登录', '2018-12-05 12:03:55', null, null);
