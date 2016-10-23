
public class Cadena {
	
	private Eslabon[] eslabones;

	public Cadena(double[] longitudDeEslabones) {
		this.eslabones = new Eslabon[longitudDeEslabones.length];
		
		for(int i = 0; i < longitudDeEslabones.length; i++) {
			this.eslabones[i] = new Eslabon(i+1, longitudDeEslabones[i]);
		}
	}

	public int contarCantidadDeEslabones() {
		return this.eslabones.length;
	}

	public Eslabon obtenerEslabon(int numero) {
		if (numero-1 > this.eslabones.length || numero-1 < 0) {
			throw new Error("El eslabon no existe");
		}
		return this.eslabones[numero-1];
	}

	public double obtenerLongitud() {
		double longitudTotal = 0;
		
		for (int i = 0; i < this.eslabones.length; i++) {
			longitudTotal += this.eslabones[i].obtenerLongitud();
		}
		
		return longitudTotal;
	}

	public int contarEslabonesConLongitudSuperiorA(double longitudMinima) {
		int eslabonesTotales = 0;
		
		for (int i = 0; i < this.eslabones.length; i++) {
			if(this.eslabones[i].obtenerLongitud() > longitudMinima) {
				eslabonesTotales++;
			}
		}
		
		return eslabonesTotales;
	}
	
	
}
