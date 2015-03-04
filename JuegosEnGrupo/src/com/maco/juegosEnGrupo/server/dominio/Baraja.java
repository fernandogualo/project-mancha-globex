package com.maco.juegosEnGrupo.server.dominio;

public class Baraja {
	private Carta [] baraja=new Carta[52];
	public Baraja() {
		Carta c = null;
		int cont = 0;
		for(int i=0;i<baraja.length;i++, cont++){
			c = new Carta("treboles", (i+1));
			baraja[cont] = c;
		}
		
		for(int i = 0; i < baraja.length; i++, cont++){
			c = new Carta("picas", (i + 1));
			baraja[cont] = c;
		}
		
		for(int i = 0; i < baraja.length; i++, cont++){
			c = new Carta("diamantes", (i + 1));
			baraja[cont] = c;
		}
		
		for(int i = 0; i < baraja.length; i++, cont++){
			c = new Carta("corazones", (i + 1));
			baraja[cont] = c;
		}
	}
}
