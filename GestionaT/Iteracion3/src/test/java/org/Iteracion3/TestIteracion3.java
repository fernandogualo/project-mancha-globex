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
	public void TestBorrarEtiqueta() throws Exception{
		String SQL="DELETE FROM gestionat.etiqueta WHERE TIPO='prueba';";
		AgenteBBDD agente=AgenteBBDD.getAgente();
		int rs=agente.delete(SQL);
		boolean a;
		if(rs==0){
			a= false;
		}else{
			a=true;
		}
		assertTrue(a==true);
	}
	
	@Test
	public void TestregitrarEtiqueta() throws Exception{
		GestorEtiqueta ge=new GestorEtiqueta();
		boolean a;		
		a=ge.regitrarEtiqueta("prueba2");
		assertTrue(a==true);
	}
	
	@Test
	public void TestBorrarEtiqueta2() throws Exception{
		String SQL="DELETE FROM gestionat.etiqueta WHERE TIPO='prueba';";
		AgenteBBDD agente=AgenteBBDD.getAgente();
		int rs=agente.delete(SQL);
		boolean a;
		if(rs==0){
			a= false;
		}else{
			a=true;
		}
		assertTrue(a==true);
	}
	
	@Test
	public void TestregitrarEtiqueta2() throws Exception{
		GestorEtiqueta ge=new GestorEtiqueta();
		boolean a;
		a=ge.regitrarEtiqueta("prueba2", "prueba2");
		assertTrue(a==true);
	}
	
	@Test
	public void TestcomprobarEtiqueta() throws Exception{
		GestorEtiqueta ge=new GestorEtiqueta();
		boolean a= ge.comprobarEtiqueta("prueba2");
		assertTrue(a==true);
	}

}