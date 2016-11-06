import org.junit.Test;
import org.junit.Assert;


public class PruebasOrdenamiento {

	@Test
	public void pruebaConArrayDesordenado() {
		int[] array = { 54, 25, 86, 12, 65, 76, 1, 68, 76, 87 };
		int[] arrayEsperado = {1, 12, 25, 54, 65, 68, 76, 76, 86, 87};
		
		OrdenadorPorSeleccion ordenador = new OrdenadorPorSeleccion();
		
		Assert.assertArrayEquals(arrayEsperado, ordenador.ordenar(array));
	}
	
	@Test
	public void pruebaConArrayOrdenado() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arrayEsperado = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		OrdenadorPorSeleccion ordenador = new OrdenadorPorSeleccion();
		
		Assert.assertArrayEquals(arrayEsperado, ordenador.ordenar(array));
	}
	
	@Test
	public void pruebaConArrayOrdenadoDeMayorAMenor() {
		int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] arrayEsperado = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		OrdenadorPorSeleccion ordenador = new OrdenadorPorSeleccion();
		
		Assert.assertArrayEquals(arrayEsperado, ordenador.ordenar(array));
	}
	
	@Test
	public void pruebaConArrayDesordenadoBurbujeo() {
		int[] array = { 54, 25, 86, 12, 65, 76, 1, 68, 76, 87 };
		int[] arrayEsperado = {1, 12, 25, 54, 65, 68, 76, 76, 86, 87};
		
		OrdenadorPorBurbujeo ordenador = new OrdenadorPorBurbujeo();
		
		Assert.assertArrayEquals(arrayEsperado, ordenador.ordenar(array));
	}
	
	@Test
	public void pruebaConArrayOrdenadoBurbujeo() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arrayEsperado = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		OrdenadorPorBurbujeo ordenador = new OrdenadorPorBurbujeo();
		
		Assert.assertArrayEquals(arrayEsperado, ordenador.ordenar(array));
	}
	
	@Test
	public void pruebaConArrayOrdenadoDeMayorAMenorBurbujeo() {
		int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] arrayEsperado = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		OrdenadorPorBurbujeo ordenador = new OrdenadorPorBurbujeo();
		
		Assert.assertArrayEquals(arrayEsperado, ordenador.ordenar(array));
	}
	
}
