package dominio;

import java.sql.ResultSet;

import Persistencia.AgenteBBDD;

public class DeudaDao {
	
	public boolean crearDeuda(Deuda d) throws Exception{
		String SQL = "SELECT MAX(idDeuda) from gestionat.deuda;";
		AgenteBBDD agente = AgenteBBDD.getAgente();
		ResultSet rs=agente.select(SQL);
		rs.next();
		int id=rs.getInt(1);
		id++;
		SQL="INSERT INTO gestionat.deuda (idDeuda,Cantidad,Etiqueta_tipo,Adeudor,Usuario_DNI) value("+id+","+d.getCantidad()+",'"+d.getEtiqueta()+"','"+d.getDestinatatrio()+"','1');";		
		agente.insert(SQL);
		return true;
	}
	
	public void modificarDeuda(Deuda d){
		
	}
	
	public void borrarDeuda(Deuda d){
		
	}
}
