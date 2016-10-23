
public class Eslabon {
	
	private int numero;
	private double longitud;
	
	public Eslabon(int numero, double longitud) {
		if (numero < 1) {
			throw new Error("El número no puede ser menor que 1");
		}
		if (longitud <= 0) {
			throw new Error("La longitud no puede ser menor o igual que 0");
		}
		
		this.numero = numero;
		this.longitud = longitud;
	}

	public int obtenerNumero() {
		return this.numero;
	}

	public double obtenerLongitud() {
		return this.longitud;
	}

	public void cambiarLongitud(double longitud) {
		if(longitud <= 0) {
			throw new Error("La longitud no puede ser menor o igual que 0");
		}
		
		this.longitud = longitud;
	}
	
}
