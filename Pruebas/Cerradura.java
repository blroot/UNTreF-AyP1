
class Cerradura {

	/*
	 * Representa una cerradura compuesta por una clave
	 * y una cantidad de intentos consecutivos válidos
	 */
	
	private int claveDeApertura;
	private int cantidadDeFallosConsecutivosQueLaBloquean;
	private boolean estaAbierta = false;
	private boolean estaBloqueada = false;
	private int intentosExitosos = 0;
	private int intentosFallidos = 0;
	
	/*
	 * pre: cantidadDeFallosConsecutivosQueLaBloquean es un entero mayor a 0
	 * post: inicializa los atributos claveDeApertura y 
	 * 		cantidadDeFallosConsecutivosQueLaBloquean
	 */
	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
		if(cantidadDeFallosConsecutivosQueLaBloquean > 0) {
			this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
			this.claveDeApertura = claveDeApertura;
		}
		else {
			this.cantidadDeFallosConsecutivosQueLaBloquean = 1;
			this.claveDeApertura = claveDeApertura;
		}
	}
	
	/*
	 * post: intenta abrir la cerradura con clave
	 */
	public boolean abrir(int clave) {
		if (!estaBloqueada) {
			if (this.claveDeApertura == clave) {
				this.estaAbierta = true;
				this.intentosExitosos++;
				this.intentosFallidos = 0;
			}
			else {
				this.intentosFallidos++;
				if (this.intentosFallidos == this.cantidadDeFallosConsecutivosQueLaBloquean) {
					this.estaBloqueada = true;
				}
			}
		}
		return this.estaAbierta;
	}
	
	/*
	 * post: cierra la cerradura
	 */
	public void cerrar() {
		this.estaAbierta = false;
	}
	
	/*
	 * post: devuelve true si la cerradura está abierta
	 */
	public boolean estaAbierta() {
		return this.estaAbierta;
	}
	
	/*
	 * post: devuelve true si la cerradura está cerrada
	 */
	public boolean estaCerrada() {
		return !this.estaAbierta;
	}
	
	/*
	 * post: devuelve true si la cerradura está bloqueada
	 */
	public boolean fueBloqueada() {
		return this.estaBloqueada;
	}
	
	/*
	 * post: devuelve la cantidad de aperturas exitosas
	 */
	public int contarAperturasExitosas() {
		return this.intentosExitosos;
	}
	
	/*
	 * post: devuelve la cantidad de aperturas fallidas
	 */
	public int contarAperturasFallidas() {
		return this.intentosFallidos;
	}
	
}
