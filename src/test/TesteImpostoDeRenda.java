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
public class TesteImpostoDeRenda {
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { {1000.00f, 60, 8.5f, 3.14f}, 
											  {500, 120, 8, 2.96f},
											  {3000f, 240, 9.0f, 35.51f},
											  {2000f, 270, 8.5f, 25.15f},
											  {100f, 390, 7.5f, 1.40f},
											  {250f, 420, 8.0f, 4.03f},
											  {400f, 550, 8.0f, 8.44f},
											  {800f, 670, 8.0f, 20.56f},
											  {2500f, 700, 9.0f, 75.51f},
											  {4200f, 900, 9.5f, 147.58f},
											  {100f, 1000, 7.5f, 3.08f}
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
	public void testImpostoRenda() {
		Rendimento calcRend = new Rendimento(valorInicial, prazo, taxaAnual);
		
		assertEquals(rendimentoBrutoEsperado, calcRend.calcularImpostodeRenda(), 0.01);		
	}
	
}
