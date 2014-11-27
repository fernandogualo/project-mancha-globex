package ManchaGlobex.GestionaT.Dominio;

import java.sql.ResultSet;

import ManchaGlobex.GestionaT.Persistencia.AgenteBBDD;

public class EtiquetaDAO {
	private Etiqueta et;
	private AgenteBBDD agente=null;
	
	public EtiquetaDAO() throws Exception {
		agente=agente.getAgente();
		
	}
	public boolean crearEtiqueta(Etiqueta et) throws Exception{
		String SQL="insert into gestionat.etiqueta value('"+et.getNombre()+"','"+et.getDescripcion()+"');";
		
	
		
		System.out.println(SQL);
		agente.insert(SQL);
		agente.desconectar();
		return true;
	}
	public boolean crearEtiquetasd(Etiqueta et) throws Exception{
		String SQL="insert into etiqueta value('"+et.getNombre()+"');";
		
			
		
		agente.insert(SQL);
		agente.desconectar();
		return true;
	
	}
	public boolean comprobarEtiqueta(String nombre) throws Exception{
		String SQL="SELECT * FROM gestionat.etiqueta WHERE Tipo='"+nombre+"';";
		
			
		
		ResultSet rs=agente.select(SQL);
		rs.next();
		if(rs.getRow()==0){	
			
			agente.desconectar();
			return true;
		}else{
			agente.desconectar();
			return false;
		}	
		
	}
	public void consultarEtiqueta(){
		
	}
	public void borrarEtiqueta(Etiqueta etiqueta){
		
	}
}
