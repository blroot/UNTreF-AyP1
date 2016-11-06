/**
* Ordenador que utiliza el algoritmo de ordenamiento por Burbujeo.
*/

public class OrdenadorPorBurbujeo {

	/**
	* post: reorganiza los elementos de vector de acuerdo al orden lineal <
	* definido para los números enteros.
	*/
	public int[] ordenar(int[] vector) {
		
		int cantidadDeCambios = 1;
		
		while (cantidadDeCambios >= 1) {
			
			cantidadDeCambios = 0;
					
			for (int i = 0; i < vector.length-1; i++) {
				
				if (vector[i] > vector[i + 1]) {
					
					int valorACambiar = vector[i];
					vector[i] = vector[i + 1];
					vector[i + 1] = valorACambiar;
					
					cantidadDeCambios++;
				}
			}
		}
		
		return vector;
	}

}
