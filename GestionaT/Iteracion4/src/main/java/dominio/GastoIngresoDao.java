package dominio;

import java.sql.ResultSet;
import java.sql.SQLException;

import Persistencia.AgenteBBDD;

public class GastoIngresoDao {
	
	public boolean crearGastoIngreso(GastoIngreso gi) throws SQLException, Exception{		
		String SQL = "SELECT MAX(IdGasto_Ingreso) from gestionat.gasto_ingreso;";
		AgenteBBDD agente = AgenteBBDD.getAgente();
		ResultSet rs=agente.select(SQL);
		rs.next();
		int id=rs.getInt(1);
		System.out.println(id);
		id++;
		SQL="INSERT INTO gestionat.gasto_ingreso (idGasto_Ingreso,Cantidad,Etiqueta_tipo,Usuario_dni) value("+id+","+gi.getCantidad()+",'"+gi.getEtiqueta()+"','1');";		
		agente.insert(SQL);
		return true;
	}
	
	public void modificarGastoIngreso(GastoIngreso g){
		
	}
	
	public void eliminarGastoIngreso(GastoIngreso g){
		
	}
	
}
