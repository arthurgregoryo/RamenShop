package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelos.*;
import modelos.acrescimos.bebidas.*;
import modelos.acrescimos.carnes.*;
import modelos.acrescimos.extras.*;

class PackageModelosTeste {
	
	Ramen ramen;

	//TESTE CLASSES BEBIDA
	@Test
	void testBebidasKoCha() {
		ramen = new RamenGrande();//15.90
		ramen = new BebidaKoCha(ramen);//0.00
		assertEquals(ramen.getPreco(), 15.90);
	}
	
	@Test
	void testBebidasOCha() {
		ramen = new RamenPequeno();//9.90
		ramen = new BebidaOCha(ramen);//3.90
		assertEquals(ramen.getPreco(), 13.80);
	}
	
	@Test
	void testBebidasRefrigerante() {
		ramen = new RamenMedio();//12.90
		ramen = new BebidaRefrigerante(ramen);//5.90
		assertEquals(ramen.getPreco(), 18.80);
	}
	
	//TESTE CLASSES CARNE
	@Test
	void testCarnesBoi() {
		ramen = new RamenGrande();//15.90
		ramen = new CarneBoi(ramen);//7.90
		assertEquals(ramen.getPreco(), 23.80);
	}
	
	@Test
	void testCarnesPorco() {
		ramen = new RamenPequeno();//9.90
		ramen = new CarnePorco(ramen);//5.90
		assertEquals(ramen.getPreco(), 15.80);
	}
	
	@Test
	void testCarnesVegano() {
		ramen = new RamenMedio();//12.90
		ramen = new CarneVegano(ramen);//3.90
		assertEquals(ramen.getPreco(), 16.80);
	}
	
	// TESTE CLASSES EXTRA
	@Test
	void testExtraTofu() {
		ramen = new RamenGrande();//15.90
		ramen = new ExtraTofu(ramen);//2.70
		assertEquals(ramen.getPreco(), 18.6);
	}
	
	@Test
	void testExtraShitake() {
		ramen = new RamenPequeno();//9.90
		ramen = new ExtraShitake(ramen);//6.90
		assertEquals(ramen.getPreco(), 16.80);
	}
	
	@Test
	void testExtraCrouton() {
		ramen = new RamenGrande();//15.90
		ramen = new ExtraCrouton(ramen);//2.00
		assertEquals(ramen.getPreco(), 17.90);
	}
	
	@Test
	void testExtraChilli() {
		ramen = new RamenPequeno();//9.90
		ramen = new ExtraChilli(ramen);//2.50
		assertEquals(ramen.getPreco(), 12.4);
	}
	
	@Test
	void testExtraCremeAlho() {
		ramen = new RamenMedio();//12.90
		ramen = new ExtraCremeAlho(ramen);//1.50
		assertEquals(ramen.getPreco(), 14.40);
	}
	
	@Test
	void testExtraCarneExtra() {
		ramen = new RamenMedio();//12.90
		ramen = new ExtraCarneExtra(ramen);//4.00
		assertEquals(ramen.getPreco(), 16.90);
	}

}
