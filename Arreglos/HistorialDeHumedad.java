
public class HistorialDeHumedad {
	
	private int cantidadDeMediciones;
	private double[] muestrasDeHumedad;
	private int muestrasTomadas;

	public HistorialDeHumedad(int cantidadDeMediciones) {
		if(cantidadDeMediciones <= 0) {
			throw new Error("La cantidad de mediciones debe ser al menos 1");
		}
		
		this.muestrasDeHumedad = new double[cantidadDeMediciones];
		this.cantidadDeMediciones = cantidadDeMediciones;
	}

	public Object obtenerCantidadDeMedicionesEnUnDia() {
		return this.cantidadDeMediciones;
	}

	public void cambiarMuestra(int numeroDeMuestra, double humedad) {
		this.validarMuestra(numeroDeMuestra);
		
		if (humedad >= 0) {
			this.muestrasDeHumedad[numeroDeMuestra-1] = humedad;
			this.muestrasTomadas++;
		}
	}

	public double obtenerMuestra(int numeroDeMuestra) {
		this.validarMuestra(numeroDeMuestra);
		
		return this.muestrasDeHumedad[numeroDeMuestra-1];
	}

	private void validarMuestra(int numeroDeMuestra) {
		if(numeroDeMuestra > this.muestrasDeHumedad.length || numeroDeMuestra <= 0) {
			throw new Error("No existe la medición");
		}
	}

	public double calcularHumedadPromedio() {
		double humedadTotal = 0;
		
		for (int i = 0; i < this.muestrasDeHumedad.length; i++) {
			humedadTotal += this.muestrasDeHumedad[i];
		}
		
		return humedadTotal / this.muestrasTomadas;
	}

	public double obtenerMaximoValorDeHumedad() {
		double humedadMaxima = this.muestrasDeHumedad[0];
		
		for (int i = 1; i < this.muestrasDeHumedad.length; i++) {
			if (this.muestrasDeHumedad[i] > humedadMaxima) {
				humedadMaxima = this.muestrasDeHumedad[i];
			}
		}
		
		return humedadMaxima;
	}
	
	public double obtenerMinimoValorDeHumedad() {
		double humedadMinima = this.muestrasDeHumedad[0];
		
		for (int i = 1; i < this.muestrasDeHumedad.length; i++) {
			if (this.muestrasDeHumedad[i] < humedadMinima) {
				humedadMinima = this.muestrasDeHumedad[i];
			}
		}
		
		return humedadMinima;
	}
	
}
