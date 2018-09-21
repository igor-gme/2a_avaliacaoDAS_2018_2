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

}
