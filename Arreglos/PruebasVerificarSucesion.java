import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PruebasVerificarSucesion {

	private VerificarSucesion verificarSucesion;
	
	@Before
	public void crearObjetoVerificarSucesion() {
		this.verificarSucesion = new VerificarSucesion();
	}
	
	@Test
	public void laSucesionUnoDosCuatroOchoTieneTermino2AlaNMenos1 () {
		int arrayAVerificar[] = {1, 2, 4, 8};
		
		boolean sucesionCorrecta = this.verificarSucesion.verificarSucesion2PotenciaNMenos1(arrayAVerificar);
		
		Assert.assertTrue(sucesionCorrecta);
	}
	
	@Test
	public void laSucesionUnoTresCuatroOchoNoTieneTermino2AlaNMenos1 () {
		int arrayAVerificar[] = {1, 3, 4, 8};
		
		boolean sucesionCorrecta = this.verificarSucesion.verificarSucesion2PotenciaNMenos1(arrayAVerificar);
		
		Assert.assertFalse(sucesionCorrecta);
		Assert.assertEquals(1, this.verificarSucesion.obtenerUltimaPosicionIncorrecta());
	}
	
	@Test
	public void laSucesionUnoDosCuatroOchoDiezNoTieneTermino2AlaNMenos1 () {
		int arrayAVerificar[] = {1, 2, 4, 8, 10};
		
		boolean sucesionCorrecta = this.verificarSucesion.verificarSucesion2PotenciaNMenos1(arrayAVerificar);
		
		Assert.assertFalse(sucesionCorrecta);
		Assert.assertEquals(4, this.verificarSucesion.obtenerUltimaPosicionIncorrecta());
	}
	
}
