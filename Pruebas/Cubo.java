
class Cubo {

	private double lado;
	
	public Cubo (int lado) {
		if (lado >= 0) {
			this.lado = lado;
		} else {
			this.lado = 0;
		}
	}
	
	public double medirLongitudLado() {
		return this.lado;
	}
	
	public void cambiarLongitudLado(int lado) {
		this.lado = lado;
	}
	
	public double medirSuperficieCara() {
		return this.lado * this.lado;
	}
	
	public void cambiarSuperficieCara(int superficieCara) {
		this.lado = Math.sqrt(superficieCara);
	}
	
	public double medirVolumen() {
		return this.lado * this.lado * this.lado;
	}
	
	public void cambiarVolumen(int volumen) {
		this.lado = Math.cbrt(volumen);
	}
	
}
