
public class DiasLluviosos {
	
	private boolean[] precipitaciones;
	
	public DiasLluviosos() {
		this.precipitaciones = new boolean[365];
	}

	public boolean consultarSiLlovioElDia(int diaDelAno) {
		this.validarRango(diaDelAno);
		return this.precipitaciones[diaDelAno-1];
	}

	public void registrarQueLlovioElDia(int diaDelAno, boolean llovio) {
		this.validarRango(diaDelAno);
		this.precipitaciones[diaDelAno-1] = llovio;
	}
	
	private void validarRango(int diaDelAno) {
		if (diaDelAno < 1 || diaDelAno >= 366) {
			throw new Error("Fuera de rango");
		}
	}

	public int contarDiasLluviosos() {
		int diasLluviosos = 0;
		for (int i = 0; i < this.precipitaciones.length; i++) {
			if (this.precipitaciones[i] == true) {
				diasLluviosos++;
			} 
		}
		return diasLluviosos;
	}

	public int consultarPrimerDiaConLluvia() {
		int primerDiaConLluvia = 0;
		for (int i = 0; i < this.precipitaciones.length && primerDiaConLluvia == 0; i++) {
			if (this.precipitaciones[i] == true) {
				primerDiaConLluvia = i+1;
			}
		}
		return primerDiaConLluvia;
	}

	public int consultarCuatrimestreMasLluvioso() {
		int cuatrimestreMasLluvioso = 0;
		int[] cuatrimestres = new int[3];
		
		cuatrimestres[0] = contarDiasLluviososPorRango(1, 120);
		cuatrimestres[1] = contarDiasLluviososPorRango(121, 243);
		cuatrimestres[2] = contarDiasLluviososPorRango(244, 365);
		
		for (int i = 0; i < cuatrimestres.length; i++) {
			if (cuatrimestres[i] > cuatrimestreMasLluvioso) {
				cuatrimestreMasLluvioso = i+1;
			}
		}
		return cuatrimestreMasLluvioso;
	}
	
	private int contarDiasLluviososPorRango(int primerDia, int ultimoDia) {
		int diasLluviosos = 0;
		for (int i = primerDia; i < ultimoDia+1; i++) {
			if (this.precipitaciones[i-1] == true) {
				diasLluviosos++;
			}
		}
		return diasLluviosos;
	}

}
