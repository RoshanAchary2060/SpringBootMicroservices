package com.rosan.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rosan.model.IplTeamInfo;
import com.rosan.service.IIPLTeamMgmtService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/team")
@Slf4j
public class IPLTeamOperationsController {

//	private Logger logger = LoggerFactory.getLogger(IPLTeamOperationsController.class);

	@Autowired
	private IIPLTeamMgmtService service;

	@PostMapping("/save")
	public ResponseEntity<String> saveIplTeam(@RequestBody IplTeamInfo info) {
		String resultMsg = service.registerIplTeam(info);
//		logger.info("saving IPL Team");
		log.info("saving IPL Team");

		return ResponseEntity.ok(resultMsg);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<IplTeamInfo> fetchTeamInfoById(@PathVariable Integer id) {
		IplTeamInfo info = service.findIplTeamDetails(id);
//		logger.info("Fetching IPL Team details by id" + id);
		log.info("Fetching IPL Team details by id" + id);

		return ResponseEntity.ok(info);
	}

	@GetMapping("/all")
	public ResponseEntity<List<IplTeamInfo>> fetchAllTeamsInfo() {
		List<IplTeamInfo> teamsList = service.findAllIPLTeamDetails();
//		logger.info("Fetching all IPL Teams Details");
		log.info("Fetching all IPL Teams Details");

		return ResponseEntity.ok(teamsList);
	}

}
