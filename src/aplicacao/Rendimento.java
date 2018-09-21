package aplicacao;

public class Rendimento {
	
	private float valorInicial;
	private int prazo;
	private float taxaAnual;
	
	public Rendimento(float valorInicial, int prazo, float taxaAnual) {
		this.valorInicial = valorInicial;
		this.prazo = prazo;
		this.taxaAnual = taxaAnual;
	}
	
	public float calcularRendimentoBruto() {
		float taxaJurosAnual = taxaAnual/100;
		float rendimentoBruto = (taxaJurosAnual * valorInicial) * prazo/365;
		return rendimentoBruto;
	}
	
}
