/**
 * 
 */
package com.system.service.sys.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.bean.sys.SysRole;
import com.system.dao.sourceManage.sys.SysRoleMapper;
import com.system.service.sys.SysRoleService;
import com.system.util.distributedUUID.Sid;


@Service("sysRoleService")
public class SysRoleServiceServiceImpl implements SysRoleService {

	@Autowired
	private SysRoleMapper sysRoleMapper;
	
	@Resource
	private Sid sid;

	
	/**
	 * 新增角色
	 */
	@Override
	public int addSysRole(SysRole sysRole) {
		sysRole.setfId(sid.nextShort());
		return sysRoleMapper.insert(sysRole);
	}



	

}
