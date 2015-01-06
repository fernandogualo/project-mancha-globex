package org.Iteracion4;

import static org.junit.Assert.*;

import javax.swing.JTextField;

import org.junit.Test;

import dominio.GestorDeuda;
import dominio.GestorGastoIngreso;
import Persistencia.*;
import junit.*;

public class TestIteracion4 {
	
	@Test
	public void TestcomprobarCantidad() throws Exception{
		GestorDeuda gd=new GestorDeuda();
		boolean a;		
		a=gd.comprobarCantidad(new JTextField("1000"));
		assertTrue(a==true);
	}
	
	@Test
	public void TestIntroducirDeuda() throws Exception{
		GestorDeuda gd=new GestorDeuda();
		boolean a;
		a=gd.introducirDeuda(1000, "a", "prueba");
		assertTrue(a==true);
	}
	
	
	
	@Test
	public void TestcomprobarCantidad2() throws Exception{
		GestorGastoIngreso ggi=new GestorGastoIngreso();
		boolean a= ggi.comprobarCantidad(new JTextField("1000"));
		assertTrue(a==true);
	}
	
	@Test
	public void TestintroducirGastoIngreso() throws Exception{
		GestorGastoIngreso ggi=new GestorGastoIngreso();
		boolean a= ggi.introducirGastoIngreso(1000, "a");
		assertTrue(a==true);
	}

}
