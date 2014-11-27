package ManchaGlobex.GestionaT.Dominio;

import java.sql.ResultSet;

import ManchaGlobex.GestionaT.Persistencia.AgenteBBDD;

public class EtiquetaDAO {
	private Etiqueta et;

	public EtiquetaDAO() throws Exception {

	}

	public boolean crearEtiqueta(Etiqueta et) throws Exception {
		String SQL = "insert into gestionat.etiqueta value('" + et.getNombre()
				+ "','" + et.getDescripcion() + "');";
		AgenteBBDD agente = AgenteBBDD.getAgente();

		System.out.println(SQL);
		agente.insert(SQL);
		agente.desconectar();
		return true;
	}

	public boolean crearEtiquetasd(Etiqueta et) throws Exception {
		String SQL = "insert into etiqueta value('" + et.getNombre() + "');";
		AgenteBBDD agente = AgenteBBDD.getAgente();

		agente.insert(SQL);
		agente.desconectar();
		return true;

	}

	public boolean comprobarEtiqueta(String nombre) throws Exception {
		String SQL = "SELECT * FROM gestionat.etiqueta WHERE Tipo='" + nombre
				+ "';";
		AgenteBBDD agente = AgenteBBDD.getAgente();

		ResultSet rs = agente.select(SQL);
		rs.next();
		if (rs.getRow() == 0) {

			agente.desconectar();
			return true;
		} else {
			agente.desconectar();
			return false;
		}
	}

	public void consultarEtiqueta() {

	}

	public void borrarEtiqueta(Etiqueta etiqueta) {

	}
}
