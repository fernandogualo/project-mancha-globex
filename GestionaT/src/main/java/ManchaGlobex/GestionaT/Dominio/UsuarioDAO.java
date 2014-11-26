package ManchaGlobex.GestionaT.Dominio;


import java.sql.ResultSet;

import ManchaGlobex.GestionaT.Presentacion.*;
import ManchaGlobex.GestionaT.Persistencia.*;

public class UsuarioDAO {
	private Usuario usuario;
	private AgenteBBDD agente;
	

	public UsuarioDAO(Usuario usuario) {
		this.usuario = usuario;
	}

	public UsuarioDAO() {

	}

	public void registrarUsuario() {
		

	}

	public boolean comprobarLogin(String nombre_usuario, String contrasena) throws Exception {
		String SQL="SELECT * FROM gestionat.usuario WHERE DNI='"+nombre_usuario+"';";
		agente=AgenteBBDD.getAgente();
		ResultSet rs=agente.select(SQL);
		rs.next();
		if(rs.getRow()==0){
			return false;
		}else{
			return true;
		}
	}
}
