public class Sucesion {
    /*atributos:*/
    private int tamanio_maximo;
    private int tamanio;
    private int sumatoria;
    /*constructores:
     le asigna el valor de la variable n 
     al atributo tamanio_maximo e inicializa 
     los atributos sumatoria y tamanio en cero */
	public Sucesion(int n) {
		tamanio_maximo = n;
		sumatoria = 0;
		tamanio = 0; 
	}
    /*metodo: getSumatoria ()
     devuelve la sumatoria de todos 
     los valores de los elementos que 
     hay en el objeto unaSucesion*/
	public int getSumatoria() {
		return sumatoria;
	}
	/*metodo: agregar(Elemento elemento) 
	  suma el valor del atributo del 
	  elemento a la sumatoria total de 
	  valores y ademas incrementa el 
	  tamanio de la sucesion en uno*/
	public void agregar(Elemento elemento) {	
		sumatoria = sumatoria + elemento.getValor();
		tamanio ++;
	}
	/*metodo: getTamanio() 
	  devuelve sólo la cantidad de  
	  elementos que contiene el objeto
	  unaSucesion en ese momento*/
	public int getTamanio() {
		return tamanio;
	}
	
}
