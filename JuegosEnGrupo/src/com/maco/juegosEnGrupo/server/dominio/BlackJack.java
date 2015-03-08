package com.maco.juegosEnGrupo.server.dominio;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

import com.grande.blackjack.jsonMessages.Black_JackBoardMessage;
import com.maco.tresenraya.jsonMessages.BlackJackWaitingMessage;
import com.maco.tresenraya.jsonMessages.TresEnRayaBoardMessage;
import com.maco.tresenraya.jsonMessages.TresEnRayaMovement;
import com.maco.tresenraya.jsonMessages.TresEnRayaWaitingMessage;

import edu.uclm.esi.common.jsonMessages.JSONMessage;
import edu.uclm.esi.common.server.domain.User;
import edu.uclm.esi.common.server.sockets.Notifier;

public class BlackJack extends Match {
	public static int BLACK_JACK = 2;
	public static User userWithTurn;
	private Baraja[] baraja;

	public BlackJack(Game game) {
		super(game);
		baraja = new Baraja[6];
		for (int b = 0; b < baraja.length; b++) {
			baraja[b] = new Baraja();
		}
		// Hacer un metodo que barajee
		// Se barajeara una vez vaya a comenzar la partida
		// Cuando esten todos los jugadores o pasen lo 30s.
	}

	@Override
	protected void postAddUser(User user) {
		// TODO Auto-generated method stub
		if (this.players.size() == 2) {
			// Ahora mismo solo con dos jugadores
			JSONMessage jsTurn = new BlackJackWaitingMessage(
					"Match ready. You have the turn.");
			JSONMessage jsNoTurn = new BlackJackWaitingMessage(
					"Match ready. Wait for the opponent to move.");

			this.userWithTurn = this.players.get(0);
			try {
				Notifier.get().post(this.players.get(0), jsTurn);
				Notifier.get().post(this.players.get(1), jsNoTurn);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// tenemos los turnos asignados

			try {// Notificamos la actualizacion del tablero
				JSONMessage jsBoard = new Black_JackBoardMessage(
						this.toString());
				Notifier.get().post(this.players.get(0), jsBoard);
				Notifier.get().post(this.players.get(1), jsBoard);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else { // falta el reloj
			JSONMessage jsm = new BlackJackWaitingMessage(
					"Waiting for one more player");
			try {
				Notifier.get().post(this.players.get(0), jsm);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean isTheTurnOf(User user) {
		// TODO Auto-generated method stub
		return this.userWithTurn.equals(user);
	}

	@Override
	protected void postMove(User user, JSONObject jsoMovement) throws Exception {
		// TODO Auto-generated method stub
		if (!jsoMovement.get("type").equals(
				TresEnRayaMovement.class.getSimpleName())) {
			throw new Exception("Unexpected type of movement");
		}
		//////Si has seleccionado pedir carta comprobar restriccion
		/////	y dar la carta
		/////Si has seleccionado plantarte pasar turno
	}

	@Override
	protected void updateBoard(int row, int col, JSONMessage result)
			throws JSONException, IOException {
		if (result == null) {
			if (this.userWithTurn.equals(this.players.get(0))) {
				// ///Aqui iria el dar carta y la funcionalidad del boton
				// ///quiero carta
				this.userWithTurn = this.players.get(1);
			} else {

				this.userWithTurn = this.players.get(0);
			}
			result = new TresEnRayaBoardMessage(this.toString());
			Notifier.get().post(this.players, result);
		}
		// TODO Auto-generated method stub

	}

}
