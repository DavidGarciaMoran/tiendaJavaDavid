package tiendaAlquilerDavidJin;

import java.util.HashMap;
import java.util.Map.Entry;

public class Articulo {
	
	private String idArticulo;
	private String marca;
	private double precioProveedor;
	private double precioVenta;
	private int numUnidades;
	//Quizas no hace falta
	//private int numUnidadesAlquiler;
	//private int numUnidadesVenta;
	
	private HashMap<String, Unidad> mapUnidades;
	
	//Esto sería más correcto como hashmap para poder guardarlo en la base de datos con menos problemas. O habría que hacer una tabla de kayaks, bicicletas y padelsurfs a parte.
	private Articulo datosAdicionalesArtículo = null;
	
	public Articulo(String idArticulo, String marca, double precioProveedor, double precioVenta) {
		this.idArticulo = idArticulo;
		this.marca = marca;
		this.precioProveedor = precioProveedor;
		this.precioVenta = precioVenta;
		//Cambiar después, primero creo el articulo, después le añado unidades
		this.numUnidades = 0;
		this.mapUnidades = new HashMap<String,Unidad>();
		//Por defecto ni se vende ni se alquila
		//this.numUnidadesVenta = 0;
		//this.numUnidadesAlquiler = 0;	
	}	
	
	public Articulo(String idArticulo, String marca, double precioProveedor, double precioVenta, Articulo art) {
		this.idArticulo = idArticulo;
		this.marca = marca;
		this.precioProveedor = precioProveedor;
		this.precioVenta = precioVenta;
		this.numUnidades = 0;
		this.mapUnidades = new HashMap<String,Unidad>();
		this.setDatosAdicionalesArtículo(art);
		
	}	
	

	public String getidArticulo() {
		return idArticulo;
	}

	public void setidArticulo(String articulo) {
		this.idArticulo = articulo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecioProveedor() {
		return precioProveedor;
	}

	public void setPrecioProveedor(double precioProveedor) {
		this.precioProveedor = precioProveedor;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getNumUnidades() {
		return numUnidades;
	}
	
	public int getNumUnidadesVendibles() {
		int unidadesVendibles = 0;
		for (Entry<String, Unidad> u : this.getMapUnidades().entrySet()) {
	        if (!u.getValue().isVendida() && !u.getValue().isAlquilada()) {
	        	unidadesVendibles++;
	        }
	    }
		return unidadesVendibles;
	}
	
	public int getNumUnidadesAlquilables() {
		return numUnidades;
	}
	
	public void setNumUnidades(int numUnidades) {
		this.numUnidades = numUnidades;
	}
	
	public void addNumUnidades(int numUnidades) {
		this.numUnidades += numUnidades;
	}

	
	public HashMap<String, Unidad> getMapUnidades() {
		return mapUnidades;
	}

	public void setMapUnidades(HashMap<String, Unidad> mapUnidades) {
		this.mapUnidades = mapUnidades;
	}
	
	//Se añade al almacen
	public void addToMapUnidades(Unidad u) {
		this.mapUnidades.put(u.getIdUnidad(), u);
		this.numUnidades+=1;
		
	}

	public Articulo getDatosAdicionalesArtículo() {
		return datosAdicionalesArtículo;
	}

	public void setDatosAdicionalesArtículo(Articulo datosAdicionalesArtículo) {
		this.datosAdicionalesArtículo = datosAdicionalesArtículo;
	}
	

}
