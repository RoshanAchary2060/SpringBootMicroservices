package com.rosan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "IPL_TEAM_INFO")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class IplTeamInfo {
	@Id
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "gen1", sequenceName = "TEAM_ID_SEQ", initialValue = 1000, allocationSize = 1)
	private Integer teamId;
	@Column(length = 20)
	private String teamName;
	@Column(length = 20)
	private String location;
	@Column(length = 20)
	private String owner;
	@Column(length = 20)
	private String captain;
}
