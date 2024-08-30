package tiendaAlquilerDavidJin;

public class Unidad {
	
	private String nombre;
	private String idUnidad;
	private Articulo articulo;
	private boolean vendida;
	private boolean alquilada;
	private boolean nuevo;
	//private boolean isVendible;
	//private boolean isAlquilable;
	
	public Unidad(String nombre, String idUnidad, boolean nuevo, Articulo datosArticulo) {
		this.nombre = nombre;
		this.idUnidad = idUnidad;
		this.articulo = datosArticulo;
		//Si es una unidad nueva se añade al artículo
		this.articulo.addToMapUnidades(this);
		this.nuevo = nuevo;
		
		//Tendría que comprobar el tipo de artículo
		//this.setVendible(isVendible);
		//this.setAlquilable(isAlquilable);
		this.setVendida(false);
		this.setAlquilada(false);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdUnidad() {
		return idUnidad;
	}

	public void setIdUnidad(String idUnidad) {
		this.idUnidad = idUnidad;
	}

	public Articulo getDatosArticulo() {
		return articulo;
	}

	public void setDatosArticulo(Articulo datosArticulo) {
		this.articulo = datosArticulo;
	}

	public boolean isAlquilada() {
		return alquilada;
	}

	public void setAlquilada(boolean alquilada) {
		this.alquilada = alquilada;
	}

	public boolean isVendida() {
		return vendida;
	}

	public void setVendida(boolean vendida) {
		this.vendida = vendida;
	}

	public boolean isNuevo() {
		return nuevo;
	}

	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}
	
	/*

	public boolean isAlquilable() {
		return isAlquilable;
	}

	public void setAlquilable(boolean isAlquilable) {
		this.isAlquilable = isAlquilable;
	}

	public boolean isVendible() {
		return isVendible;
	}

	public void setVendible(boolean isVendible) {
		this.isVendible = isVendible;
	}
	*/
	
}
