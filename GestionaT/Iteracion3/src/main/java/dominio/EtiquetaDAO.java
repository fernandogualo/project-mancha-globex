package dominio;

import java.sql.ResultSet;
import Persistencia.*;

public class EtiquetaDAO {
	private Etiqueta et;

	public EtiquetaDAO() throws Exception {

	}

	public boolean crearEtiqueta(Etiqueta et) throws Exception {
		String SQL = "insert into gestionat.etiqueta value('" + et.getNombre()
				+ "','" + et.getDescripcion() + "');";
		AgenteBBDD agente = AgenteBBDD.getAgente();

		agente.insert(SQL);
		return true;
	}

	public boolean crearEtiquetasd(Etiqueta et) throws Exception {
		String SQL = "insert into gestionat.etiqueta value('" + et.getNombre()
				+ "','');";
		AgenteBBDD agente = AgenteBBDD.getAgente();

		agente.insert(SQL);
		return true;

	}

	public boolean comprobarEtiqueta(String nombre) throws Exception {
		String SQL = "SELECT * FROM gestionat.etiqueta WHERE Tipo='" + nombre
				+ "';";
		AgenteBBDD agente = AgenteBBDD.getAgente();

		ResultSet rs = agente.select(SQL);
		rs.next();
		if (rs.getRow() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
