import org.junit.Assert;
import org.junit.Test;


public class PruebasVagon {

	@Test
	public void seCreaUnVagonConNumeroUno() {
		Vagon vagon = new Vagon(1, 200);
		
		Assert.assertEquals(1, vagon.obtenerNumero());
	}
	
	@Test
	public void seCreaUnVagonConNumeroTres() {
		Vagon vagon = new Vagon(3, 200);
		
		Assert.assertEquals(3, vagon.obtenerNumero());
	}
	
	@Test(expected = Error.class)
	public void seCreaUnVagonConNumeroCeroDaError() {
		new Vagon(0, 200);
	}
	
	@Test(expected = Error.class)
	public void seCreaUnVagonConNumeroMenosUnoDaError() {
		new Vagon(-1, 200);
	}
	
	@Test(expected = Error.class)
	public void seCreaUnVagonConCapacidadMenosUnoDaError() {
		new Vagon(1, -1);
	}
	
	@Test
	public void seCreaUnVagonConCapacidad200() {
		Vagon vagon = new Vagon(3, 200);
		
		Assert.assertEquals(200, vagon.obtenerCapacidadDeCarga());
	}
	
	@Test
	public void seCreaUnVagonConCapacidad1000() {
		Vagon vagon = new Vagon(3, 1000);
		
		Assert.assertEquals(1000, vagon.obtenerCapacidadDeCarga());
	}
	
	@Test
	public void alCrearUnVagonSuCargaInicialEsCero() {
		Vagon vagon = new Vagon(3, 1000);
		
		Assert.assertEquals(0, vagon.obtenerCarga());
	}
	
	@Test
	public void alCambiarLaCargaA1000LaCargaEs1000() {
		Vagon vagon = new Vagon(3, 1000);
		
		vagon.cambiarCarga(1000);
		
		Assert.assertEquals(1000, vagon.obtenerCarga());
	}
	
	@Test
	public void alCambiarLaCargaAMenos300NoCambiaLaCarga() {
		Vagon vagon = new Vagon(3, 1000);
		
		vagon.cambiarCarga(-300);
		
		Assert.assertEquals(0, vagon.obtenerCarga());
	}
	
	@Test
	public void alCambiarLaCargaSiEsMayorQueLaCapacidadNoCambiaLaCarga() {
		Vagon vagon = new Vagon(3, 1000);
		
		vagon.cambiarCarga(1001);
		
		Assert.assertEquals(0, vagon.obtenerCarga());
	}
	
	
}
