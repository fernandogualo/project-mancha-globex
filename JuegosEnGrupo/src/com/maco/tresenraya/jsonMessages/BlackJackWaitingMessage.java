package com.maco.tresenraya.jsonMessages;

import edu.uclm.esi.common.jsonMessages.JSONMessage;
import edu.uclm.esi.common.jsonMessages.JSONable;

public class BlackJackWaitingMessage extends JSONMessage {
	@JSONable
	private String text;

	public BlackJackWaitingMessage(String text) {
		super(false);
		// TODO Auto-generated constructor stub
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

}
