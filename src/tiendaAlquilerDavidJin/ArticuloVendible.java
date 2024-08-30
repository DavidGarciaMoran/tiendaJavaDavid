package tiendaAlquilerDavidJin;

import java.util.HashMap;
import java.util.Map.Entry;

public class ArticuloVendible extends Articulo implements Vendible {
	
	//Aquí se inicializa con el mapa
	public ArticuloVendible(String idArticulo, String marca, double precioProveedor, double precioVenta,
			HashMap<String, Unidad> unidadesVendibles) {
		super(idArticulo, marca, precioProveedor, precioVenta);
		this.setMapUnidades(unidadesVendibles); 
	}	
	
	public ArticuloVendible(String idArticulo, String marca, double precioProveedor, double precioVenta) {
		super(idArticulo, marca, precioProveedor, precioVenta);
		this.setMapUnidades(new HashMap<String, Unidad>()); 
	}	

	//Transforma en vendible un articulo, no tengo en cuenta si tenía unidades por ahora
	public ArticuloVendible(Articulo articulo) {
		super(articulo.getidArticulo(), articulo.getMarca(), articulo.getPrecioProveedor(), articulo.getPrecioVenta(), articulo);	
	}
	
	@Override
	public double calcularPrecioUsado(){
		double descuento = this.getPrecioVenta() * 20/100;
		return this.getPrecioVenta() - descuento;
	}
	
	public double vender(int cantidadVendida) {
		double beneficio = 0;
		int totalUnidades = cantidadVendida;
		int unidadesDisponibles = 0;
		HashMap<String, Unidad> disponibles = new HashMap<String, Unidad>();
		
		//System.out.println("Intentando vender "+ this.getidArticulo() + " " + cantidadVendida + " tenemos " + this.getNumUnidades());
		if(this.getNumUnidades() >= cantidadVendida) {	
						
		    for (Entry<String, Unidad> u : this.getMapUnidades().entrySet()) {
		        if (!u.getValue().isVendida() && !u.getValue().isAlquilada()) {
		            unidadesDisponibles++;
		            disponibles.put(u.getKey(), u.getValue());
		        }
		    }
		    if(unidadesDisponibles >= cantidadVendida) {
		    	//Recorro los disponibles
				for(Entry<String,Unidad> u : disponibles.entrySet()) {
					
					totalUnidades -=1;
					u.getValue().setVendida(true);				
					u.getValue().setNuevo(false);
					
					//No se si sería mejor quitarlo o dejarlo aquí
					//this.getMapUnidades().remove(u.getKey());
					//Se vendieron las unidades que se pedían
					if(totalUnidades == 0) {
						if(u.getValue().isNuevo()) {
							beneficio = cantidadVendida * (this.getPrecioVenta() - this.getPrecioProveedor());
						}
						else {
							beneficio = cantidadVendida * (this.calcularPrecioUsado() - this.getPrecioProveedor());
						}
						
						this.addNumUnidades(-cantidadVendida);
						break;
					}					
				}		    	
		    }
		    	
		    else {
				System.out.print("Lo siento, no hay bastantes a la venta.");
			}
				
		}
		else if(this.getNumUnidades() > 0) {
			System.out.print("No hay bastantes unidades.");
		}
		else {
			System.out.print("No quedan unidades de " + this.getidArticulo()+ ".");
		}
			
		return beneficio;
		
	}
	
	

	/**
	 * Devuelve lo gastado al comprar
	 * @param idArticulo
	 * @param num
	 * @return gasto
	 */
	public double comprar(int num) {
			
		return num * this.getPrecioProveedor();
		
	}
	
	public double comprarUsado(int num) {
		
		return num * this.calcularPrecioUsado();
		
	}
	
	

	
	
	


}
