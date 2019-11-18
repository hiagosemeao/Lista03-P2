package lista03;

import java.util.Locale;
import java.util.Scanner;

public class TesteLivrosNotas {

	public static void main(String[] args) {
	
		LivrosNotasArray livrosnotas = new LivrosNotasArray();
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double pegarNota =0;
		
		for(int i=0; i<=9 ;i++) {
		System.out.println("Digite a nota :");
		pegarNota = ler.nextDouble();
		livrosnotas.adicionaNota(pegarNota);

	
		
}
		System.out.println(livrosnotas.toString());
		ler.close();
}
	
}