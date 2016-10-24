
public class Vagon {
	
	private int numero;
	private int capacidadDeCarga;
	private int carga;

	public Vagon(int numero, int capacidadDeCarga) {
		if (numero <= 0) {
			throw new Error("El número no puede ser menor o igual que 0");
		}
		if (capacidadDeCarga <= 0) {
			throw new Error("La capacidad de carga no puede ser menor o igual que 0");
		}
		
		this.capacidadDeCarga = capacidadDeCarga;
		this.numero = numero;
		this.carga = 0;
	}

	public int obtenerNumero() {
		return this.numero;
	}

	public int obtenerCapacidadDeCarga() {
		return this.capacidadDeCarga;
	}

	public int obtenerCarga() {
		return this.carga;
	}

	public void cambiarCarga(int carga) {
		if(carga > 0 && carga <= this.capacidadDeCarga) {
			this.carga = carga;
		}
	}
	
}
