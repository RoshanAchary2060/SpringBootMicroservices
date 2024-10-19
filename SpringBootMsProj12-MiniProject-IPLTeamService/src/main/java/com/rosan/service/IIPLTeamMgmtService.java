package com.rosan.service;

import java.util.List;

import com.rosan.model.IplTeamInfo;

public interface IIPLTeamMgmtService {

	public String registerIplTeam(IplTeamInfo info);

	public IplTeamInfo findIplTeamDetails(int teamId);
	
	public List<IplTeamInfo> findAllIPLTeamDetails();
}
