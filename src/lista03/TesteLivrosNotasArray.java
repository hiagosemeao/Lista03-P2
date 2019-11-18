package lista03;

import java.util.Scanner;

public class TesteLivrosNotasArray {

	public static void main(String[] args) {

		LivrosNotasList notasArray = new LivrosNotasList();
		Scanner ler = new Scanner(System.in);
		double pegar=0;
		int opcao = 0;

		do {


			System.out.print("Digite a Nota :");
			pegar = ler.nextDouble();
			notasArray.AddNotas(pegar);
			
			System.out.print("Digite 1 para lançar mais notas \nDigite 0 para sair :");
			opcao = ler.nextInt();



		}while(opcao != 0);
		System.out.println("\n");
		System.out.println(notasArray.toString());
		ler.close();

	}


}