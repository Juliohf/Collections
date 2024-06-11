package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(2,5,1,3,4,9,7,8,1,0,6));
		
		System.out.println("Digite um numero:");
		int numero = sc.nextInt();
		sc.nextLine();
		
		if (lista.contains(numero)) {
			int i = lista.indexOf(numero);
			System.out.println("O numero " + numero + " está inserido no index: " + i);
		} else {
			System.out.println("Numero " + numero + " não encontrado");
		}
System.out.println(lista);
		
		sc.close();

	}

}
