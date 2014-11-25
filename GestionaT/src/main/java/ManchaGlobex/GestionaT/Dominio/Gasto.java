package ManchaGlobex.GestionaT.Dominio;

public class Gasto {
	private int tipo;
	private double cantidad;
	private String fecha;
	private Etiqueta etiqueta;

	public Gasto(int tipo, double cantidad, String fecha, Etiqueta etiqueta) {
		super();
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.etiqueta = etiqueta;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Etiqueta getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(Etiqueta etiqueta) {
		this.etiqueta = etiqueta;
	}

}
