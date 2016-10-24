
public class Tren {

	private String codigo;
	private Vagon[] vagones;
	
	public Tren(String codigo, int[] capacidadesDeCarga) {
		if (codigo.length() <= 0) {
			throw new Error("Debe ingresar un código");
		}
		
		this.vagones = new Vagon[capacidadesDeCarga.length];
		for (int i = 0; i < capacidadesDeCarga.length; i++) {
			this.vagones[i] = new Vagon(i+1, capacidadesDeCarga[i]);
		}
		
		this.codigo = codigo;
	}

	public String obtenerCodigo() {
		return this.codigo;
	}

	public Vagon obtenerVagon(int numero) {
		if (numero > this.vagones.length || numero <= 0) {
			throw new Error("No existe el Vagon");
		}
		
		return this.vagones[numero-1];
	}

	public int obtenerCargaTotal() {
		int cargaTotal = 0;
		
		for (int i = 0; i < this.vagones.length; i++) {
			cargaTotal += this.vagones[i].obtenerCarga();
		}
		
		return cargaTotal;
	}

	public int contarVagonesConCargaSuperiorAlPromedio() {
		int promedioDeCargaTotal = this.obtenerCargaTotal() / this.vagones.length;
		int vagonesConCargaSuperiorAlPromedio = 0;
		
		for (int i = 0; i < this.vagones.length; i++) {
			if (this.vagones[i].obtenerCarga() > promedioDeCargaTotal) {
				vagonesConCargaSuperiorAlPromedio++;
			}
		}
		
		return vagonesConCargaSuperiorAlPromedio;
	}
	
	
	
}
