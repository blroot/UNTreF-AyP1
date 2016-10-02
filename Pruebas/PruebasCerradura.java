import org.junit.Assert;
import org.junit.Test;

public class PruebasCerradura {

	@Test
	public void abrirConClaveCorrectaAbreLaCerradura() {
		Cerradura cerradura = new Cerradura(1234, 1);
		cerradura.abrir(1234);
		Assert.assertTrue(cerradura.estaAbierta());
		Assert.assertFalse(cerradura.estaCerrada());
	}
	
	@Test
	public void conDosIntentosDisponiblesAbrirConClaveIncorrectaNoAbreLaCerraduraYNoLaBloquea() {
		Cerradura cerradura = new Cerradura(123, 2);
		cerradura.abrir(1234);
		Assert.assertTrue(cerradura.estaCerrada());
		Assert.assertFalse(cerradura.estaAbierta());
		Assert.assertFalse(cerradura.fueBloqueada());
	}
	
	@Test
	public void conUnIntentoDisponibleAbrirConClaveIncorrectaNoAbreLaCerraduraYLaBLoquea() {
		Cerradura cerradura = new Cerradura(123, 1);
		cerradura.abrir(1234);
		Assert.assertTrue(cerradura.estaCerrada());
		Assert.assertFalse(cerradura.estaAbierta());
		Assert.assertTrue(cerradura.fueBloqueada());
	}
	
	@Test
	public void dosIntentosFallidosSonDosAperturasFallidas() {
		Cerradura cerradura = new Cerradura(123, 3);
		cerradura.abrir(1234);
		cerradura.abrir(1234);
		Assert.assertEquals(2, cerradura.contarAperturasFallidas());
	}
	
	@Test
	public void abrirCerraduraLuegoCerrarYabrirNuevamenteSonDosAperturasExitosas() {
		Cerradura cerradura = new Cerradura(1234, 3);
		cerradura.abrir(1234);
		cerradura.cerrar();
		cerradura.abrir(1234);
		Assert.assertEquals(2, cerradura.contarAperturasExitosas());
	}
	
	@Test
	public void noSePuedeAbrirSiFueBloqueada() {
		Cerradura cerradura = new Cerradura(1234, 2);
		cerradura.abrir(123);
		cerradura.abrir(123);
		cerradura.abrir(1234);
		Assert.assertTrue(cerradura.estaCerrada());
		Assert.assertFalse(cerradura.estaAbierta());
		Assert.assertTrue(cerradura.fueBloqueada());
	}
	
	@Test
	public void siEsAbiertaSeReinicianLosIntentosFallidos() {
		Cerradura cerradura = new Cerradura(1234, 2);
		cerradura.abrir(123);
		Assert.assertEquals(1, cerradura.contarAperturasFallidas());
		cerradura.abrir(1234);
		Assert.assertEquals(0, cerradura.contarAperturasFallidas());
	}
	
}
