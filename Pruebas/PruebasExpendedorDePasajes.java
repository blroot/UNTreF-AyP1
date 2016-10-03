import org.junit.Test;
import org.junit.Assert;

public class PruebasExpendedorDePasajes {

	@Test
	public void siVendeUnPasajePasajesVendidosEsUno() {
		ExpendedorDePasajes expendedor = new ExpendedorDePasajes(1);
		expendedor.venderPasaje(1);
		Assert.assertEquals(1, expendedor.pasajesVendidos(), 0);
	}
	
	@Test
	public void siVendeQuinientosPasajesPasajesVendidosEsQuinientos() {
		ExpendedorDePasajes expendedor = new ExpendedorDePasajes(1);
		expendedor.venderPasajes(500, 1);
		Assert.assertEquals(500, expendedor.pasajesVendidos(), 0);
	}
	
	@Test
	public void siNoVendioNadaPasajesVendidosEsCero() {
		ExpendedorDePasajes expendedor = new ExpendedorDePasajes(1);
		Assert.assertEquals(0, expendedor.pasajesVendidos(), 0);
	}
	
	@Test
	public void siVendePasajePorMilKmDistanciaMaximaEsMil() {
		ExpendedorDePasajes expendedor = new ExpendedorDePasajes(1);
		expendedor.venderPasaje(1000);
		Assert.assertEquals(1000, expendedor.distanciaMaxima(), 0);
	}
	
	@Test
	public void siVendeDosPasajesPorMilKmDistanciaMaximaEsMil() {
		ExpendedorDePasajes expendedor = new ExpendedorDePasajes(1);
		expendedor.venderPasajes(2, 1000);
		Assert.assertEquals(1000, expendedor.distanciaMaxima(), 0);
	}
	
	@Test
	public void siVendeDosPasajesPorMilKmDistanciaPromedioEsMil() {
		ExpendedorDePasajes expendedor = new ExpendedorDePasajes(1);
		expendedor.venderPasajes(2, 1000);
		Assert.assertEquals(1000, expendedor.distanciaPromedio(), 0);
	}
	
	@Test
	public void siVendeDosPasajesUnoPorMilYOtroPorQuinientosKmDistanciaPromedioEs750() {
		ExpendedorDePasajes expendedor = new ExpendedorDePasajes(1);
		expendedor.venderPasaje(1000);
		expendedor.venderPasaje(500);
		Assert.assertEquals(750, expendedor.distanciaPromedio(), 0);
	}
	
	@Test
	public void conPrecioPorKmUnoSiVendeDosPasajesUnoPorMilYOtroPorQuinientosKmVentaTotalEs1500() {
		ExpendedorDePasajes expendedor = new ExpendedorDePasajes(1);
		expendedor.venderPasaje(1000);
		expendedor.venderPasaje(500);
		Assert.assertEquals(1500, expendedor.ventaTotal(), 0);
	}
	
	@Test
	public void conPrecioPorKmCincuentaSiVendeDosPasajesUnoPorMilYOtroPorQuinientosKmVentaTotalEs75000() {
		ExpendedorDePasajes expendedor = new ExpendedorDePasajes(50);
		expendedor.venderPasaje(1000);
		expendedor.venderPasaje(500);
		Assert.assertEquals(75000, expendedor.ventaTotal(), 0);
	}
	
	@Test
	public void siVendeDosPasajesUnoPorMilYOtroPorQuinientosKmDistanciaMaximaEsMil() {
		ExpendedorDePasajes expendedor = new ExpendedorDePasajes(50);
		expendedor.venderPasaje(1000);
		expendedor.venderPasaje(500);
		Assert.assertEquals(1000, expendedor.distanciaMaxima(), 0);
	}
	
}
