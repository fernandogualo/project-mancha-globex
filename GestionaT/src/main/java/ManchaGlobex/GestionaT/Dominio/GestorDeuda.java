package ManchaGlobex.GestionaT.Dominio;

import javax.swing.JTextField;

public class GestorDeuda {
	public boolean comprobarCantidad(JTextField c) throws NumberFormatException{
		boolean result=false;
		double cant;
		cant=Double.parseDouble(c.getText());
		
		result=true;
		return result;
	}
	
	public boolean ComprobarEtiqueta(){
		boolean result=false;
		
		return result;
	}
	
}
