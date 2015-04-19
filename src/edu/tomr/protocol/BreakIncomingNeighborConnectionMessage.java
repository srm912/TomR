package edu.tomr.protocol;

import java.util.ArrayList;

import org.codehaus.jackson.annotate.JsonProperty;

public class BreakIncomingNeighborConnectionMessage extends Message {

	@JsonProperty private String msg;

	private BreakIncomingNeighborConnectionMessage() {}

	public BreakIncomingNeighborConnectionMessage(String msg) {

		this.msg = msg;
	}
}
