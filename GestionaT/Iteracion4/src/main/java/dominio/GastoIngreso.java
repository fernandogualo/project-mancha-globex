package dominio;
import java.util.Date;
public class GastoIngreso {
	
	
	private String etiqueta;
	private double cantidad;
	//private Date fecha;
	
	
	public GastoIngreso() {
		
	}
	public GastoIngreso( double cantidad,String etiqueta) {		
		this.etiqueta = etiqueta;
		this.cantidad = cantidad;
	}
	public String getEtiqueta() {
		return etiqueta;
	}
	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
}
