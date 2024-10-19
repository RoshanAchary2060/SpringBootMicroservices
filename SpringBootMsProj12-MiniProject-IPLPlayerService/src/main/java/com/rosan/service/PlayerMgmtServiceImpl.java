package com.rosan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosan.client.IIPLTeamServiceConsumer;
import com.rosan.model.IPLPlayerInfo;
import com.rosan.model.IplTeamInfo;
import com.rosan.repo.IIplPlayerInfoRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PlayerMgmtServiceImpl implements IPlayerMgmtService {
	@Autowired
	private IIplPlayerInfoRepo playerRepo;

	@Autowired
	private IIPLTeamServiceConsumer consumer;

	@Override
	public String registerPlayer(IPLPlayerInfo player) {
		// Consumer MS is consuming Producer MS service through Feign Client
		IplTeamInfo team = consumer.findIPLTeamById(player.getTeam().getTeamId()).getBody();
		log.info("TeamInfo is gathered from other Producer MS");
		// assign team object to player object
		player.setTeam(team);
		int idVal = playerRepo.save(player).getPid();
		log.info("Player and his team details are saved");
		return "Player and his team details are saved having player id :: " + idVal;
	}

	@Override
	public List<IPLPlayerInfo> findAllPlayerInfo() {
		log.info("All players info is gathered");
		return playerRepo.findAll();
	}

}
