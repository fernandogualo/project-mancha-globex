package ManchaGlobex.GestionaT.Dominio;

import javax.swing.JTextField;

public class GestorDeuda {
	public boolean comprobarCantidad(JTextField c){
		boolean result=false;
		double cant;
		try{
			cant=Double.parseDouble(c.getText());
		}
		catch(Exception e){
			return result;
		}
		result=true;
		return result;
	}
	
	public boolean ComprobarEtiqueta(){
		boolean result=false;
		
		return result;
	}
	
}
