
public class PronosticoSemanal {
	
	private double[] temperaturas;
	
	public PronosticoSemanal() {
		this.temperaturas = new double[7];
		for (int i = 0; i < this.temperaturas.length; i++) {
			this.temperaturas[i] = 25.0;
		}
	}

	public double obtenerTemperatura(int dia) {
		if (dia >= 8 || dia < 1) {
			throw new Error("Fuera de rango");
		}
		return this.temperaturas[dia-1];
	}

	public void pronosticarTemperatura(int dia, double temperatura) {
		if (dia >= 8 || dia < 1) {
			throw new Error("Fuera de rango");
		}
		this.temperaturas[dia-1] = temperatura;
	}

	public double calcularTemperaturaPromedio() {
		double sumaDeTemperaturas = 0;
		for (int i = 0; i < this.temperaturas.length; i++) {
			sumaDeTemperaturas += this.temperaturas[i];
		}
		return sumaDeTemperaturas/this.temperaturas.length;
	}

	public double buscarTemperaturaMaxima() {
		double temperaturaMaxima = this.temperaturas[0];
		for (int i = 0; i < this.temperaturas.length; i++) {
			if (temperaturaMaxima < this.temperaturas[i]) {
				temperaturaMaxima = this.temperaturas[i];
			}
		}
		return temperaturaMaxima;
	}

	public double buscarTemperaturaMinima() {
		double temperaturaMinima = this.temperaturas[0];
		for (int i = 0; i < this.temperaturas.length; i++) {
			if (temperaturaMinima > this.temperaturas[i]) {
				temperaturaMinima = this.temperaturas[i];
			}
		}
		return temperaturaMinima;
	}
	
}
