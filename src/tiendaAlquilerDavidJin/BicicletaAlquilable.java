package tiendaAlquilerDavidJin;

public class BicicletaAlquilable extends Bicicleta implements Alquilable {


	public BicicletaAlquilable(String idArticulo, String marca, double precioProveedor, double precioVenta,
			String tipo, char talla) {
		super(idArticulo, marca, precioProveedor, precioVenta, tipo, talla);
	}

	@Override
	public double alquilar(int numDias, int numUnidades) {

		double alquiler = numUnidades * (this.getPrecioVenta()  * 10/100);
		if(this.getNumUnidades() >= numUnidades) {
			this.addNumUnidades(-numUnidades);
		}
		else {
			alquiler = 0;
		}
		return alquiler;
	}

	@Override
	public double retornar(int diasAlquilados, int numDias, int numUnidades) {
		//Si se retrasa al devolver se multará
		int retrasoAlquiler = diasAlquilados - numDias;
		double multa = 0;
		if(retrasoAlquiler < 0) {
			multa = retrasoAlquiler * 50 * - 1 * numUnidades;
		}
		
		this.addNumUnidades(numUnidades);
		
		return multa;
	}

}
