package com.grande.blackjack.jsonMessages;
import edu.uclm.esi.common.jsonMessages.JSONMessage;
import edu.uclm.esi.common.jsonMessages.JSONable;
public class BlackJackMovement extends JSONMessage {

	@JSONable
	private String tipoMovimiento;
	public BlackJackMovement(String tipoMovimiento) {
		super(true);
		this.tipoMovimiento=tipoMovimiento;
		// TODO Auto-generated constructor stub
	}

}
