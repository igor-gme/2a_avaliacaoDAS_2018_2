package test;

import static org.junit.Assert.*;

import org.junit.Test;

import aplicacao.Rendimento;

public class TesteRendimentoBruto {

	@Test
	public void testRendimento() {
		Rendimento calcRend = new Rendimento();
		
		assertEquals(13.97f, calcRend.calcularRendimentoBruto(1000.00f, 60, 8.5f), 0.01);
		
	}
	
	@Test
	public void testRendimento2() {
		Rendimento calcRend = new Rendimento();
		
		assertEquals(177.53f, calcRend.calcularRendimentoBruto(3000.00f, 240, 9.0f), 0.01);
		
	}
	
	@Test
	public void testRendimento3() {
		Rendimento calcRend = new Rendimento();
		
		assertEquals(13.15f, calcRend.calcularRendimentoBruto(500.00f, 120, 8.0f), 0.01);
		
	}
	
//	@Test
//	public void testRendimento2() {
//		Rendimento calcRend2 = new Rendimento();
//		
//		assertEquals(3.14f, calcRend2.calcularImposto(1000.00f, 60, 8.5f), 0.01);
//		
//	}

}
