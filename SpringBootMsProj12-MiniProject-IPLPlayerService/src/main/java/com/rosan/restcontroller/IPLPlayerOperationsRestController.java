package com.rosan.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rosan.model.IPLPlayerInfo;
import com.rosan.service.IPlayerMgmtService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/player")
@Slf4j
public class IPLPlayerOperationsRestController {

	@Autowired
	private IPlayerMgmtService service;

	@PostMapping("/save")
	public ResponseEntity<String> saveIPLPlayer(@RequestBody IPLPlayerInfo player) {
		// use service
		String resultMsg = service.registerPlayer(player);
		log.info("Player details are saved with id :: " + player.getPid());
		return ResponseEntity.ok(resultMsg);
	}

	@GetMapping("/all")
	public ResponseEntity<List<IPLPlayerInfo>> fetchAllPlayersInfo() {
		// use service
		List<IPLPlayerInfo> list = service.findAllPlayerInfo();
		log.info("Retrieving all players info");
		return ResponseEntity.ok(list);
	}
}
