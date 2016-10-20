import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PruebasPronosticoSemanal {

	private PronosticoSemanal pronostico;
	
	@Before
	public void crearObjetoPronosticoSemanal() {
		this.pronostico = new PronosticoSemanal();
	}
	
	@Test
	public void alCrearElObjetoTodasLasTemperaturasSon25() {
		for (int dia = 1; dia < 8; dia++) {
			Assert.assertEquals(25.0, this.pronostico.obtenerTemperatura(dia), 0);
		}
	}
	
	@Test
	public void alObtenerTemperaturaDeDia1Obtengo25() {
		Assert.assertEquals(25.0, this.pronostico.obtenerTemperatura(1), 0);
	}
	
	@Test(expected = Error.class)
	public void alObtenerTemperaturaDeDia0ObtengoError() {
		this.pronostico.obtenerTemperatura(0);
	}
	
	@Test(expected = Error.class)
	public void alObtenerTemperaturaDeDia8ObtengoError() {
		this.pronostico.obtenerTemperatura(8);
	}
	
	@Test
	public void alPronosticarLaTemperaturaDeTodosLosDiasA30TodasLasTemperaturasSon30() {
		for (int dia = 1; dia < 8; dia++) {
			this.pronostico.pronosticarTemperatura(dia, 30.0);
		}
		for (int dia = 1; dia < 8; dia++) {
			Assert.assertEquals(30.0, this.pronostico.obtenerTemperatura(dia), 0);
		}
	}
	
	@Test(expected = Error.class)
	public void alPronosticarLaTemperaturaDelDia0ObtengoError() {
		this.pronostico.pronosticarTemperatura(0, 1);
	}
	
	@Test(expected = Error.class)
	public void alPronosticarLaTemperaturaDelDia8ObtengoError() {
		this.pronostico.pronosticarTemperatura(8, 1);
	}
	
	@Test
	public void alPronosticarLaTemperaturaDelDiaUnoA30LaTemperaturaDelDiaUnoEs30() {
		this.pronostico.pronosticarTemperatura(1, 30.0);
		
		Assert.assertEquals(30.0, this.pronostico.obtenerTemperatura(1), 0);
	}
	
	@Test
	public void alPronosticarLaTemperaturaDelDiaDosA32LaTemperaturaDelDiaDosEs32() {
		this.pronostico.pronosticarTemperatura(2, 32.0);
		
		Assert.assertEquals(32.0, this.pronostico.obtenerTemperatura(2), 0);
	}
	
	@Test
	public void alCalcularTemperaturaPromedioConTodosLosDiasA25ElPromedioEs25() {
		double temperaturaPromedio = this.pronostico.calcularTemperaturaPromedio();
		
		Assert.assertEquals(25.0, temperaturaPromedio, 0);
	}
	
	@Test
	public void alCalcularTemperaturaPromedioConSeisDiasEn25YUnoEn18ElPromedioEs24() {
		this.pronostico.pronosticarTemperatura(1, 18.0);
		
		double temperaturaPromedio = this.pronostico.calcularTemperaturaPromedio();
		
		Assert.assertEquals(24.0, temperaturaPromedio, 0);
	}
	
	@Test
	public void conTodasLasTemperaturas25LaTemperaturaMaximaEs25() {
		double temperaturaMaxima = this.pronostico.buscarTemperaturaMaxima();
		
		Assert.assertEquals(25.0, temperaturaMaxima, 0);
	}
	
	@Test
	public void conSeisTemperaturas25YUna30LaTemperaturaMaximaEs30() {
		this.pronostico.pronosticarTemperatura(1, 30.0);		
		
		double temperaturaMaxima = this.pronostico.buscarTemperaturaMaxima();
		
		Assert.assertEquals(30.0, temperaturaMaxima, 0);
	}
	
	@Test
	public void conSeisTemperaturasMenos25YUna2LaTemperaturaMaximaEs2() {
		for (int dia = 1; dia < 7; dia++) {
			this.pronostico.pronosticarTemperatura(dia, -25.0);
		}
		this.pronostico.pronosticarTemperatura(7, 2.0);
		
		double temperaturaMaxima = this.pronostico.buscarTemperaturaMaxima();
		
		Assert.assertEquals(2.0, temperaturaMaxima, 0);
	}
	
	@Test
	public void conSeisTemperaturasMenos25YUnaMenos2LaTemperaturaMaximaEsMenos2() {
		for (int dia = 1; dia < 7; dia++) {
			this.pronostico.pronosticarTemperatura(dia, -25.0);
		}
		this.pronostico.pronosticarTemperatura(7, -2.0);
		
		double temperaturaMaxima = this.pronostico.buscarTemperaturaMaxima();
		
		Assert.assertEquals(-2.0, temperaturaMaxima, 0);
	}
	
	@Test
	public void conTodasLasTemperaturas25LaTemperaturaMinimaEs25() {
		double temperaturaMinima = this.pronostico.buscarTemperaturaMinima();
		
		Assert.assertEquals(25.0, temperaturaMinima, 0);
	}
	
	@Test
	public void conSeisTemperaturas20YUna30LaTemperaturaMinimaEs20() {
		for (int dia = 1; dia < 7; dia++) {
			this.pronostico.pronosticarTemperatura(dia, 20.0);
		}
		this.pronostico.pronosticarTemperatura(7, 30.0);
		
		double temperaturaMinima = this.pronostico.buscarTemperaturaMinima();
		
		Assert.assertEquals(20.0, temperaturaMinima, 0);
	}
	
	@Test
	public void conSeisTemperaturasMenos25YUnaMenos2LaTemperaturaMinimaEsMenos25() {
		for (int dia = 1; dia < 7; dia++) {
			this.pronostico.pronosticarTemperatura(dia, -25.0);
		}
		this.pronostico.pronosticarTemperatura(7, -2.0);
		
		double temperaturaMaxima = this.pronostico.buscarTemperaturaMinima();
		
		Assert.assertEquals(-25.0, temperaturaMaxima, 0);
	}
	
	
}
