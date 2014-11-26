package ManchaGlobex.GestionaT.Dominio;

import java.util.Date;

public class Deuda {
	private double cantidad;
	private Date fecha;
	private Etiqueta etiqueta;
	private int id;

	public Deuda(double cantidad, Date fecha, Etiqueta etiqueta, int id,
			String destinatatrio) {
		super();
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.etiqueta = etiqueta;
		this.id = id;
		this.destinatatrio = destinatatrio;
	}

	private String destinatatrio;

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Etiqueta getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(Etiqueta etiqueta) {
		this.etiqueta = etiqueta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestinatatrio() {
		return destinatatrio;
	}

	public void setDestinatatrio(String destinatatrio) {
		this.destinatatrio = destinatatrio;
	}

}
