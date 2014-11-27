package ManchaGlobex.GestionaT.Dominio;

public class Etiqueta {
	private String nombre, descripcion;

	public Etiqueta(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public Etiqueta(String nombre) {
		this.nombre = nombre;
	}
	public Etiqueta() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
