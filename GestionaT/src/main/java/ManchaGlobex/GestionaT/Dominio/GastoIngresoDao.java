package ManchaGlobex.GestionaT.Dominio;

import java.sql.ResultSet;
import java.sql.SQLException;

import ManchaGlobex.GestionaT.Persistencia.AgenteBBDD;
import ManchaGlobex.GestionaT.Presentacion.LoginIU;

public class GastoIngresoDao {
	
	public boolean crearGastoIngreso(GastoIngreso gi) throws SQLException, Exception{		
		String SQL = "SELECT MAX(IdGasto_Ingreso) from gestionat.gasto_ingreso;";
		AgenteBBDD agente = AgenteBBDD.getAgente();
		ResultSet rs=agente.select(SQL);
		rs.next();
		int id=rs.getInt(1);
		System.out.println(id);
		id++;
		SQL="INSERT INTO gestionat.gasto_ingreso (idGasto_Ingreso,Cantidad,Etiqueta_tipo,Usuario_dni) value("+id+","+gi.getCantidad()+",'"+gi.getEtiqueta()+"','"+LoginIU.DNI+"');";		
		agente.insert(SQL);
		agente.desconectar();
		return true;
	}
	
	public void modificarGastoIngreso(GastoIngreso g){
		
	}
	
	public void eliminarGastoIngreso(GastoIngreso g){
		
	}
	
}
