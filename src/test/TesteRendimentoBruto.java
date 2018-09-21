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
public class TesteRendimentoBruto {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { {1000.00f, 60, 8.5f, 13.97f}, 
											  {500.00f, 120, 8.0f, 13.15f},
											  {3000.00f, 240, 9.0f, 177.53f},
											  {2000f, 270, 8.5f, 125.75f},
											  {100f, 390, 7.5f, 8.01f},
											  {250f, 420, 8.0f, 23.01f},
											  {400f, 550, 8.0f, 48.22f},
											  {800f, 670, 8.0f, 117.48f},
											  {2500f, 700, 9.0f, 431.51f},
											  {4200f, 900, 9.5f, 983.84f},
											  {100f, 1000, 7.5f, 20.55f}
											  });
	}
	
	@Parameter
	public float valorInicial;
 	@Parameter(1)
 	public int prazo;
 	@Parameter(2)
	public float taxaAnual;
 	@Parameter(3)
	public float rendimentoBrutoEsperado;
	
 	@Test
	public void testRendimento() {
		Rendimento calcRend = new Rendimento(valorInicial, prazo, taxaAnual);
		
		assertEquals(rendimentoBrutoEsperado, calcRend.calcularRendimentoBruto(), 0.01);
		
	}

}
