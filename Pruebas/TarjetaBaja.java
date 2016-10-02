
class TarjetaBaja {
	
	public double saldo;
	public int viajesEnSubte = 0;
	public int viajesEnColectivo = 0;

	public TarjetaBaja(double saldoInicial) {
		if (saldoInicial >= 0) {
			this.saldo = saldoInicial;
		} else {
			this.saldo = 0;
		}
	}
	
	public double obtenerSaldo() {
		return this.saldo;
	}
	
	public void cargar(double monto) {
		if (monto >= 0) {
			this.saldo += monto;
		}
	}
	
	public void pagarViajeEnColectivo() {
		if (this.saldo >= 1.25) {
			this.saldo -= 1.25;
			this.viajesEnColectivo++;
		}
	}
	
	public void pagarViajeEnSubte() {
		if (this.saldo >= 2.50) {
			this.saldo -= 2.50;
			this.viajesEnSubte++;
		}
	}
	
	public int contarViajes() {
		return this.viajesEnColectivo + this.viajesEnSubte;
	}
	
	public int contarViajesEnColectivo() {
		return this.viajesEnColectivo;
	}
	
	public int contarViajesEnSubte() {
		return this.viajesEnSubte;
	}
	
}
