package Collections;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<>();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite um número inteiro: ");
			int numeroDigitado = sc.nextInt();
			numeros.add(numeroDigitado);
		}

		System.out.println("Digite um número para ser encontrado: ");
		int numeroDigitado2 = sc.nextInt();

		if (numeros.contains(numeroDigitado2)) {
			System.out.println("Número " + numeroDigitado2 + " Encontrado!");
		} else {
			System.out.println("O número " + numeroDigitado2 + " não foi encontrado!");
		}

		sc.close();

	}

}
