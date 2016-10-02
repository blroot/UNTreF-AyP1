
class Nota {

	private int nota;

	Nota(int valorInicial) {
		if (valorInicial >= 0 && valorInicial <= 10) {
			this.nota = valorInicial; 
		} else {
			this.nota = 0;
		}
	}
	
	int obtenerValor() {
		return this.nota;
	}
	
	boolean aprobado() {
		boolean aprobado = this.nota >= 4;
		
		return aprobado;
	}
	
	boolean desaprobado() {
		boolean desaprobado = this.nota < 4;
		
		return desaprobado;
	}
	
	void recuperar(int nuevoValor) {
		if (nuevoValor >= 0 && nuevoValor <= 10 && nuevoValor > nota) {
			this.nota = nuevoValor; 
		}
	}
	
}
