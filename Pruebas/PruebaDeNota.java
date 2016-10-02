import org.junit.Assert;
import org.junit.Test;


public class PruebaDeNota {

	@Test
	public void valorInicialMenorQueCeroAsignaNotaCero () {
		Nota nota = new Nota(-2);
		Assert.assertEquals(0, nota.obtenerValor());
	}
	
	@Test
	public void valorInicialMayorQueDiezAsignaNotaCero () {
		Nota nota = new Nota(11);
		Assert.assertEquals(0, nota.obtenerValor());
	}
	
	@Test
	public void notaCuatroEstaAprobada () {
		Nota nota = new Nota(4);
		Assert.assertTrue(nota.aprobado());
		Assert.assertTrue(!nota.desaprobado());
	}
	
	@Test
	public void notaOchoEstaAprobada () {
		Nota nota = new Nota(4);
		Assert.assertTrue(nota.aprobado());
		Assert.assertTrue(!nota.desaprobado());
	}
	
	@Test
	public void notaDosEstaDesaprobada () {
		Nota nota = new Nota(2);
		Assert.assertTrue(nota.desaprobado());
		Assert.assertTrue(!nota.aprobado());
	}
	
	@Test
	public void notaCeroEstaDesaprobada () {
		Nota nota = new Nota(0);
		Assert.assertTrue(nota.desaprobado());
		Assert.assertTrue(!nota.aprobado());
	}
	
	@Test
	public void recuperarConValorMayorQueDiezNoActualizaNota () {
		Nota nota = new Nota(0);
		nota.recuperar(12);
		Assert.assertEquals(0, nota.obtenerValor());
	}
	
	@Test
	public void recuperarConValorMenorQueCeroNoActualizaNota () {
		Nota nota = new Nota(0);
		nota.recuperar(-2);
		Assert.assertEquals(0, nota.obtenerValor());
	}
	
	@Test
	public void recuperarConValorMenorQueNotaActualNoActualizaNota () {
		Nota nota = new Nota(3);
		nota.recuperar(2);
		Assert.assertEquals(3, nota.obtenerValor());
	}
	
	@Test
	public void recuperarConValorMayorQueNotaActualActualizaNota () {
		Nota nota = new Nota(3);
		nota.recuperar(8);
		Assert.assertEquals(8, nota.obtenerValor());
	}
	
}
