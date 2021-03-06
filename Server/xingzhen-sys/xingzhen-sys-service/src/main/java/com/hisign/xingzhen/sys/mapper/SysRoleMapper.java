package com.hisign.xingzhen.sys.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hisign.xingzhen.sys.api.model.SysModule;
import com.hisign.xingzhen.sys.api.model.SysPermission;
import com.hisign.xingzhen.sys.api.model.SysRole;
import com.hisign.xingzhen.sys.api.model.SysRolePermis;
import com.hisign.xingzhen.sys.api.model.SysUserRole;


/**
 * @author liangqifu
 *
 * 2017年3月29日
 */
public interface SysRoleMapper {
    /**
     * 根据用户id获得角色列表
     * @param userId
     * @return
     */
    List<SysRole> findSysRoleListByUserId(String userId);

    /**
     * 根据查询条件获得角色列表
     * @param filter
     * @return
     */
    List<SysRole> findSysRoleByFilter(SysRole filter);

    /**
     * 获得列表数量
     * @param filter
     * @return
     */
    int findSysRoleByFilterForCount(SysRole filter);

    /**
     * 删除角色
     * @param id
     */
    void deleteSysRoleById(String id);

    /**
     * 删除角色权限表数据
     * @param map
     */
    void deleteSysRolePermisByRoleId(Map<String, Object> map);

    /**
     * 删除用户角色表数据
     * @param id
     */
    void deleteSysUserRoleByRoleId(String id);

    /**
     * 获得角色列表
     * @param sysRole 角色信息
     * @return 角色列表
     */
    SysRole findSysRoleById(String id);

    /**
     * 新增角色
     * @param sysRole 角色信息
     */
    void insertSysRole(SysRole sysRole);

    /**
     * 更新角色列表
     * @param sysRole 角色信息
     */
    void updateSysRoleById(SysRole sysRole);

    /**
     * 用户角色表新增数据
     * @param userRole
     */
    void insertSysUserRole(SysUserRole userRole);

    /**
     * 获得用户角色数据
     * @param sysUserRole 角色数据查询条件
     * @return 角色数据
     */
    SysUserRole findUserRoleByUserRoleId(SysUserRole sysUserRole);

    /**
     * 删除用户角色数据
     * @param map
     */
    void deleteUserRoleByUserRoleId(Map<String, Object> map);

    /**
     * 获得所有模块
     * @return
     */
    List<SysModule> findALLSysModule();

    /**
     * 获得权限列表
     * @param moduleId
     * @return
     */
    List<SysPermission> findSysPermissionListByFilter(String moduleId);

    /**
     * 通过过滤条件获得角色权限数据
     * @param sysRolePermis
     * @return
     */
    List<SysRolePermis> findSysRolePermisListByFilter(SysRolePermis sysRolePermis);

    /**
     * 根据父id获得系统模块
     * @param moduleId
     * @return
     */
    List<SysModule> findSysModuleByParentId(String moduleId);

    /**
     * 新增角色权限数据
     * @param sysRolePermis 角色权限数据
     */
    void insertSysRolePermis(List<SysRolePermis> list);

    /**
     * 获得字典角色数据
     * @return 字典角色数据
     */
    List<SysRole> findAllRole();

	int checkExistByRoleName(@Param("roleName") String roleName);
	
	SysRole findRoleByRoleName(String roleName);
}
