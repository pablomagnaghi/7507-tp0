public class Programa2 {

	public static void main(String[] args) {

		Sucesion unaSucesion = new Sucesion(5);
		
		// Prueba 1
		if(unaSucesion.getSumatoria() == 0)
			System.out.println("Prueba 1 bien.");

		// Prueba 2		
		Elemento unElemento = new Elemento(0);
		unElemento.setValor(1);
		unaSucesion.agregar(unElemento);
		if(unaSucesion.getSumatoria() == 1)
			System.out.println("Prueba 2 bien.");

		// Prueba 3
		Elemento otroElemento = new Elemento(0);
		otroElemento.setValor(5);
		unaSucesion.agregar(otroElemento);
		if(unaSucesion.getSumatoria() == 6)
			System.out.println("Prueba 3 bien.");

		// Prueba 4
		if(unaSucesion.getTamanio() == 2)
			System.out.println("Prueba 4 bien.");

	}

}
