
public class BusquedaBinaria {

	public Integer buscar(int[] vector, int elemento) {
		
		Integer posicion = null;
		int principioDeArray = 0;
		int finDeArray = vector.length - 1;
		boolean buscando = true;
		int posicionActual = 0;
		
		while (principioDeArray <= finDeArray && buscando) {
			
			posicionActual = (principioDeArray + finDeArray) / 2;
			
			if (vector[posicionActual] == elemento) {
				
				posicion = posicionActual;
				buscando = false;
			}
			
			if (vector[posicionActual] > elemento) {
				
				finDeArray = posicionActual - 1; 
				
			} else if (vector[posicionActual] < elemento) {
					
					principioDeArray = posicionActual + 1;
			}
		}
		
		return posicion;
		
	}
	
}
