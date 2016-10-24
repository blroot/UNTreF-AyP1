import org.junit.Assert;
import org.junit.Test;


public class PruebasTren {

	@Test
	public void alCrearTrenConCodigoManhattanSeCreaConCodigoManhattan() {
		int[] capacidadesDeCarga = {100, 200, 300};
		Tren tren = new Tren("manhattan", capacidadesDeCarga);
		
		Assert.assertEquals("manhattan", tren.obtenerCodigo());
	}
	
	@Test(expected = Error.class)
	public void alCrearTrenConCodigoVacioDaError() {
		int[] capacidadesDeCarga = {100, 200, 300};
		new Tren("", capacidadesDeCarga);
	}
	
	@Test
	public void alCrearUnTrenConTresCapacidadesDeCargaSeCreaUnTrenConTresVagones() {
		int[] capacidadesDeCarga = {100, 200, 300};
		Tren tren = new Tren("manhattan", capacidadesDeCarga);
		
		Assert.assertEquals(100, tren.obtenerVagon(1).obtenerCapacidadDeCarga());
		Assert.assertEquals(200, tren.obtenerVagon(2).obtenerCapacidadDeCarga());
		Assert.assertEquals(300, tren.obtenerVagon(3).obtenerCapacidadDeCarga());
	}
	
	@Test(expected = Error.class)
	public void alObtenerCapacidadDeCargaDeUnVagonInexistenteDaError() {
		int[] capacidadesDeCarga = {100, 200, 300};
		Tren tren = new Tren("manhattan", capacidadesDeCarga);
		
		tren.obtenerVagon(5);
	}
	
	@Test
	public void alCargar100EnTresVagonesCargaTotalEs300() {
		int[] capacidadesDeCarga = {100, 200, 300};
		Tren tren = new Tren("manhattan", capacidadesDeCarga);
		
		tren.obtenerVagon(1).cambiarCarga(100);
		tren.obtenerVagon(2).cambiarCarga(100);
		tren.obtenerVagon(3).cambiarCarga(100);
		
		Assert.assertEquals(300, tren.obtenerCargaTotal());
	}
	
	@Test
	public void alCargar50EnTresVagonesCargaTotalEs150() {
		int[] capacidadesDeCarga = {100, 200, 300};
		Tren tren = new Tren("manhattan", capacidadesDeCarga);
		
		tren.obtenerVagon(1).cambiarCarga(50);
		tren.obtenerVagon(2).cambiarCarga(50);
		tren.obtenerVagon(3).cambiarCarga(50);
		
		Assert.assertEquals(150, tren.obtenerCargaTotal());
	}
	
	@Test
	public void conTresVagonesCargadosConCienDoscientosYCuatrocientosVagonesPorEncimaDelPromedioEsUno() {
		int[] capacidadesDeCarga = {100, 200, 400};
		Tren tren = new Tren("manhattan", capacidadesDeCarga);
		
		tren.obtenerVagon(1).cambiarCarga(100);
		tren.obtenerVagon(2).cambiarCarga(200);
		tren.obtenerVagon(3).cambiarCarga(400);
		
		Assert.assertEquals(1, tren.contarVagonesConCargaSuperiorAlPromedio());
	}
	
	@Test
	public void conTresVagonesCargadosConCienTrescientosCuatrocientosSetecientosYMilVagonesPorEncimaDelPromedioSonDos() {
		int[] capacidadesDeCarga = {100, 300, 400, 700, 1000};
		Tren tren = new Tren("manhattan", capacidadesDeCarga);
		
		tren.obtenerVagon(1).cambiarCarga(100);
		tren.obtenerVagon(2).cambiarCarga(300);
		tren.obtenerVagon(3).cambiarCarga(400);
		tren.obtenerVagon(1).cambiarCarga(700);
		tren.obtenerVagon(2).cambiarCarga(1000);
		
		Assert.assertEquals(2, tren.contarVagonesConCargaSuperiorAlPromedio());
	}
	
}
