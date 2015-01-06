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
		GestorEtiqueta ge=new GestorEtiqueta();
		boolean a= ge.comprobarEtiqueta("prueba2");
		System.out.println("5");
		assertFalse(a==true);
	}
	
	@Test
	public void TestregitrarEtiqueta() throws Exception{
		String SQL="DELETE FROM gestionat.etiqueta WHERE TIPO='prueba';";
		AgenteBBDD agente=AgenteBBDD.getAgente();
		System.out.println("3");
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
	public void TestBorrarEtiqueta2() throws Exception{
		GestorEtiqueta ge=new GestorEtiqueta();
		boolean a;		
		a=ge.regitrarEtiqueta("prueba2");
		System.out.println("2");
		assertTrue(a==true);
	}
	
	@Test
	public void TestregitrarEtiqueta2() throws Exception{
		GestorEtiqueta ge=new GestorEtiqueta();
		boolean a;
		a=ge.regitrarEtiqueta("prueba", "prueba");
		System.out.println("4");
		assertTrue(a==true);
	}
	
	@Test
	public void TestcomprobarEtiqueta() throws Exception{
		String SQL="DELETE FROM gestionat.etiqueta WHERE TIPO='prueba2';";
		AgenteBBDD agente=AgenteBBDD.getAgente();
		System.out.println("1");
		int rs=agente.delete(SQL);
		boolean a;
		if(rs==0){
			a= false;
		}else{
			a=true;
		}
		assertTrue(a==true);
	}

}
