package dominio;

public class GestorEtiqueta {
	EtiquetaDAO edao;
	public GestorEtiqueta() throws Exception{
		edao=new EtiquetaDAO();
	}
	
	public boolean comprobarEtiqueta(String nombre) throws Exception{
		boolean a= edao.comprobarEtiqueta(nombre);
		return a;
	}
	public boolean regitrarEtiqueta(String nombre, String descripcion) throws Exception{
		boolean a;
		if(edao.comprobarEtiqueta(nombre)==true){
			Etiqueta et=new Etiqueta(nombre,descripcion);		
			a = edao.crearEtiqueta(et);
		}else{
			a=false;
		}
		return a;	
	}
	public boolean regitrarEtiqueta(String nombre) throws Exception{
		boolean a;
		if(edao.comprobarEtiqueta(nombre)==true){
			Etiqueta et=new Etiqueta(nombre);		
			a = edao.crearEtiqueta(et);
		}else{
			a=false;
		}
		return a;
		}
	
}
