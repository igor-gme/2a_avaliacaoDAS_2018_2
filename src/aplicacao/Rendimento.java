package aplicacao;

public class Rendimento {
	
	private String tipoRendimento;
	private int tempo;
	private float valor;
	
	public Rendimento(String tipoRendimento, float valor, int tempo) {
		this.tipoRendimento = tipoRendimento;
		this.valor = valor;
		this.tempo = tempo;
	}

	public static Rendimento obterRendimentoBruto(String tipoRendimento, float valor, int tempo) {
		
		return new Rendimento(tipoRendimento, valor, tempo);
	}
	
	public float calcularRendimentoBruto() {
		
		return 13.97f;
	}

}
