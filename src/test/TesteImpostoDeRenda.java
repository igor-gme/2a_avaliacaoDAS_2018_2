package test;

import static org.junit.Assert.*;

import org.junit.Test;

import aplicacao.Rendimento;

public class TesteImpostoDeRenda {

	@Test
	public void testImpostoRenda() {
		Rendimento calcRend = new Rendimento(1000.00f, 60, 8.5f);
		
		assertEquals(3.14f, calcRend.calcularImpostodeRenda(), 0.01);		
	}
	
	@Test
	public void testImpostoRenda2() {
		Rendimento calcRend = new Rendimento(500.00f, 120, 8.0f);
		
		assertEquals(2.96f, calcRend.calcularImpostodeRenda(), 0.01);
		
	}
	@Test
	public void testImpostoRenda3() {
		Rendimento calcRend = new Rendimento(3000.00f, 240, 9.0f);
		
		assertEquals(35.51f, calcRend.calcularImpostodeRenda(), 0.01);
		
	}

}
