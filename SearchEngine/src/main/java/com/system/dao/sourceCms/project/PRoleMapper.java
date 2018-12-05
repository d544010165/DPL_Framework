package com.system.dao.sourceCms.project;

import com.system.bean.project.PRole;
import com.system.util.generate.MyMapper;

public interface PRoleMapper extends MyMapper<PRole> {

	//通过用户名查找角色
	PRole selectRoleByName(String f_account);

	//通过角色名查找角色
	PRole selectRoleByRoleName(String roleName);

}