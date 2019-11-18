package lista03;

import java.util.ArrayList;

public class LivrosNotasList {

	private ArrayList<Double> notas;

	public LivrosNotasList() {
		this.notas = new ArrayList<Double>();
	}

	public ArrayList<Double> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}
	

	public void AddNotas(double nota) {
	
			this.notas.add(nota);
			System.out.println("Nota adicionada!\n");
			
		}
		
	
	public double NumNotas() {
		int numnotas  = this.notas.size();
		return numnotas;
	
	}
	
	public double somaNotas() {
		double somanotas = 0;
		for(int i=0 ; i < this.notas.size(); i++) {
			somanotas = somanotas + this.notas.get(i);
		
		}
		return somanotas;
			
	}
	
	public double mediaNotas() {
		double media =0;
		media = somaNotas()/ NumNotas();
		return media;
			
	}
	
	public String toString () {
		return "Numero de Notas: " + NumNotas() + "\n" + "Soma das Notas: " + somaNotas() + "\n" + "Media:" + mediaNotas();
	}


}
