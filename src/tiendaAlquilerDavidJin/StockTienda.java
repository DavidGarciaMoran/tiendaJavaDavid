package tiendaAlquilerDavidJin;

import java.util.HashMap;
import java.util.Map.Entry;

public class StockTienda {

	public HashMap<String, ArticuloVendible> vendibles = new HashMap<String, ArticuloVendible>();
	public HashMap<String, Articulo> alquilables = new HashMap<String, Articulo>();
	
	public StockTienda() {
		
	}

	//Aqui se venden X unidades de un artículo
	public double vender(String idArticulo, int numUnidades) {
		double ganancia = 0;
		ArticuloVendible art = vendibles.get(idArticulo);
		if(art != null) {
			
			ganancia += art.vender(numUnidades);
			if(ganancia > 0) {
				System.out.println("Se han vendido " + numUnidades + " de " + art.getidArticulo() + " con una ganancia de " + ganancia);				
			}
			
			else {
				System.out.println(" No se pudo realizar la venta");
			}
				
		}
		
		else {
			System.out.println("No existe el producto "+ idArticulo);
		}
		
		return ganancia;	
	}
	
	/*
	public StockTienda(HashMap<String, Articulo> articulosVenta) {
		this.articulos= articulosVenta;
	}
	*/
	
	public void addStockVendible(ArticuloVendible v) {
		vendibles.put(v.getidArticulo(), v);
	}
	
	public void addStockAlquilable(Articulo al) {		
		alquilables.put(al.getidArticulo(), al);
	}

	public double alquilar(Alquilable alq, int numUnidades, int dias) { 
		
		double ganancia = 0;
		
		Articulo art = (Articulo)alq;
		
		if(art!= null) {
			ganancia += alq.alquilar(dias, numUnidades);
			System.out.println("Se han alquilado " + numUnidades + " de " + art.getidArticulo() + " con una ganancia de " + ganancia );
			
		}	
		else {
			System.out.print("Este artículo no existe");
		}
			
		return ganancia;		
	}
	
	//Creo unidades al comprarla a un almacen o a alguien, si se compra por artículo deberían ser nuevos
	public double comprar(ArticuloVendible art, int numUnidades) {
		
		double gasto = 0;
		
		if(art!= null) {
			gasto+= art.comprar(numUnidades);
			for(int i = 0; i< numUnidades; i++) {
				art.addToMapUnidades(new Unidad(art.getidArticulo(),Integer.toString(art.getidArticulo().hashCode() + i) , true, art));
			}
			
			addStockVendible(art);
			
		}
		else {
			System.out.print("Eso no es un artículo");
		}
		//System.out.println("La tienda ha gastado " + gasto + " en " + numUnidades + " " + idArticulo);
		
		System.out.println(String.format("La tienda ha gastado %.2f en %d %s", gasto, numUnidades, art.getidArticulo()));
		return gasto;
	}
	
	
	public void retornar(Articulo art, int numUnidades, int dias, int idHistorial) {
		
		Alquilable alq = (Alquilable) alquilables.get(art.getidArticulo());
		
		alq.retornar(dias, idHistorial, numUnidades);
		System.out.println("Me han devuelto " + art.getidArticulo() + ": " + numUnidades );
		
	}
	
	
}
