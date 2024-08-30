package tiendaAlquilerDavidJin;

public class Kayak extends Articulo {
	private int numPlazas;
	private boolean cerrado;
	
	
	
	public Kayak(String idArticulo, String marca, double precioProveedor, double precioVenta, 
			int numPlazas, boolean cerrado) {
		super(idArticulo, marca, precioProveedor, precioVenta);
		this.numPlazas = numPlazas;
		this.cerrado = cerrado;
		this.setDatosAdicionalesArtículo(this);
	}
	public int getNumPlazas() {
		return numPlazas;
	}
	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	public boolean isCerrado() {
		return cerrado;
	}
	public void setCerrado(boolean cerrado) {
		this.cerrado = cerrado;
	}
	
	
}
