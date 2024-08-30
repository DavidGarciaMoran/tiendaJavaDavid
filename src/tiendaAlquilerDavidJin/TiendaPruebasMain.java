package tiendaAlquilerDavidJin;

import java.util.HashMap;

public class TiendaPruebasMain {

	public static void main(String[] args) {
				
		ArticuloVendible palo = new ArticuloVendible("Palo andar", "Decathlon", 50, 100);
		ArticuloVendible mochila = new ArticuloVendible("Mochila", "Decathlon", 60, 120);
		//Alquilable kay = new KayakAlquilable("KayakV", "Kay", 20, 30, 30, false, 3, false);
		//Alquilable ps = new PadelSurfAlquilable("Padel", "Pad", 20, 30, 80, false, 80, "Plastico chino");
		Articulo bAlq = new BicicletaAlquilable("bici", "Monty", 100, 200, "montaña", 'M');
		
		//Creo un kayak vendible
		Articulo kayakVendGenericC = new Kayak("KayakVC", "Kay", 20.0, 30.0, 3, false);
		Articulo kayakVendGenericA = new Kayak("KayakVA", "Kay", 30.0, 80.0, 3, true);
		ArticuloVendible kayakVendC = new ArticuloVendible(kayakVendGenericC);
		ArticuloVendible kayakVendA = new ArticuloVendible(kayakVendGenericA);
		
		//ArticuloVendible biciVendibleM = new ArticuloVendible()
		
		Articulo kayakAlq = new KayakAlquilable("KayakA", "k", 20.0, 500.0, 3, false);
		
		//HACER BUCLE PARA CREAR LAS UNIDADES
		Unidad kayakU1 = new Unidad("KayakN1", "n1", true, kayakVendC);	
		
		Unidad kayakU2 = new Unidad("KayakN2", "n2", true, kayakVendC);	
		
		Unidad kayakU3 = new Unidad("KayakN3", "n3", true, kayakVendA);
		Unidad kayakU4 = new Unidad("KayakN4", "n4", true, kayakVendC);	
		
		Unidad biciU1 = new Unidad("BiciM1", "m1", true, bAlq);
			
		
		//ArticuloVendible biciPepe = new ArticuloVendible(bic);
		    
	    
		//System.out.println("Coste alquiler " + kay.alquilar(3, 1));
		StockTienda stock = new StockTienda(); 
		
		stock.addStockVendible(kayakVendC);
		stock.addStockVendible(kayakVendA);
		stock.addStockAlquilable(kayakAlq);
		//Añade una bici alquilable
		stock.addStockAlquilable(bAlq);
		//Añade una bici vendible
		//stock.addStockVendible(bic);
		
		//Vender va por id por ahora
		//stock.vender("Mochila", 10);
		
		
		//stock.vender("BiciVender", 3);
		stock.vender("KayakVC", 1);
		stock.vender("KayakVA", 1);
		stock.vender("KayakVC", 1);
		stock.vender("KayakVC", 2);
		stock.vender("KayakVC", 1);
		stock.vender("KayakVC", 1);
		stock.vender("KayakVC", 2);
		stock.vender("KayakVCA", 2);
		
		//No se puede castear la alquilable porque no es vendible
		//stock.addStockVendible((ArticuloVendible)bAlq);
		//Tampoco se puede castear desde bicicleta directamente
		//stock.addStockVendible((ArticuloVendible)bic);

		stock.comprar(palo, 20);
		stock.vender("Palo andar", 3);
		
		//stock.comprar(biciPepe, 4);
		//stock.comprar(k, 10);
		System.out.println("Quedan " + palo.getNumUnidadesVendibles() + " de palos andar");
		
		stock.alquilar((Alquilable)bAlq, 1, 3);
		
		//System.out.println(biciPepe.getInformacionArticulo());
	}

}
