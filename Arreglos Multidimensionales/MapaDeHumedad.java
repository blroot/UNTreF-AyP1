
public class MapaDeHumedad {
	
	private double[][] mapaDeHumedad;
	private int largo;
	private int ancho;
	private double humedadTotal;
	private double humedadMaximaRegistrada;
	private double humedadMinimaRegistrada = 100;
	private int muestrasRegistradas;

	public MapaDeHumedad(int largo, int ancho) {
		this.mapaDeHumedad = new double[largo][ancho];
		this.largo = largo;
		this.ancho = ancho;
	}
	

	public void almacenarMuestra(int fila, int columna, double porcentajeDeHumedad) {
		this.validarRangoDeTerreno(fila, columna);
		
		if (porcentajeDeHumedad < 0) {
			throw new Error("El porcentaje de humedad debe "
					+ "encontrarse entre 0 y 100");
		}
		
		this.registrarHumedadMaxima(porcentajeDeHumedad);
		this.registrarHumedadMinima(porcentajeDeHumedad);
		this.registrarHumedadTotal(fila, columna, porcentajeDeHumedad);
		
		this.mapaDeHumedad[fila-1][columna-1] = porcentajeDeHumedad;
	}
	

	public double obtenerMuestra(int fila, int columna) {
		this.validarRangoDeTerreno(fila, columna);
		
		return this.mapaDeHumedad[fila-1][columna-1];
	}
	
	
	private void validarRangoDeTerreno(int fila, int columna) {
		if(fila > this.largo 
				|| fila <= 0 
				|| columna > this.ancho 
				|| columna <= 0) {
			throw new Error("La coordenada ingresada "
					+ "se encuentra fuera del terreno");
		}
	}
	
	
	private void registrarHumedadMaxima(double porcentajeDeHumedad) {
		if (porcentajeDeHumedad > this.humedadMaximaRegistrada) {
			this.humedadMaximaRegistrada = porcentajeDeHumedad;
		}
	}
	
	
	private void registrarHumedadMinima(double porcentajeDeHumedad) {
		if (porcentajeDeHumedad < this.humedadMinimaRegistrada) {
			this.humedadMinimaRegistrada = porcentajeDeHumedad;
		}	
	}
	
	
	private void registrarHumedadTotal(int fila, int columna, double porcentajeDeHumedad) {
		if (this.mapaDeHumedad[fila-1][columna-1] == 0) {
			this.humedadTotal += porcentajeDeHumedad;
			this.muestrasRegistradas++;
		} else {
			this.humedadTotal -= this.mapaDeHumedad[fila-1][columna-1];
			this.humedadTotal += porcentajeDeHumedad;
		}
	}

	
	public double obtenerHumedadPromedio() {
		return this.humedadTotal / (this.largo * this.ancho);
	}

	
	public double obtenerHumedadMaxima() {
		return this.humedadMaximaRegistrada;
	}


	public double obtenerHumedadMinima() {
		double humedadMinima = 0.0;
		
		if (this.muestrasRegistradas == this.largo * this.ancho) {
			humedadMinima = this.humedadMinimaRegistrada;
		}
		
		return humedadMinima;
	}
	
	
}
