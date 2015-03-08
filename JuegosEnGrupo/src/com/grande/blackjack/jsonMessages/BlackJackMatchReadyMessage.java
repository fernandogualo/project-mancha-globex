package com.grande.blackjack.jsonMessages;

import edu.uclm.esi.common.jsonMessages.JSONMessage;
import edu.uclm.esi.common.jsonMessages.JSONable;

public class BlackJackMatchReadyMessage extends JSONMessage {

	@JSONable
	private String player1;
	@JSONable
	private String player2;

	public BlackJackMatchReadyMessage(String player1, String player2) {
		super(false);
		this.player1 = player1;
		this.player2 = player2;
		// TODO Auto-generated constructor stub
	}

	public String getPlayer1() {
		return player1;
	}

	public String getPlayer2() {
		return player2;
	}
}
