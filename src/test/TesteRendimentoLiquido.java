package test;

import static org.junit.Assert.*;

import org.junit.Test;

import aplicacao.Rendimento;

public class TesteRendimentoLiquido {

	@Test
	public void testeRendimentoLiquido() {
		Rendimento calcRend = new Rendimento(1000.00f, 60, 8.5f);
		
		assertEquals(1.0828f, calcRend.calcularRendimentoLiquido(), 0.0001);
	}
	
	@Test
	public void testeRendimentoLiquido2() {
		Rendimento calcRend = new Rendimento(3000.00f, 240, 9.0f);
		
		assertEquals(4.7342f, calcRend.calcularRendimentoLiquido(), 0.0001);
	}

}
