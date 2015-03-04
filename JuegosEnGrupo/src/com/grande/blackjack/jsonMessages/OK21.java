package com.grande.blackjack.jsonMessages;

import org.json.JSONArray;

import edu.uclm.esi.common.jsonMessages.JSONable;
import edu.uclm.esi.common.jsonMessages.OKMessage;

public class OK21 extends OKMessage {
	@JSONable
	protected JSONArray players;
	public OK21(JSONArray additionalInfo, JSONArray players) {
		super(additionalInfo);
		this.players=players;
	}
	
	public JSONArray getPlayers() {
		return players;
	}
}
