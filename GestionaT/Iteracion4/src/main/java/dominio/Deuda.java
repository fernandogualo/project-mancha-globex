package dominio;

import java.util.Date;

public class Deuda {
	private double cantidad;
	private String etiqueta;
	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	private String destinatario;
	

	public Deuda(double cantidad, String etiqueta,String destinatatrio) {
		this.cantidad = cantidad;		
		this.etiqueta = etiqueta;		
		this.destinatatrio = destinatatrio;
	}

	private String destinatatrio;

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

		public String getDestinatatrio() {
		return destinatatrio;
	}

	public void setDestinatatrio(String destinatatrio) {
		this.destinatatrio = destinatatrio;
	}

}
