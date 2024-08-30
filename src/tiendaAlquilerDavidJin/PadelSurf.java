package tiendaAlquilerDavidJin;

public class PadelSurf extends Articulo {
	
	private int longitud;
	private String material;


	public PadelSurf(String idArticulo, String marca, double precioProveedor, double precioVenta) {
		super(idArticulo, marca, precioProveedor, precioVenta);
		this.setDatosAdicionalesArtículo(this);
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	

	
	
}
