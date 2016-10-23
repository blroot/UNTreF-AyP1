import org.junit.Assert;
import org.junit.Test;


public class PruebasEslabon {

	@Test
	public void crearUnEslabonConNumeroTresCreaEslabonConNumeroTres () {
		Eslabon eslabon = new Eslabon(3, 8.0);
		
		Assert.assertEquals(3, eslabon.obtenerNumero());
	}
	
	@Test
	public void crearUnEslabonConNumeroTresCreaEslabonConNumeroCuatro () {
		Eslabon eslabon = new Eslabon(4, 8.0);
		
		Assert.assertEquals(4, eslabon.obtenerNumero());
	}
	
	@Test(expected = Error.class)
	public void crearUnEslabonConNumeroMenosUnoDaError () {
		new Eslabon(-1, 8.0);
	}
	
	@Test(expected = Error.class)
	public void crearUnEslabonConLongitudCeroDaError () {
		new Eslabon(2, 0.0);
	}
	
	@Test
	public void crearUnEslabonConLongitudCuatroCreaEslabonConLongitudCuatro() {
		Eslabon eslabon = new Eslabon(2, 4.0);
		
		Assert.assertEquals(4.0, eslabon.obtenerLongitud(), 0);
	}
	
	@Test
	public void crearUnEslabonConLongitudCincoCreaEslabonConLongitudCinco() {
		Eslabon eslabon = new Eslabon(2, 5.0);
		
		Assert.assertEquals(5.0, eslabon.obtenerLongitud(), 0);
	}
	
	@Test
	public void cambiarLongitudAVeinteCambiaLongitudAVeinte() {
		Eslabon eslabon = new Eslabon(2, 5.0);
		
		eslabon.cambiarLongitud(20.0);
		
		Assert.assertEquals(20.0, eslabon.obtenerLongitud(), 0);
	}
	
	@Test(expected = Error.class)
	public void cambiarLongitudACeroDaError() {
		Eslabon eslabon = new Eslabon(2, 5.0);
		
		eslabon.cambiarLongitud(0.0);
	}
	
}
