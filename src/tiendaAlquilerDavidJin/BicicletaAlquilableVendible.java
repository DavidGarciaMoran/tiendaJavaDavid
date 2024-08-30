package tiendaAlquilerDavidJin;

public class BicicletaAlquilableVendible extends BicicletaAlquilable implements Vendible {

	
	public BicicletaAlquilableVendible(String idArticulo, String marca, double precioProveedor, double precioVenta,
			String tipo, char talla) {
		super(idArticulo, marca, precioProveedor, precioVenta, tipo, talla);
		
	}

	@Override
	public double vender(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double comprar(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularPrecioUsado() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double comprarUsado(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

}
