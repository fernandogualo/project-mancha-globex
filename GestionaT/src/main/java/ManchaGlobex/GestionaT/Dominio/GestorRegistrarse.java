package ManchaGlobex.GestionaT.Dominio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.aeat.valida.Validador;

public class GestorRegistrarse {
	
	private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";


	public boolean comprobarDNI(String s){
		boolean result=false;
		Validador validador = new Validador();
        int e = validador.checkNif(s);
 
        if (e > 0)
        	result=true;
        return result;
	}
	
	public boolean comprobarEmail(String e) {
		 
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
        
        Matcher matcher = pattern.matcher(e);
        return matcher.matches();
    }
	
	public boolean comprobarContraseña(String c){
		boolean result=false;
		if(c.length()>4){
			result=true;
		}
		
		return result;
	}
}
