package com.hisign.framework.sys.api.service;

import java.util.List;

import com.hisign.framework.common.model.JsonResult;
import com.hisign.framework.sys.api.model.SysOrgInfo;

public interface SysOrgInfoService {

	List<SysOrgInfo> queryListByCondition(SysOrgInfo info);

	SysOrgInfo getOrgInfoByID(String orgId);

	JsonResult add(SysOrgInfo info);
    JsonResult update(SysOrgInfo info);

	void deleteByKey(String orgId);

	List<SysOrgInfo> getOrgTreeListBySuperId(String superId);
	
	public SysOrgInfo getOrgInfoByName(String name);
	
	List<SysOrgInfo> getOrgNotIn(List<String> orgIds);
	
	public List<SysOrgInfo> getOrgIn(List<String> orgIds);

}