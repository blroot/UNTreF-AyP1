
public class VerificadorDeOrden {

	public boolean verificar(int array[]) {
		boolean estaOrdenado = true;
		
		for (int i = 0; i < array.length-1 && estaOrdenado; i++) {
			estaOrdenado = array[i] <= array[i+1];
		}
		
		return estaOrdenado;
	}

}
