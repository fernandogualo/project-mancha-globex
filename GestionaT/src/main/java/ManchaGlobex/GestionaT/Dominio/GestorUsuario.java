package ManchaGlobex.GestionaT.Dominio;

public class GestorUsuario {
	UsuarioDAO user=new UsuarioDAO();
	public boolean comprobarUsuario(String nombre,String contrasena) throws Exception{
		boolean a= user.comprobarLogin(nombre, contrasena);
		return a;
	}
	public boolean regitrar(String dni,String nombre_usuario, String apellidos, String email ,String contrasena) throws Exception{
		Usuario us=new Usuario( dni, nombre_usuario,  apellidos,  email , contrasena);
		boolean a = user.registrarUsuario(us);
		return a;	
	}	
}
