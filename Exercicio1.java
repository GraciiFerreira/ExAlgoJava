package Exercicios;

		import java.util.Scanner;


public class Exercicio1 {

		public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);
		
		int horas, minutos, segundos, tempo;
				
		System.out.println("Digite um tempo em segundos:");
		tempo = leia.nextInt();
				
		horas = tempo / 3600;
		segundos = tempo % 3600;
		minutos = segundos / 60;
		segundos = segundos % 60;
			
		System.out.println("Total do evento: " + horas + "horas " + minutos + "minutos " + segundos + "segundos ");			

	}

}
