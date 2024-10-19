package com.rosan.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActorInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer actorId;
	private String actorName;
	private String actroAddrs;

}
