package lista03;

public class LivrosNotasArray {

	private double[] notas;
	

	public LivrosNotasArray() {
		this.notas = new double[10];
		preencheArray();

	}

	public void preencheArray() {
		for(int i=0;i<this.notas.length;i++) {
			this.notas[i]= -1;
		}


	}

	public void adicionaNota(double notas){
		boolean teste = false;
		for(int i =0;i<this.notas.length; i++) {
			if(this.notas[i] == -1) {
				this.notas[i] = notas;
				System.out.println("Nota adicionada");
				teste = true;
				break;
			}
		}
		
		if(teste == false) {
			System.out.println("Erro");
				
			}
	}

	public double getNumNotas() {
		int cont =0;
		for(int i =0;i<this.notas.length; i++) {
			if(this.notas[i] != -1) {
				cont++;

			}else {
			}

		}
		return cont;

	}	

	public double getSomaNota() {
		double soma=0;
		for(int i =0;i<this.notas.length; i++) {
			if(this.notas[i] != -1) {
				soma = soma+ this.notas[i];
			}else {
			}
		}
		return soma;
	}

	
	

	public double getMediaNota() {
		double mediaNotas=0;

		mediaNotas = getSomaNota()/getNumNotas();
		return mediaNotas;	

	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public String toString () {
		return "Numero de Notas: " + getNumNotas() + "\n" + "Soma das Notas: " + getSomaNota() + "\n" + "Media:" + getMediaNota();
	}

}



