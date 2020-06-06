package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fila.ContadorDePedidos;
import fila.FilaDeEspera;
import modelos.Pedido;
import modelos.Ramen;
import modelos.RamenGrande;

class PackageFilaTest {

	@Test
	void testContadorDePedidos() {
		final int ESPERADO = 20; 
		final int AUMENTO = 30;
		final int REDUCAO = 10;
		ContadorDePedidos contador = new ContadorDePedidos();
		for(int i =0;i<AUMENTO;i++)
			contador.aumentaContador();
		for(int i =0;i<=REDUCAO;i++)
			contador.reduzContador();
		assertEquals(ESPERADO, contador.retornaContador());
	}
	
	@Test
	void testFilaDeEspera() {
		Ramen ramen = new RamenGrande();
		FilaDeEspera.adiciona(new Pedido(ramen));
		assertSame(FilaDeEspera.retornaKey(1).getProduto(),ramen);
		
	}
	
	@Test
	void testStatusAndamento() {
		
	}
	
	@Test
	void testStatusFinalizado() {
		
	}
	
	

}
