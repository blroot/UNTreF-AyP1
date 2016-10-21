import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PruebasVerificadorDeOrden {

	private VerificadorDeOrden verfificadorDeOrden;
	
	@Before
	public void crearObjetoVerificadorDeOrden () {
		this.verfificadorDeOrden = new VerificadorDeOrden();
	}
	
	@Test
	public void verificarOrdenDeArregloConValoresUnoDosTresCuatroYCincoDevuelveTrue() {
		int arrayAVerificar[] = {1, 2, 3, 4, 5};
		
		boolean arrayEstaOrdenado = this.verfificadorDeOrden.verificar(arrayAVerificar);
		
		Assert.assertTrue(arrayEstaOrdenado);
	}
	
	@Test
	public void verificarOrdenDeArregloConValoresUnoTresDosCuatroYCincoDevuelveFalse() {
		int arrayAVerificar[] = {1, 3, 2, 4, 5};
		
		boolean arrayEstaOrdenado = this.verfificadorDeOrden.verificar(arrayAVerificar);
		
		Assert.assertFalse(arrayEstaOrdenado);
	}
	
	@Test
	public void verificarOrdenDeArregloConValoresMenosUnoTresCincoDosCuatroYCincoDevuelveFalse() {
		int arrayAVerificar[] = {-1, 3, 5, 2, 4, 5};
		
		boolean arrayEstaOrdenado = this.verfificadorDeOrden.verificar(arrayAVerificar);
		
		Assert.assertFalse(arrayEstaOrdenado);
	}
	
}
