
class Calculadora {
	
	public int contarDivisores(int numero) {
		
		int cantidadDeDivisores;
		
		if (numero < 0) {
			Error error = new Error("Solo funciona con enteros");
			throw error;
		} else if (numero == 0) {
			Error error = new Error("0 tiene infinitos divisores");
			throw error;
		}
		
		if (numero == 1) {
			cantidadDeDivisores = 1;
		} else {
			cantidadDeDivisores = 2;
		}
		
		for(int i = 2; i <= numero/2; i++) {
			if (numero % i == 0) {
				cantidadDeDivisores++;
			}
		}
		
		return cantidadDeDivisores;
	}
	
}
