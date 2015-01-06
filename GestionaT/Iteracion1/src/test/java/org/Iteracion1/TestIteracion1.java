package org.Iteracion1;

import static org.junit.Assert.*;

import java.sql.ResultSet;

import javax.swing.JTextField;

import org.junit.Test;

import Dominio.*;
import Persistencia.*;
import junit.*;

public class TestIteracion1 {
	
	@Test
	public void TestContrasena(){
		GestorRegistrarse gr=new GestorRegistrarse();
		boolean res=gr.comprobarContrasena(new JTextField("12345"));
		assertTrue(res==true);
	}
	
	@Test
	public void TestDNI(){
		GestorRegistrarse gr=new GestorRegistrarse();
		boolean res=gr.comprobarDNI(new JTextField("06274595B"));
		assertTrue(res==true);
	}
	
	@Test
	public void Testemail(){
		GestorRegistrarse gr=new GestorRegistrarse();
		boolean res=gr.comprobarEmail(new JTextField("albertogrca@gmail.com"));
		assertTrue(res==true);
	}
	
	@Test
	public void TestComprobarUsuario() throws Exception{
		GestorUsuario gu=new GestorUsuario();
		boolean res=gu.comprobarUsuario("1", "1234");
		assertTrue(res==true);
	}
	
	
	@Test
	public void TestBorrarUsuario() throws Exception{
		String SQL="DELETE FROM gestionat.usuario WHERE DNI='prueba2';";
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
	public void TestRegistrar() throws Exception{
		GestorUsuario gu=new GestorUsuario();
		boolean res=gu.regitrar("prueba2", "prueba2", "prueba2", "prueba2", "prueba2");
		assertTrue(res==true);
	}

}