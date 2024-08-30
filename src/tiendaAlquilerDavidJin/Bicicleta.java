package tiendaAlquilerDavidJin;

public abstract class Bicicleta extends Articulo {
	
	private String tipo;
	private char talla;
	
	public Bicicleta(String idArticulo, String marca, double precioProveedor, double precioVenta,
			String tipo, char talla) {
		super(idArticulo, marca, precioProveedor, precioVenta);
		this.tipo = tipo;
		this.talla = talla;
		Articulo art = this;
		this.setDatosAdicionalesArtículo(this);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public char getTalla() {
		return talla;
	}

	public void setTalla(char talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Bicicleta [tipo=" + tipo + ", talla=" + talla + "]";
	}
	

}
