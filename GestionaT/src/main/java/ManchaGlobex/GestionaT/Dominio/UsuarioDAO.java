package ManchaGlobex.GestionaT.Dominio;

import ManchaGlobex.GestionaT.Presentacion.*;
import ManchaGlobex.GestionaT.Persistencia.*;

public class UsuarioDAO {
	private Usuario usuario;	

	public UsuarioDAO(Usuario usuario) {
		this.usuario = usuario;
	}

	public UsuarioDAO() {

	}

	public void registrarUsuario() {
		

	}

	public boolean comprobarLogin(String nombre_usuario, String contrasena) {
		return false;
	}
}
