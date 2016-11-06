/**
* Ordenador que utiliza el algoritmo de ordenamiento por Selección.
*/

public class OrdenadorPorSeleccion {

	/**
	* post: reorganiza los elementos de vector de acuerdo al orden lineal <
	* definido para los números enteros.
	*/
	
	public int[] ordenar(int[] vector) {
		
		int tamanoDelArray = vector.length;
		int elementoMasGrandeKey = 0;
		
		while (tamanoDelArray > 1) {
			
			elementoMasGrandeKey = 0;
			for (int i = 0; i < tamanoDelArray; i++) {
				if (vector[elementoMasGrandeKey] < vector[i]) {
					elementoMasGrandeKey = i;
				}
			}
			
			tamanoDelArray--;
			
			int valorACambiar = vector[tamanoDelArray];
			vector[tamanoDelArray] = vector[elementoMasGrandeKey];
			vector[elementoMasGrandeKey] = valorACambiar;
		}
		
		return vector;
	}

}