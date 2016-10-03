
class ExpendedorDePasajes {
	
	private double precioPorKm;
	private int pasajesVendidos;
	private double distanciaMaxima;
	private double distanciaTotal;
	private double ventaTotal;
	
	/*
	 * pre: precioPorKm es mayor a 0
	 * post: inicializa el atributo precioPorKm
	 */
	public ExpendedorDePasajes(double precioPorKm) {
		if (precioPorKm > 0) {
			this.precioPorKm = precioPorKm;
		} else {
			this.precioPorKm = 1;
		}
	}
	
	/*
	 * pre: distanciaEnKm es mayor a 0
	 * post: vende un pasaje según la distancia indicada
	 */
	public double venderPasaje(double distanciaEnKm) {
		if (distanciaEnKm > this.distanciaMaxima) {
			this.distanciaMaxima = distanciaEnKm;
		}
		this.distanciaTotal += distanciaEnKm;
		this.pasajesVendidos++;
		this.ventaTotal += this.precioPorKm * distanciaEnKm;
		return this.precioPorKm * distanciaEnKm;
	}
	
	/*
	 * pre: cantidad y distanciaEnKm es mayor a 0
	 * post: vende varios pasajes según la cantidad y distancia indicada
	 */
	public double venderPasajes(int cantidad, double distanciaEnKm) {
		if (distanciaEnKm > this.distanciaMaxima) {
			this.distanciaMaxima = distanciaEnKm;
		}
		this.distanciaTotal += distanciaEnKm * cantidad;
		this.pasajesVendidos += cantidad;
		this.ventaTotal += this.precioPorKm * distanciaEnKm;
		return this.precioPorKm * distanciaEnKm * cantidad;
	}
	
	/*
	 * post: devuelve la cantidad de pasajes vendidos
	 */
	public int pasajesVendidos() {
		return pasajesVendidos;
	}
	
	/*
	 * post: devuelve la distancia máxima vendida
	 */
	public double distanciaMaxima() {
		return this.distanciaMaxima;
	}
	
	/*
	 * post: devuelve el promedio de la distancia vendida
	 */
	public double distanciaPromedio() {
		return this.distanciaTotal / this.pasajesVendidos;
	}
	
	/*
	 * post: devuelve el importe recaudado por ventas
	 */
	public double ventaTotal() {
		return this.ventaTotal;
	}
	
}
