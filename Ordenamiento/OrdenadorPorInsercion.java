
public class OrdenadorPorInsercion {

	public int[] ordenar(int[] vector) {
		
		for (int i = 1; i < vector.length; i++) {
			
			int valorAOrdenar = vector[i];
			
			for (int j = i - 1; j >= 0; j--) {
						
				if (valorAOrdenar < vector[j]) {
					
					vector[j + 1] = vector[j];
					vector[j] = valorAOrdenar;
					
				}
			}
		}
		
		return vector;
	}

}
