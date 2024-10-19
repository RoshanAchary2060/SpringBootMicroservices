package com.rosan.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class IPLPlayerInfo {

	@Id
	@GeneratedValue
	private Integer pid;
	@Column(length = 20)
	private String pname;
	@Column(length = 20)
	private String role;
	private Integer jersyNo;
	@ManyToOne(targetEntity = IplTeamInfo.class, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "team_id", referencedColumnName = "teamId")
	private IplTeamInfo team;

}
