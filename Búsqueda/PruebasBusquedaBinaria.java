import org.junit.Test;
import org.junit.Assert;


public class PruebasBusquedaBinaria {

	@Test
	public void buscarUnElementoAusenteDelArregloRetornaNull() {
		
		int[] arreglo = { 1, 5, 6, 8, 20, 22, 35, 34, 50, 98, 102, 345, 566 };
		
		BusquedaBinaria busqueda = new BusquedaBinaria();
		
		Assert.assertNull(busqueda.buscar(arreglo, 2000));
	}
	
	@Test
	public void buscarElElemento5DelArregloRetornaSuPosicion() {
		
		int[] arreglo = { 1, 5, 6, 8, 20, 22, 35, 34, 50, 98, 102, 345, 566 };
		Integer posicion = 1;
		
		BusquedaBinaria busqueda = new BusquedaBinaria();
		
		Assert.assertEquals(posicion, busqueda.buscar(arreglo, 5));
	}
	
	@Test
	public void buscarElElemento35DelArregloRetornaSuPosicion() {
		
		int[] arreglo = { 1, 5, 6, 8, 20, 22, 35, 34, 50, 98, 102, 345, 566 };
		Integer posicion = 6;
		
		BusquedaBinaria busqueda = new BusquedaBinaria();
		
		Assert.assertEquals(posicion, busqueda.buscar(arreglo, 35));
	}
	
	@Test
	public void buscarElElemento566DelArregloRetornaSuPosicion() {
		
		int[] arreglo = { 1, 5, 6, 8, 20, 22, 35, 34, 50, 98, 102, 345, 566 };
		Integer posicion = 12;
		
		BusquedaBinaria busqueda = new BusquedaBinaria();
		
		Assert.assertEquals(posicion, busqueda.buscar(arreglo, 566));
	}
	
}
