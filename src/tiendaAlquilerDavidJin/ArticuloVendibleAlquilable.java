package tiendaAlquilerDavidJin;

import java.util.HashMap;

public class ArticuloVendibleAlquilable extends ArticuloVendible implements Alquilable {

	public ArticuloVendibleAlquilable(String idArticulo, String marca, double precioProveedor, double precioVenta,
			HashMap<String, Unidad> unidadesVendibles) {
		super(idArticulo, marca, precioProveedor, precioVenta, unidadesVendibles);

	}

	public ArticuloVendibleAlquilable(Articulo articulo) {
		super(articulo);
		
	}

	@Override
	public double alquilar(int numDias, int numUnidades) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double retornar(int diasAlquilados, int numDias, int numUnidades) {
		// TODO Auto-generated method stub
		return 0;
	}

}
