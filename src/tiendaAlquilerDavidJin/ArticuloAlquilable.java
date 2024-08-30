package tiendaAlquilerDavidJin;

//No se va a usar pero sería para articulos alquilables con una función fija
public class ArticuloAlquilable extends Articulo implements Alquilable {

	
	public ArticuloAlquilable(String idArticulo, String marca, double precioProveedor, double precioVenta) {
		super(idArticulo, marca, precioProveedor, precioVenta);
	}

	//Si hubiera un calculo por defecto para alquilar y retornar
	@Override
	public double alquilar(int numDias, int numUnidades) {
		
		return 0;
	}

	@Override
	public double retornar(int diasAlquilados, int numDias, int numUnidades) {
		
		return 0;
	}

}
