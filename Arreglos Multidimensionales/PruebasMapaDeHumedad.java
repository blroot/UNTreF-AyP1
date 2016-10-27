import org.junit.Test;
import org.junit.Assert;

public class PruebasMapaDeHumedad {

	@Test
	public void seContruyeUnMapaDeHumedadDeUnTerrenoDe8x8() {
		MapaDeHumedad mapa = new MapaDeHumedad(8, 8);
		
		Assert.assertNotNull(mapa);
	}
	
	
	@Test
	public void seAlmacenaUnaMuestraSegunCoordenadasUnoYUno() {
		MapaDeHumedad mapa = new MapaDeHumedad(8, 8);
		
		mapa.almacenarMuestra(1, 1, 50.0);
		
		Assert.assertEquals(50.0, mapa.obtenerMuestra(1, 1),0);
	}
	
	
	@Test(expected = Error.class)
	public void almacenarUnaMuestraSegunFilaFueraDeRangoDaError() {
		MapaDeHumedad mapa = new MapaDeHumedad(8, 8);
		
		mapa.almacenarMuestra(9, 1, 50.0);
	}
	
	
	@Test(expected = Error.class)
	public void almacenarUnaMuestraSegunColumnaFueraDeRangoDaError() {
		MapaDeHumedad mapa = new MapaDeHumedad(8, 8);
		
		mapa.almacenarMuestra(8, 9, 50.0);
	}
	
	
	@Test(expected = Error.class)
	public void almacenarUnaMuestraConValorNegativoDaError() {
		MapaDeHumedad mapa = new MapaDeHumedad(8, 8);
		
		mapa.almacenarMuestra(8, 1, -1.0);
	}
	
	
	@Test
	public void seAlmacenaUnaMuestraSegunCoordenadasTresYCuatro() {
		MapaDeHumedad mapa = new MapaDeHumedad(8, 8);
		
		mapa.almacenarMuestra(3, 4, 100.0);
		
		Assert.assertEquals(100.0, mapa.obtenerMuestra(3, 4),0);
	}
	
	
	@Test(expected = Error.class)
	public void obtenerUnaMuestraSegunFilaFueraDeRangoDaError() {
		MapaDeHumedad mapa = new MapaDeHumedad(8, 8);
		
		mapa.obtenerMuestra(10, 2);		
	}
	
	
	@Test(expected = Error.class)
	public void obtenerUnaMuestraSegunColumnaFueraDeRangoDaError() {
		MapaDeHumedad mapa = new MapaDeHumedad(8, 8);
		
		mapa.obtenerMuestra(1, 12);		
	}
	
	
	@Test
	public void siTengoCuatroMuestrasCon50PorcientoDeHumedadPromedioTotalEs12Punto5() {
		MapaDeHumedad mapa = new MapaDeHumedad(4, 4);
		
		mapa.almacenarMuestra(1, 1, 50.0);
		mapa.almacenarMuestra(2, 2, 50.0);
		mapa.almacenarMuestra(3, 3, 50.0);
		mapa.almacenarMuestra(4, 4, 50.0);
		
		Assert.assertEquals(12.5, mapa.obtenerHumedadPromedio(), 0);
	}
	
	
	@Test
	public void siTengoOchoMuestrasLaMitadCon50YElResto30PorcientoDeHumedadPromedioTotalEs20() {
		MapaDeHumedad mapa = new MapaDeHumedad(4, 4);
		
		mapa.almacenarMuestra(1, 1, 50.0);
		mapa.almacenarMuestra(1, 2, 50.0);
		mapa.almacenarMuestra(1, 3, 50.0);
		mapa.almacenarMuestra(1, 4, 50.0);
		
		mapa.almacenarMuestra(2, 1, 30.0);
		mapa.almacenarMuestra(2, 2, 30.0);
		mapa.almacenarMuestra(2, 3, 30.0);
		mapa.almacenarMuestra(2, 4, 30.0);
		
		Assert.assertEquals(20.0, mapa.obtenerHumedadPromedio(), 0);
	}
	
	
	@Test
	public void siTengoCuatroMuestrasCon50PorcientoDeHumedadElMaximoEs50() {
		MapaDeHumedad mapa = new MapaDeHumedad(4, 4);
		
		mapa.almacenarMuestra(1, 1, 50.0);
		mapa.almacenarMuestra(2, 2, 50.0);
		mapa.almacenarMuestra(3, 3, 50.0);
		mapa.almacenarMuestra(4, 4, 50.0);
		
		Assert.assertEquals(50.0, mapa.obtenerHumedadMaxima(), 0);
	}
	
	
	@Test
	public void siTengoOchoMuestrasLaMitadCon60YElResto30PorcientoDeHumedadElMaximoEs60() {
		MapaDeHumedad mapa = new MapaDeHumedad(4, 4);
		
		mapa.almacenarMuestra(1, 1, 60.0);
		mapa.almacenarMuestra(1, 2, 60.0);
		mapa.almacenarMuestra(1, 3, 60.0);
		mapa.almacenarMuestra(1, 4, 60.0);
		
		mapa.almacenarMuestra(2, 1, 30.0);
		mapa.almacenarMuestra(2, 2, 30.0);
		mapa.almacenarMuestra(2, 3, 30.0);
		mapa.almacenarMuestra(2, 4, 30.0);
		
		Assert.assertEquals(60.0, mapa.obtenerHumedadMaxima(), 0);
	}
	
	
	@Test
	public void siNoSeLLenoElTerrenoElMinimoDeHumedadEs0() {
		MapaDeHumedad mapa = new MapaDeHumedad(4, 4);
		
		mapa.almacenarMuestra(1, 1, 50.0);
		mapa.almacenarMuestra(2, 2, 50.0);
		mapa.almacenarMuestra(3, 3, 50.0);
		mapa.almacenarMuestra(4, 4, 50.0);
		
		Assert.assertEquals(0.0, mapa.obtenerHumedadMinima(), 0);
	}
	
	
	@Test
	public void siTengoOchoMuestrasLaMitadCon60YElResto30PorcientoDeHumedadElMinimoEs0() {
		MapaDeHumedad mapa = new MapaDeHumedad(4, 4);
		
		mapa.almacenarMuestra(1, 1, 60.0);
		mapa.almacenarMuestra(1, 2, 60.0);
		mapa.almacenarMuestra(1, 3, 60.0);
		mapa.almacenarMuestra(1, 4, 60.0);
		
		mapa.almacenarMuestra(2, 1, 30.0);
		mapa.almacenarMuestra(2, 2, 30.0);
		mapa.almacenarMuestra(2, 3, 30.0);
		mapa.almacenarMuestra(2, 4, 30.0);
		
		Assert.assertEquals(0.0, mapa.obtenerHumedadMinima(), 0);
	}
	
	
	@Test
	public void siLlenoElTerrenoConMuestrasAl50PorcientoElMinimoEs50() {
		MapaDeHumedad mapa = new MapaDeHumedad(2, 2);
		
		mapa.almacenarMuestra(1, 1, 50.0);
		mapa.almacenarMuestra(1, 2, 50.0);
		mapa.almacenarMuestra(2, 1, 50.0);
		mapa.almacenarMuestra(2, 2, 50.0);
		
		Assert.assertEquals(50.0, mapa.obtenerHumedadMinima(), 0);
	}
	
	
}
