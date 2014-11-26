package ManchaGlobex.GestionaT.Dominio;

public class GestorUsuario {
	UsuarioDAO user=new UsuarioDAO();
	public boolean comprobarUsuario(String nombre,String contrasena) throws Exception{
		boolean a= user.comprobarLogin(nombre, contrasena);
		return a;
	}

}
