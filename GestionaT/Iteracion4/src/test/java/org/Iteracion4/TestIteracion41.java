package org.Iteracion4;
import static org.junit.Assert.*;

import org.junit.Test;

import dominio.GestorDeuda;


public class TestIteracion41 {
	@Test
	public void TestIntroducirDeuda() throws Exception{
		GestorDeuda gd=new GestorDeuda();
		boolean a;
		try{
			a=gd.introducirDeuda(1000, "b", "prueba");
		}catch(Exception e){}
		finally{
			assertTrue(false);
		}
		
	}
}
