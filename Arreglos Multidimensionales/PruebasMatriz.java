import org.junit.Assert;
import org.junit.Test;


public class PruebasMatriz {

	@Test
	public void seCreaUnaMatrizDeDosPorDos() {
		int[][] matrizIdentidad = {{1,0},{0,1}};
		
		Matriz matriz = new Matriz(matrizIdentidad);
		
		Assert.assertEquals(2, matriz.getFilas());
		Assert.assertEquals(2, matriz.getColumnas());
	}
	
	@Test
	public void seCreaUnaMatrizDeCincoPorCinco() {
		int[][] matrizIdentidad = {{1,0,0,0,0}
								  ,{0,1,0,0,0}
								  ,{0,0,1,0,0}
								  ,{0,0,0,1,0}
								  ,{0,0,0,0,1}};
		
		Matriz matriz = new Matriz(matrizIdentidad);
		
		Assert.assertEquals(5, matriz.getFilas());
		Assert.assertEquals(5, matriz.getColumnas());
	}
		
	@Test
	public void sumarDosMatricesIdentidadesDeCincoPorCincoDaUnaMatrizDiagonalPrincipalDos() {
		int[][] matrizIdentidad = {{1,0,0,0,0}
								  ,{0,1,0,0,0}
								  ,{0,0,1,0,0}
								  ,{0,0,0,1,0}
								  ,{0,0,0,0,1}};
		
		int[][] matrizIdentidad2 = {{1,0,0,0,0}
								   ,{0,1,0,0,0}
								   ,{0,0,1,0,0}
								   ,{0,0,0,1,0}
								   ,{0,0,0,0,1}};
		
		int[][] matrizDiagonalDos = {{2,0,0,0,0}
								    ,{0,2,0,0,0}
								    ,{0,0,2,0,0}
								    ,{0,0,0,2,0}
								    ,{0,0,0,0,2}};
		
		Matriz matriz = new Matriz(matrizIdentidad);
		Matriz matrizASumar = new Matriz(matrizIdentidad2);
		
		Matriz matrizResultante = matriz.sumarMatriz(matrizASumar);
		
		Assert.assertArrayEquals(matrizDiagonalDos, matrizResultante.getMatriz());
		
	}
	
	@Test
	public void sumarDosMatricesIdentidadesDeDosPorDosDaUnaMatrizDiagonalPrincipalDos() {
		int[][] matrizIdentidad = {{1,0},{0,1}};
		
		int[][] matrizIdentidad2 = {{1,0},{0,1}};
		
		int[][] matrizDiagonalDos = {{2,0},{0,2}};
		
		Matriz matriz = new Matriz(matrizIdentidad);
		Matriz matrizASumar = new Matriz(matrizIdentidad2);
		
		Matriz matrizResultante = matriz.sumarMatriz(matrizASumar);
		
		Assert.assertArrayEquals(matrizDiagonalDos, matrizResultante.getMatriz());
		
	}
	
	@Test(expected = Error.class)
	public void sumarDosMatricesConDiferenteDimensionDaError() {
		int[][] matrizIdentidad = {{1,0},{0,1}};
		
		int[][] matrizIdentidad2 = {{1,0,0},{0,1,0},{0,0,1}};
	
		Matriz matriz = new Matriz(matrizIdentidad);
		Matriz matrizASumar = new Matriz(matrizIdentidad2);
		
		matriz.sumarMatriz(matrizASumar);
	}
	
	@Test
	public void restarDosMatricesIdentidadesDeCincoPorCincoDaUnaMatrizConTodosValoresCero() {
		int[][] matrizIdentidad = {{1,0,0,0,0}
								  ,{0,1,0,0,0}
								  ,{0,0,1,0,0}
								  ,{0,0,0,1,0}
								  ,{0,0,0,0,1}};
		
		int[][] matrizIdentidad2 = {{1,0,0,0,0}
								   ,{0,1,0,0,0}
								   ,{0,0,1,0,0}
								   ,{0,0,0,1,0}
								   ,{0,0,0,0,1}};
		
		int[][] matrizVacia = {{0,0,0,0,0}
							  ,{0,0,0,0,0}
							  ,{0,0,0,0,0}
							  ,{0,0,0,0,0}
							  ,{0,0,0,0,0}};
		
		Matriz matriz = new Matriz(matrizIdentidad);
		Matriz matrizARestar = new Matriz(matrizIdentidad2);
		
		Matriz matrizResultante = matriz.restarMatriz(matrizARestar);
		
		Assert.assertArrayEquals(matrizVacia, matrizResultante.getMatriz());
		
	}
	
	@Test(expected = Error.class)
	public void restarDosMatricesConDiferenteDimensionDaError() {
		int[][] matrizIdentidad = {{1,0},{0,1}};
		
		int[][] matrizIdentidad2 = {{1,0,0},{0,1,0},{0,0,1}};
	
		Matriz matriz = new Matriz(matrizIdentidad);
		Matriz matrizARestar = new Matriz(matrizIdentidad2);
		
		matriz.restarMatriz(matrizARestar);
	}
	
	@Test
	public void multiplicarPorEscalarDosAUnaMatrizIdentidadDeDosPorDosDaMatrizDiagonalPrincipalDos() {
		int[][] matrizIdentidad = {{1,0},{0,1}};
		
		int[][] matrizDiagonalDos = {{2,0},{0,2}};
		
		Matriz matriz = new Matriz(matrizIdentidad);
		
		Matriz matrizResultante = matriz.multiplicarPorEscalar(2);
		
		Assert.assertArrayEquals(matrizDiagonalDos, matrizResultante.getMatriz());
		
	}
	
}
