package ManchaGlobex.GestionaT.Dominio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JTextField;


public class GestorRegistrarse {

	private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public boolean comprobarDNI(JTextField s) {
		
		String dni=s.getText();
		final String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
		Boolean res = false;
		if (dni.length() == 9) {
			res = true;
			for (int i = 0; i < dni.length() - 1; i++) {
				res = res && Character.isDigit(dni.charAt(i));
			}
			Integer valor = new Integer(dni.substring(0, 8));
			int aux = valor % 23;
			Character letraReal = dni.charAt(8);
			Character letraCalculada = letra.charAt(aux);
			if (letraReal == letraCalculada) {
				res = true;

			}

		}
		return res;
	}

	public boolean comprobarEmail(JTextField e) {
		String email = e.getText();
		Pattern pattern = Pattern.compile(PATTERN_EMAIL);

		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public boolean comprobarContrasena(JTextField c) {
		String contrasena = c.getText();
		boolean result = false;
		if (contrasena.length() > 4) {
			result = true;
		}

		return result;
	}
}
