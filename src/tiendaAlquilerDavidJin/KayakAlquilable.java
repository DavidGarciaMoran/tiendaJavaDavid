package tiendaAlquilerDavidJin;

public class KayakAlquilable extends Kayak implements Alquilable {
	
	
	public KayakAlquilable(String idArticulo, String marca, double precioProveedor, double precioVenta,
			int numPlazas, boolean cerrado) {
		super(idArticulo, marca, precioProveedor, precioVenta, numPlazas, cerrado);
	}

	@Override
	public double alquilar(int numDias, int numUnidades) {
		double alquiler = 15 * this.getNumPlazas() * numDias * numUnidades;
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
