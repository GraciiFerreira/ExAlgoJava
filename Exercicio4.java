package Exercicios;

import java.util.Scanner;
import java.lang.Math; 

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float x1, x2, y1, y2;
		int d;
		
		System.out.println("Digite o valor de x1:");
		x1 = leia.nextFloat();
		
		System.out.println("Digite o valor de x2:");
		x2 = leia.nextFloat();
		
		System.out.println("Digite o valor de y1:");
		y1 = leia.nextFloat();
		
		System.out.println("Digite o valor de y2:");
		y2 = leia.nextFloat();
		
		d =(int) Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y1-y2),2)));
		
		System.out.println("A tal distancia é: " +d);
		
	}

}
