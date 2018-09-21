package test;

import static org.junit.Assert.*;

import org.junit.Test;

import aplicacao.Rendimento;

public class TesteRendimentoBruto {

	@Test
	public void testRendimento() {
		Rendimento calcRend = new Rendimento();
		
		assertEquals(13.97f, calcRend.calcularRendimentoBruto(1000.00f, 60, 0.085f, 0.225f), 0.0f);
		
	}
	
	@Test
	public void testRendimento2() {
		Rendimento calcRend2 = new Rendimento();
		
		assertEquals(13.15f, calcRend2.calcularRendimentoBruto(1000.00f, 60, 0.085f, 0.225f), 0.0f);
		
	}

}
