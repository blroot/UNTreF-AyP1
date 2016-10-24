import org.junit.Assert;
import org.junit.Test;


public class PruebasHistorialDeHumedad {

	@Test
	public void siSeConstruyeCon24MedicionesSeHaran24Mediciones() {
		HistorialDeHumedad historial = new HistorialDeHumedad(24);
		
		Assert.assertEquals(24, historial.obtenerCantidadDeMedicionesEnUnDia());
	}
	
	@Test
	public void siSeConstruyeCon4MedicionesSeHaran4Mediciones() {
		HistorialDeHumedad historial = new HistorialDeHumedad(4);
		
		Assert.assertEquals(4, historial.obtenerCantidadDeMedicionesEnUnDia());
	}
	
	@Test(expected = Error.class)
	public void siSeConstruyeCon0MedicionesDaError() {
		new HistorialDeHumedad(0);
	}
	
	@Test(expected = Error.class)
	public void siSeConstruyeConMenos5MedicionesDaError() {
		new HistorialDeHumedad(-5);
	}
	
	@Test
	public void laMuestraNumero3Contiene30PorcientoDeHumedad() {
		HistorialDeHumedad historial = new HistorialDeHumedad(24);
		
		historial.cambiarMuestra(3, 30.0);
		
		Assert.assertEquals(30.0, historial.obtenerMuestra(3), 0);
	}
	
	@Test
	public void laMuestraNumero8Contiene50PorcientoDeHumedad() {
		HistorialDeHumedad historial = new HistorialDeHumedad(24);
		
		historial.cambiarMuestra(8, 50.0);
		
		Assert.assertEquals(50.0, historial.obtenerMuestra(8), 0);
	}
	
	@Test(expected = Error.class)
	public void siTiene8MedicionesPorDiaAlIntentarAccederALaMuestra10DaError() {
		HistorialDeHumedad historial = new HistorialDeHumedad(8);
		
		historial.obtenerMuestra(10);
	}
	
	@Test(expected = Error.class)
	public void siTiene8MedicionesPorDiaAlIntentarAccederALaMuestraMenos10DaError() {
		HistorialDeHumedad historial = new HistorialDeHumedad(8);
		
		historial.obtenerMuestra(-10);
	}
	
	@Test
	public void alCambiarlaMuestraNumero3ConMenos30PorcientoDeHumedadNoCambiaLaHumedad() {
		HistorialDeHumedad historial = new HistorialDeHumedad(24);
		
		historial.cambiarMuestra(3, -30.0);
		
		Assert.assertEquals(0.0, historial.obtenerMuestra(3), 0);
	}
	
	@Test(expected = Error.class)
	public void alCambiarlaMuestraNumeroMenos3DaError() {
		HistorialDeHumedad historial = new HistorialDeHumedad(24);
		
		historial.cambiarMuestra(-3, 30.0);
	}
	
	@Test(expected = Error.class)
	public void siTiene8MedicionesPorDiaAlIntentarCambiarLaMuestra10DaError() {
		HistorialDeHumedad historial = new HistorialDeHumedad(8);
		
		historial.cambiarMuestra(10, 30.0);
	}
	
	@Test
	public void siTiene4MedicionesCon50Y30Y10Y10ElPromedioDeHumedadEs25() {
		HistorialDeHumedad historial = new HistorialDeHumedad(4);
		
		historial.cambiarMuestra(1, 50.0);
		historial.cambiarMuestra(2, 30.0);
		historial.cambiarMuestra(3, 10.0);
		historial.cambiarMuestra(4, 10.0);
		
		Assert.assertEquals(25.0, historial.calcularHumedadPromedio(), 0);
	}
	
	@Test
	public void siTiene4MedicionesCon50Y50Y10Y70ElPromedioDeHumedadEs45() {
		HistorialDeHumedad historial = new HistorialDeHumedad(4);
		
		historial.cambiarMuestra(1, 50.0);
		historial.cambiarMuestra(2, 50.0);
		historial.cambiarMuestra(3, 10.0);
		historial.cambiarMuestra(4, 70.0);
		
		Assert.assertEquals(45.0, historial.calcularHumedadPromedio(), 0);
	}
	
	@Test
	public void siTiene4MedicionesCon50Y50Y10Y70ElValorMaximoDeHumedadEs50() {
		HistorialDeHumedad historial = new HistorialDeHumedad(4);
		
		historial.cambiarMuestra(1, 50.0);
		historial.cambiarMuestra(2, 50.0);
		historial.cambiarMuestra(3, 10.0);
		historial.cambiarMuestra(4, 70.0);
		
		Assert.assertEquals(70.0, historial.obtenerMaximoValorDeHumedad(), 0);
	}
	
	@Test
	public void siTiene4MedicionesCon60Y30Y10Y10ElValorMaximoDeHumedadEs50() {
		HistorialDeHumedad historial = new HistorialDeHumedad(4);
		
		historial.cambiarMuestra(1, 60.0);
		historial.cambiarMuestra(2, 30.0);
		historial.cambiarMuestra(3, 10.0);
		historial.cambiarMuestra(4, 10.0);
		
		Assert.assertEquals(60.0, historial.obtenerMaximoValorDeHumedad(), 0);
	}
	
	@Test
	public void siTiene4MedicionesCon50Y50Y10Y70ElValorMinimoDeHumedadEs20() {
		HistorialDeHumedad historial = new HistorialDeHumedad(4);
		
		historial.cambiarMuestra(1, 50.0);
		historial.cambiarMuestra(2, 50.0);
		historial.cambiarMuestra(3, 20.0);
		historial.cambiarMuestra(4, 70.0);
		
		Assert.assertEquals(20.0, historial.obtenerMinimoValorDeHumedad(), 0);
	}
	
	@Test
	public void siTiene4MedicionesCon60Y30Y10Y10ElValorMinimoDeHumedadEs10() {
		HistorialDeHumedad historial = new HistorialDeHumedad(4);
		
		historial.cambiarMuestra(1, 60.0);
		historial.cambiarMuestra(2, 30.0);
		historial.cambiarMuestra(3, 10.0);
		historial.cambiarMuestra(4, 10.0);
		
		Assert.assertEquals(10.0, historial.obtenerMinimoValorDeHumedad(), 0);
	}
	
}
