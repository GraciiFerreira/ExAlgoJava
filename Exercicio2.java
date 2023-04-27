package Exercicios;
	import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		
		Scanner leia = new Scanner(System.in);
		
		int idade, dias, meses, anos;
			
		
		System.out.println("Digite a sua idade em dias:");
		idade = leia.nextInt();
		
		anos = idade / 365;
		dias = idade % 365;
		meses = dias / 30;
		dias = dias % 30;
		
		
		System.out.println("Sua idade é: " + anos + "anos " + meses + "meses " + dias + "dias ");
		

	}

}
