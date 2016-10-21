
public class VerificarSucesion {
	
	private int ultimaPosicionIncorrecta;

	public boolean verificarSucesion2PotenciaNMenos1(int arrayAVerificar[]) {
		boolean sucesionCorrecta = true;
		for (int i = 0; i < arrayAVerificar.length-1 && sucesionCorrecta; i++) {
			if (arrayAVerificar[i]*2 != arrayAVerificar[i+1]) {
				this.ultimaPosicionIncorrecta = i+1;
				sucesionCorrecta = false;
			}
		}
		return sucesionCorrecta;
	}
	
	public int obtenerUltimaPosicionIncorrecta() {
		return this.ultimaPosicionIncorrecta;
	}

}
