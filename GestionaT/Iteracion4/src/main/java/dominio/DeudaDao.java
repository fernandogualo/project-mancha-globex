package dominio;

import java.sql.ResultSet;

import Persistencia.AgenteBBDD;

public class DeudaDao {
	
	public boolean crearDeuda(Deuda d) throws Exception{
		String SQL = "SELECT MAX(IdGasto_Ingreso) from gestionat.deuda;";
		AgenteBBDD agente = AgenteBBDD.getAgente();
		ResultSet rs=agente.select(SQL);
		rs.next();
		int id=rs.getInt(1);
		id++;
		SQL="INSERT INTO gestionat.deuda (idGasto_Ingreso,Cantidad,Etiqueta_tipo) value("+id+","+d.getCantidad()+",'1','"+d.getEtiqueta()+"');";		
		agente.insert(SQL);
		return true;
	}
	
	public void modificarDeuda(Deuda d){
		
	}
	
	public void borrarDeuda(Deuda d){
		
	}
}
