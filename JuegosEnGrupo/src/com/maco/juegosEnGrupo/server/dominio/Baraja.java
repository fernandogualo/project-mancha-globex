package com.maco.juegosEnGrupo.server.dominio;

public class Baraja {
	private Carta[] cartas = new Carta[52];

	public Baraja() {
		Carta c = null;
		int cont = 0;
		String[] palos = { "treboles", "picas", "diamantes", "corazones" };
		for (String palo : palos) {
			for (int i = 1; i <= 13; i++) {
				c = new Carta(palo, i);
				cartas[cont++] = c;
			}
		}
	}
}
