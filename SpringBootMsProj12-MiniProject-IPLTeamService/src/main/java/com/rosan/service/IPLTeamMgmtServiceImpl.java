package com.rosan.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosan.model.IplTeamInfo;
import com.rosan.repo.IIPLTeamInfoRepo;

@Service
public class IPLTeamMgmtServiceImpl implements IIPLTeamMgmtService {

	private Logger logger = LoggerFactory.getLogger(IPLTeamMgmtServiceImpl.class);

	@Autowired
	private IIPLTeamInfoRepo repo;

	@Override
	public String registerIplTeam(IplTeamInfo info) {
		int idVal = repo.save(info).getTeamId();
		logger.info("IPL Team is registered successfully with id ::" + idVal);
		return "Team is registered with id :: " + idVal;
	}

	@Override
	public IplTeamInfo findIplTeamDetails(int teamId) {
		logger.info("Getting IPL Team info by id :: " + teamId);
		return repo.findById(teamId).get();
	}

	@Override
	public List<IplTeamInfo> findAllIPLTeamDetails() {

		logger.info("Getting all IPL Team details");
		return repo.findAll();
	}
}
