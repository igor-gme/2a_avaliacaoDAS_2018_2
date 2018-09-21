package aplicacao;

public class Rendimento {
	
	
	public Rendimento() {

	}

	
	public float calcularRendimentoBruto(float valorInicial, int prazo, float taxaAnual) {
		float taxaJurosAnual = taxaAnual/100;
		float rendimentoBruto = (taxaJurosAnual* valorInicial) * prazo/365;
		return rendimentoBruto;
	}

	public double calcularImposto(float valorInicial, int prazo, float taxaJuros) {
		double imposto;
		double aliquota;
		if (prazo <= 180) {
			aliquota = 22.5/100;
			imposto = this.calcularRendimentoBruto(valorInicial, prazo, taxaJuros) * (aliquota);
		}else if (prazo > 180 && prazo <= 360) {
			aliquota = 20.0/100;
			imposto = this.calcularRendimentoBruto(valorInicial, prazo, taxaJuros) * (aliquota);
		}else if (prazo > 360 && prazo <= 720) {
			aliquota = 17.5/100;
			imposto = this.calcularRendimentoBruto(valorInicial, prazo, taxaJuros) * (aliquota);
		}else {
			aliquota = 15.0/100;
			imposto = this.calcularRendimentoBruto(valorInicial, prazo, taxaJuros) * (aliquota);
		}
		return imposto;
	}
	
}
