package dominio;

import java.sql.SQLException;

import javax.swing.JTextField;

public class GestorDeuda {
	DeudaDao ddao=new DeudaDao();
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
	public boolean introducirDeuda(double cantidad, String etiqueta,String destinatario) throws SQLException, Exception{		
		Deuda d=new Deuda(cantidad,etiqueta,destinatario);
		boolean a=ddao.crearDeuda(d);
	return a;
	
}
	
}
