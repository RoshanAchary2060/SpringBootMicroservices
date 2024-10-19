package com.rosan.service;

import java.util.List;

import com.rosan.model.IPLPlayerInfo;

public interface IPlayerMgmtService {

	public String registerPlayer(IPLPlayerInfo player);

	public List<IPLPlayerInfo> findAllPlayerInfo();
}
