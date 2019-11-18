package lista03;

import java.util.Locale;
import java.util.Scanner;

public class AppAnucioModif {

	public static void main(String[] args) {

		String nome = null;
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);		
		String[] array = new String[3];


		System.out.println("Digite o anunciante:");
		nome = ler.nextLine();
		array[0]= nome;

		System.out.println("Digite a mensagem:");
		nome = ler.nextLine();
		array[1]= nome;

		System.out.println("Digite o destinatario:");
		nome = ler.nextLine();
		array[2]= nome;



		System.out.println("Anuncio de : " + array[0]);
		System.out.println("Mensagem : " + array[1]);
		System.out.println("Destinatario : " + array[2]);
		
	

		ler.close();

	}

}
