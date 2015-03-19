package com.grande.blackjack.jsonMessages;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

import org.apache.struts2.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;

import edu.uclm.esi.common.jsonMessages.JSONMessage;
import edu.uclm.esi.common.jsonMessages.JSONable;

public class Black_JackBoardMessage extends JSONMessage {

	@JSONable
	private String baraja;
	@JSONable
	private ArrayList<String> players=new ArrayList<String> ();
	/*
	 * @JSONable private String player2;
	 * 
	 * @JSONable private String player3;
	 * 
	 * @JSONable private String player4;
	 * 
	 * @JSONable private String player5;
	 * 
	 * @JSONable private String player6;
	 */
	@JSONable
	private String userWithTurn;

	public final JSONObject toJSONObject()  {
		
		JSONObject result=new JSONObject();
		try {
			result.put("type", "Black_JackBoardMessage");
			result.put("baraja",baraja);
			result.put("players",new JSONArray(players));
		} catch (org.json.JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	// board+listajugadores+turno
	public Black_JackBoardMessage(String board) {
		super(false);
		StringTokenizer st = new StringTokenizer(board, "#");
	
		this.baraja = st.nextToken();
		this.players.add(st.nextToken())  ;
		/*for (int i = 1; i < players.length; i++) {
			if (st.hasMoreTokens()) {
				this.players[i] = st.nextToken();
			}
		}*/
		for(int i=1;i<st.countTokens()-2;i++){
			if(st.hasMoreTokens()){
				this.players.add(st.nextToken());
			}
		}
		if (st.hasMoreTokens()) {
			this.userWithTurn = st.nextToken();
		}
	}

	public Black_JackBoardMessage(JSONObject jso) throws JSONException, org.json.JSONException{
		super(false);
		this.baraja=jso.getString("baraja");
		this.players.add(jso.getString("player1"));
		for(int i=2;i>jso.length();i++){
			this.players.add(jso.getString("player"+i));	
		}
		this.userWithTurn=jso.getString("userWithTurn");
	}
	
	public String getBaraja() {
		return baraja;
	}

	public ArrayList<String> getPlayers() {
		return players;
	}
	public String getUserWithTurn() {
		return userWithTurn;
	}
}
