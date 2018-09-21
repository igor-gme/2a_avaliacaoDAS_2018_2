package test;

import static org.junit.Assert.*;

import org.junit.Test;

import aplicacao.Rendimento;

public class TesteRendimentoBruto {

	@Test
	public void testRendimento() {
		Rendimento rend = Rendimento.obterRendimentoBruto("Rendimento Bruto", 1000.00f, 60);
		
		assertEquals(13.97f, rend.calcularRendimentoBruto(), 0.0f);
		
	}

}
