package aplicacao;

public class Rendimento {

	private float valorInicial;
	private int prazo;
	private float taxaAnual;
	private float aliquota;

	public Rendimento(float valorInicial, int prazo, float taxaAnual) {
		this.valorInicial = valorInicial;
		this.prazo = prazo;
		this.taxaAnual = taxaAnual;

		if (prazo <= 180) {
			aliquota = 22.5f/100;
		}else if (prazo > 180 && prazo <= 360) {
			aliquota = 20.0f/100;
		}else if (prazo > 360 && prazo <= 720) {
			aliquota = 17.5f/100;
		}else {
			aliquota = 15.0f/100;
		}
	}

	public float calcularRendimentoBruto() {
		float taxaJurosAnual = taxaAnual/100;
		float rendimentoBruto = (taxaJurosAnual * valorInicial) * prazo/365;
		return rendimentoBruto;
	}

	public float calcularImpostodeRenda() {

		return calcularRendimentoBruto() * aliquota;
	}

	public float calcularRendimentoLiquido() {

		return (calcularRendimentoBruto() - calcularImpostodeRenda()) / valorInicial * 100;
	}

}
