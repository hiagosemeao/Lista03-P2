package lista03;

public class LivrosNotas {
	
	private int numNotas;
	private double somaNotas;
	
	public LivrosNotas() {
		this.numNotas = 0;
		this.somaNotas = 0;
	}
	
	public void adicionaNota(double nota){
		numNotas++;
		somaNotas += nota;
	}
	
	public double calculaMedia() {
		double media = 0;
		if(numNotas > 0) {
			media = somaNotas/this.numNotas;
		}
		return media;
	}
	
	public int getNumNotas() {
		return numNotas;
	}

	public double getSomaNotas() {
		return somaNotas;

}

}
