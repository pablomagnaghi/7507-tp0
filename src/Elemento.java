public class Elemento {
    /*atributos:*/
	private int nro;
	private int valor;
	/*constructor:*/	
	public Elemento (int i) {
		nro = i;
	}
	/*metodo: setValor (int i)
	 * le asigna al atributo valor
	 * del Elemento el valor de la
	 * variable i*/
	public void setValor(int i) {
		valor = i;	
	}
	/*metodo: getValor ()
	 * devuelve el valor del
	 * atributo valor 
	 * del Elemento */
	public int getValor(){
		return valor;
	}
}

