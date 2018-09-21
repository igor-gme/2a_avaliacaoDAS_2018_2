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
		Rendimento calcRend2 = new Rendimento();
		
		assertEquals(3.14f, calcRend2.calcularImposto(1000.00f, 60, 8.5f), 0.01);
		
	}

}
