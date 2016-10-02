import org.junit.Assert;
import org.junit.Test;


public class PruebasDeSubasta {
	
	@Test(expected = Error.class)
	public void nombreDeArticuloVacioDaError() {
		new Subasta("", 3);
	}
	
	@Test(expected = Error.class)
	public void precioBaseCeroDaError() {
		new Subasta("Manzana", 0);
	}
	
	@Test(expected = Error.class)
	public void precioBaseNegativoDaError() {
		new Subasta("Manzana", -3);
	}
	
	@Test(expected = Error.class)
	public void nombreDeArticuloNopuedeEstarVacioYPrecioBaseNoPuedeSerCero() {
		new Subasta("", 0);
	}
	
	@Test(expected = Error.class)
	public void nombreDeArticuloNopuedeEstarVacioYPrecioBaseNoPuedeSerNegativo() {
		new Subasta("", -3);
	}
	
	@Test
	public void getterArticuloRetornaElArticulo() {
		Subasta subasta = new Subasta("Manzana", 3);
		String producto = subasta.obtenerArticulo();
		Assert.assertEquals(producto, "Manzana");
	}
	
	@Test
	public void ofertarUnValorMayorAOfertaGanadoraActualizaOfertaGanadora() {
		Subasta subasta = new Subasta("Manzana", 3);
		subasta.ofertar(4);
		subasta.ofertar(6);
		double ofertaGanadora = subasta.obtenerOfertaGanadora();
		Assert.assertEquals(6, ofertaGanadora, 0);
	}
	
	@Test
	public void ofertarUnValorMenorAOfertaGanadoraNoActualizaOfertaGanadora() {
		Subasta subasta = new Subasta("Manzana", 3);
		subasta.ofertar(2);
		double ofertaGanadora = subasta.obtenerOfertaGanadora();
		Assert.assertEquals(0, ofertaGanadora, 0);
	}
	
	@Test
	public void ofertarUnValorMenorAPrecioBaseNoActualizaOfertaGanadora() {
		Subasta subasta = new Subasta("Manzana", 3);
		subasta.ofertar(2);
		double ofertaGanadora = subasta.obtenerOfertaGanadora();
		Assert.assertEquals(0, ofertaGanadora, 0);
	}
	
	@Test
	public void ofertarUnValorMayorAOfertaGanadoraYMenorAPrecioBaseNoActualizaOfertaGanadora() {
		Subasta subasta = new Subasta("Manzana", 3);
		subasta.ofertar(8);
		subasta.ofertar(2);
		double ofertaGanadora = subasta.obtenerOfertaGanadora();
		Assert.assertEquals(8, ofertaGanadora, 0);
	}
	
	@Test
	public void ofertaCerradaIgnoraOfertasMayoresAOfertaGanadora() {
		Subasta subasta = new Subasta("Manzana", 3);
		subasta.ofertar(4);
		subasta.cerrar();
		subasta.ofertar(8);
		double ofertaGanadora = subasta.obtenerOfertaGanadora();
		Assert.assertEquals(4, ofertaGanadora, 0);
	}
	
	@Test
	public void ofertaCerradaIgnoraOfertasMenoresAOfertaGanadora() {
		Subasta subasta = new Subasta("Manzana", 3);
		subasta.ofertar(4);
		subasta.cerrar();
		subasta.ofertar(8);
		double ofertaGanadora = subasta.obtenerOfertaGanadora();
		Assert.assertEquals(4, ofertaGanadora, 0);
	}
	
}
