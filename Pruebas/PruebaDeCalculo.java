import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class PruebaDeCalculo {

	private Calculadora calculadora;
	
	@Before
	public void crearUnaNuevaCalculadora() {
		this.calculadora = new Calculadora();
	}
	
	@Test
	public void losDivisoresDe8Son4() {	
		int divisoresDe8 = this.calculadora.contarDivisores(8);
		Assert.assertEquals(4, divisoresDe8);
	}
	
	@Test
	public void losDivisoresDe2Son2() {
		int divisoresDe2 = this.calculadora.contarDivisores(2);
		Assert.assertEquals(2, divisoresDe2);
	}
	
	@Test
	public void losDivisoresDe6Son4() {
		int divisoresDe6 = this.calculadora.contarDivisores(6);
		Assert.assertEquals(4, divisoresDe6);
	}
	
	@Test
	public void losDivisoresDe10Son() {
		int divisoresDe10 = this.calculadora.contarDivisores(10);
		Assert.assertEquals(4, divisoresDe10);
	}
	
	@Test
	public void losDivisoresDe20Son() {
		int divisoresDe20 = this.calculadora.contarDivisores(20);
		Assert.assertEquals(6, divisoresDe20);
	}
	
	@Test
	public void losDivisoresDe2016Son() {
		int divisoresDe2016 = this.calculadora.contarDivisores(2016);
		Assert.assertEquals(36, divisoresDe2016);
	}
	
	@Test(expected = Error.class)
	public void siIngresoUnNegativoDaError() {
		calculadora.contarDivisores(-1);
	}
	
	@Test
	public void elDivisorDe1Es1() {
		int divisoresDe1 = this.calculadora.contarDivisores(1);
		Assert.assertEquals(1, divisoresDe1);
	}
	
	@Test(expected = Error.class)
	public void elCeroTieneInfinitosDivisores() {
		calculadora.contarDivisores(0);
	}
	
	@Test
	public void unNumeroPrimoTieneDosDivisores() {
		int divisoresDe7 = this.calculadora.contarDivisores(7);
		Assert.assertEquals(2, divisoresDe7);
		int divisoresDe19 = this.calculadora.contarDivisores(19);
		Assert.assertEquals(2, divisoresDe19);
	}
	
	
}
