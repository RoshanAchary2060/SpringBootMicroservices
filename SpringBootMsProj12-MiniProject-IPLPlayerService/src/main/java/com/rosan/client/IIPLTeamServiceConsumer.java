package com.rosan.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rosan.model.IplTeamInfo;

@FeignClient(name = "TEAM-SERVICE")
public interface IIPLTeamServiceConsumer {
	@GetMapping("/team/find/{id}")
	public ResponseEntity<IplTeamInfo> findIPLTeamById(@PathVariable Integer id);
}
