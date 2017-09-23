package com.ldu.mapper;

import java.util.List;

import com.ldu.po.GroupInfo;

public interface GroupInfoMapper {
	public GroupInfo selectGroups(int groupId);
	public List<GroupInfo> selectGroupByUserId(int UserId);
}
