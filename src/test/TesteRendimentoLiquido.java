package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import aplicacao.Rendimento;

@RunWith(Parameterized.class)
public class TesteRendimentoLiquido {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { {1000.00f, 60, 8.5f, 1.0828f}, 
											  {3000.00f, 240, 9.0f, 4.7342f},
											  {400.00f, 550, 8.0f, 9.9452f},
											  });
	}
	
	@Parameter
	public float valorInicial;
 	@Parameter(1)
 	public int prazo;
 	@Parameter(2)
	public float taxaAnual;
 	@Parameter(3)
	public float rendimentoLiquidoEsperado;
	
	@Test
	public void testeRendimentoLiquido() {
		Rendimento calcRend = new Rendimento(valorInicial, prazo, taxaAnual);
		
		assertEquals(rendimentoLiquidoEsperado, calcRend.calcularRendimentoLiquido(), 0.0001);
	}

}
