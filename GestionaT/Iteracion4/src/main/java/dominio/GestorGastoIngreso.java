package dominio;

import java.sql.SQLException;
import java.util.Date;

import javax.swing.JTextField;

public class GestorGastoIngreso {
	GastoIngresoDao gidao =new GastoIngresoDao();
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
	/*
	public boolean ComprobarEtiqueta(JTextField e){
		boolean result=false;
		
		return result;
	}
	*/
	public boolean introducirGastoIngreso(double cantidad, String etiqueta) throws SQLException, Exception{		
			GastoIngreso gi=new GastoIngreso(cantidad,etiqueta);
			boolean a=gidao.crearGastoIngreso(gi);
		return a;
		
	}

}
