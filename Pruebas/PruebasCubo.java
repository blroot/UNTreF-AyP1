import org.junit.Assert;
import org.junit.Test;

public class PruebasCubo {
	
	@Test
	public void cuboConLadoNegativoAsignaLadoCero() {
		Cubo cubo = new Cubo(-5);
		Assert.assertEquals(0, cubo.medirSuperficieCara(), 0);
		Assert.assertEquals(0, cubo.medirVolumen(), 0);
	}

	@Test
	public void cuboConLadoCeroTieneSuperficieYVolumenCero() {
		Cubo cubo = new Cubo(0);
		Assert.assertEquals(0, cubo.medirSuperficieCara(), 0);
		Assert.assertEquals(0, cubo.medirVolumen(), 0);
	}
	
	@Test
	public void cuboConLadoCuatroTieneSuperficieDeCara16() {
		Cubo cubo = new Cubo(4);
		Assert.assertEquals(16, cubo.medirSuperficieCara(), 0);
	}
	
	@Test
	public void cuboConLadoCuatroTieneVolumen64() {
		Cubo cubo = new Cubo(4);
		Assert.assertEquals(64, cubo.medirVolumen(), 0);
	}
	
	@Test
	public void cuboConLadoCuatroDevuelveLongitudDeLadoCuatro() {
		Cubo cubo = new Cubo(4);
		Assert.assertEquals(4, cubo.medirLongitudLado(), 0);
	}
	
	@Test
	public void cambiarSuperficieDeCaraA16CambiaLongitudDeLadoA4YVolumenA64() {
		Cubo cubo = new Cubo(4);
		cubo.cambiarSuperficieCara(16);
		Assert.assertEquals(4, cubo.medirLongitudLado(), 0);
		Assert.assertEquals(64, cubo.medirVolumen(), 0);
	}
	
	@Test
	public void cambiarVolumenA8CambiaLongitudDeLadoA2YSuperficieDeCaraA4() {
		Cubo cubo = new Cubo(4);
		cubo.cambiarVolumen(8);
		Assert.assertEquals(2, cubo.medirLongitudLado(), 0);
		Assert.assertEquals(4, cubo.medirSuperficieCara(), 0);
	}
	
}
