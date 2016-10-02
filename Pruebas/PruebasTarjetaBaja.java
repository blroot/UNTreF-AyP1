import org.junit.Test;
import org.junit.Assert;

public class PruebasTarjetaBaja {

	@Test
	public void saldoInicialNegativoInicializaSaldoInicialACero() {
		TarjetaBaja tarjeta = new TarjetaBaja(-1);
		Assert.assertEquals(0, tarjeta.obtenerSaldo(), 0);
	}
	
	@Test
	public void saldoInicialCuatroInicializaSaldoInicialACuatro() {
		TarjetaBaja tarjeta = new TarjetaBaja(4);
		Assert.assertEquals(4, tarjeta.obtenerSaldo(), 0);
	}
	
	@Test
	public void cargarCincoSumaCincoASaldo() {
		TarjetaBaja tarjeta = new TarjetaBaja(4);
		tarjeta.cargar(5);
		Assert.assertEquals(4+5, tarjeta.obtenerSaldo(), 0);
	}
	
	@Test
	public void cargarSumaNegativaNoModificaSaldo() {
		TarjetaBaja tarjeta = new TarjetaBaja(4);
		tarjeta.cargar(-5);
		Assert.assertEquals(4, tarjeta.obtenerSaldo(), 0);
	}
	
	@Test
	public void puedePagarViajeEnColectivoConSaldoSuficiente() {
		TarjetaBaja tarjeta = new TarjetaBaja(4);
		tarjeta.pagarViajeEnColectivo();
		Assert.assertEquals(4-1.25, tarjeta.obtenerSaldo(), 0);
	}
	
	@Test
	public void noPuedePagarViajeEnColectivoConSaldoInsuficiente() {
		TarjetaBaja tarjeta = new TarjetaBaja(0.5);
		tarjeta.pagarViajeEnColectivo();
		Assert.assertEquals(0.5, tarjeta.obtenerSaldo(), 0);
	}
	
	@Test
	public void puedePagarViajeEnSubteConSaldoSuficiente() {
		TarjetaBaja tarjeta = new TarjetaBaja(4);
		tarjeta.pagarViajeEnSubte();
		Assert.assertEquals(4-2.50, tarjeta.obtenerSaldo(), 0);
	}
	
	@Test
	public void noPuedePagarViajeEnSubteConSaldoInsuficiente() {
		TarjetaBaja tarjeta = new TarjetaBaja(0.5);
		tarjeta.pagarViajeEnColectivo();
		Assert.assertEquals(0.5, tarjeta.obtenerSaldo(), 0);
	}
	
	@Test
	public void cuatroPagosDeViajesEnColectivoConSaldoSeisSonCuatroViajes() {
		TarjetaBaja tarjeta = new TarjetaBaja(6);
		tarjeta.pagarViajeEnColectivo();
		tarjeta.pagarViajeEnColectivo();
		tarjeta.pagarViajeEnColectivo();
		tarjeta.pagarViajeEnColectivo();
		Assert.assertEquals(4, tarjeta.contarViajesEnColectivo());
	}
	
	@Test
	public void diezPagosDeViajesEnColectivoConSaldoSeisSonCuatroViajes() {
		TarjetaBaja tarjeta = new TarjetaBaja(6);
		for (int i = 0; i < 10; i++) {
			tarjeta.pagarViajeEnColectivo();
		}
		Assert.assertEquals(4, tarjeta.contarViajesEnColectivo());
	}
	
	@Test
	public void quinientosPagosDeViajesEnColectivoConSaldoSeisSonCuatroViajes() {
		TarjetaBaja tarjeta = new TarjetaBaja(6);
		for (int i = 0; i < 500; i++) {
			tarjeta.pagarViajeEnColectivo();
		}
		Assert.assertEquals(4, tarjeta.contarViajesEnColectivo());
	}
	
	@Test
	public void dosPagosDeViajesEnSubteConSaldoSeisSonDosViajes() {
		TarjetaBaja tarjeta = new TarjetaBaja(6);
		tarjeta.pagarViajeEnSubte();
		tarjeta.pagarViajeEnSubte();
		Assert.assertEquals(2, tarjeta.contarViajesEnSubte());
	}
	
	@Test
	public void diezPagosDeViajesEnSubteConSaldoSeisSonDosViajes() {
		TarjetaBaja tarjeta = new TarjetaBaja(6);
		for (int i = 0; i < 10; i++) {
			tarjeta.pagarViajeEnSubte();
		}
		Assert.assertEquals(2, tarjeta.contarViajesEnSubte());
	}
	
	@Test
	public void quinientosPagosDeViajesEnSubteConSaldoSeisSonDosViajes() {
		TarjetaBaja tarjeta = new TarjetaBaja(6);
		for (int i = 0; i < 500; i++) {
			tarjeta.pagarViajeEnSubte();
		}
		Assert.assertEquals(2, tarjeta.contarViajesEnSubte());
	}
	
	@Test
	public void dosViajesEnSubteYDosEnColectivoConSaldo7Con50SonCuatroViajesEnTotal() {
		TarjetaBaja tarjeta = new TarjetaBaja(7.5);
		tarjeta.pagarViajeEnSubte();
		tarjeta.pagarViajeEnSubte();
		tarjeta.pagarViajeEnColectivo();
		tarjeta.pagarViajeEnColectivo();
		Assert.assertEquals(4, tarjeta.contarViajes());
	}
	
	@Test
	public void dosViajesEnSubteYDosEnColectivoConSaldoCuatroSonDosViajesEnTotal() {
		TarjetaBaja tarjeta = new TarjetaBaja(4);
		tarjeta.pagarViajeEnSubte();
		tarjeta.pagarViajeEnSubte();
		tarjeta.pagarViajeEnColectivo();
		tarjeta.pagarViajeEnColectivo();
		Assert.assertEquals(2, tarjeta.contarViajes());
	}
	
}
