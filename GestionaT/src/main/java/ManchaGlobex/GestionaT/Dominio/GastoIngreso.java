package ManchaGlobex.GestionaT.Dominio;
import java.util.Date;
public class GastoIngreso {
	
	private String tipo;
	private double cantidad;
	private Date fecha;
	private Etiqueta etiq;
	
	public GastoIngreso() {
		super();
	}
	public GastoIngreso(String tipo, double cantidad, Date fecha, Etiqueta etiq) {
		super();
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.etiq = etiq;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
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
	public Etiqueta getEtiq() {
		return etiq;
	}
	public void setEtiq(Etiqueta etiq) {
		this.etiq = etiq;
	}
}
