package tiendaAlquilerDavidJin;

public class PadelSurfAlquilable extends PadelSurf  implements Alquilable {
	

	public PadelSurfAlquilable(String idArticulo, String marca, double precioProveedor, double precioVenta) {
		super(idArticulo, marca, precioProveedor, precioVenta);
	}

	@Override
	public double alquilar(int numDias, int numUnidades) {

		double alquiler = numUnidades * numDias * 20;
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
