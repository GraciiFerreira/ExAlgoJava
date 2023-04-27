package Exercicios;

	import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	

		Scanner leia = new Scanner(System.in);
		
		int um, dois, tres;
		float mediaFinal;
			
		
		System.out.println("Digite a nota da primeira prova:");
		um = leia.nextInt();
		
		System.out.println("Digite a nota da segunda prova:");
		dois = leia.nextInt();
		
		System.out.println("Digite a nota da terceira prova:");
		tres = leia.nextInt();
		
		
		mediaFinal = ((um*2) + (dois*3) + (tres*5))/10;
		
		
		System.out.println("Sua media final é: " + mediaFinal);


	}

}
