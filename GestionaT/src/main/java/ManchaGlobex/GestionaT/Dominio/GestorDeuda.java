package ManchaGlobex.GestionaT.Dominio;

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
	
	public boolean introducirDeuda(double cantidad, String etiqueta,String destinatario) throws SQLException, Exception{		
		Deuda d=new Deuda(cantidad,etiqueta,destinatario);
		boolean a;
		GestorEtiqueta ge=new GestorEtiqueta();
		boolean paso=ge.comprobarEtiqueta(etiqueta);
		if(paso){
			a=ddao.crearDeuda(d);
		}else{
			ge.regitrarEtiqueta(etiqueta);
			a=ddao.crearDeuda(d);
		}
		
	return a;
	
}
	
}
