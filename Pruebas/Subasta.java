
public class Subasta {
	
	private String articulo;
	private float precioBase;
	private float ofertaGanadora;
	private boolean subastaCerrada;

	/**
	* post: crea una Subasta para el artículo indicado y
	* con el precioBase indicado.
	*/
	public Subasta(String articulo, float precioBase) {
		if (articulo != "" && precioBase > 0) {
			this.articulo = articulo;
			this.precioBase = precioBase;
		} else {
			Error error = new Error("Los parámetros son incorrectos");
			throw error;
		}
	}
	
	/**
	* post: devuelve el artículo que se subasta.
	*/
	public String obtenerArticulo() {
		return this.articulo;
	}
	
	/**
	* post: realiza una oferta por el artículo. Si la oferta es mayor
	* al precioBase y a la ofertaGanadora,
	* esta pasa a ser la nueva ofertaGanadora.
	*/
	public void ofertar(float oferta) {
		if (oferta > this.ofertaGanadora && oferta > this.precioBase && !this.subastaCerrada) {
			this.ofertaGanadora = oferta;
		}
	}
	
	/**
	* post: devuelve la máxima oferta realizada sobre la Subasta.
	*/
	public float obtenerOfertaGanadora() {
		return this.ofertaGanadora;
	}
	
	/**
	* post: cierra la Subasta, cualquier oferta realizada con posterioridad
	* es ignorada.
	*/
	public void cerrar() {
		this.subastaCerrada = true;
	}

}