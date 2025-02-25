package aula02;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Iterators
		int i = 10;
		do {
			System.out.println("I do and then i test: "+i);
			i++;
		} while (i<5);
		
		
		for(i = 10; i<5; i++) {
			System.out.println("I test and then i do: "+i);
		}
		
		//Arrays
		int[] vetor = new int[5];
		
		Random ran = new Random();
		for(int j = 0; j < 5; j++) {
			vetor[j] = ran.nextInt(100);
			System.out.println("v["+j+"] = "+vetor[j]);
		}
		
		System.out.println();
		
		int[][] matrix = new int[3][3];
		
		for(int j=0; j < matrix.length; j++) {
			for(int k=0; k< matrix.length; k++) {
				matrix[j][k] = ran.nextInt(100);
				System.out.println("m["+j+"]["+k+"] = "+matrix[j][k]);
			}
		}
		
		ex06();
		
	}
	
	// For examples
	
	public static void ex01() {
		for(int i = 0; i<10; i++) {
			System.out.println(i+1);
		}
	}
	
	public static void ex02() {
		for(int i = 2; i<=20; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void ex03() {
		for(int i = 1; i<=10; i++) {
			System.out.println(i*7);
		}
	}
	
	public static void ex04() {
		int i = 0;
		while (i <= 100) {
			System.out.print(i+", ");
			i++;
		}
	}
	
	public static void ex05() {
		double fact = 1;
		for(int i = 1; i<=5; i++) {
			fact = fact*i;
			System.out.println(fact);
		}
	}
	
	// Arrays examples
	
	public static void ex06() {
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> listaNomes = new ArrayList<String>();
		int tamanho = 5;
		
		for(int i = 1; i <= tamanho; i++) {
			System.out.print("Digite um nome ("+i+"/"+tamanho+"): ");
			listaNomes.add(teclado.next().toUpperCase());
		}
		
		for(String nome : listaNomes) {
			System.out.println(nome);
		}
		
		teclado.close();
	}
	
	
	public static void ex07() {
		
		
	}
}
