package org.Iteracion3;

import static org.junit.Assert.*;

import javax.swing.JTextField;

import org.junit.Test;

import dominio.Etiqueta;
import dominio.GestorEtiqueta;
import Persistencia.*;
import junit.*;

public class TestIteracion3 {
	
	@Test
	public void TestregitrarEtiqueta() throws Exception{
		GestorEtiqueta ge=new GestorEtiqueta();
		boolean a;		
		a=ge.regitrarEtiqueta("prueiba");
		assertTrue(a==true);
	}
	
	@Test
	public void TestregitrarEtiqueta2() throws Exception{
		GestorEtiqueta ge=new GestorEtiqueta();
		boolean a;
		a=ge.regitrarEtiqueta("prueba1", "prueba2");
		assertTrue(a==true);
	}
	
	@Test
	public void TestcomprobarEtiqueta() throws Exception{
		GestorEtiqueta ge=new GestorEtiqueta();
		boolean a= ge.comprobarEtiqueta("prueba");
		assertTrue(a==true);
	}

}
