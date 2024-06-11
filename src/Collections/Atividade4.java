package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> st = new HashSet<>();

		
		for (int i=0;i<10;i++) {
			System.out.println("Digite o " + (i + 1) + "° valor inteiro");
			int n1 = sc.nextInt();
			if (st.contains(n1)) {
				System.out.println("Valor repetido, digite um valor diferente!");
			} else {
			st.add(n1);		
			}
		}

		
		Iterator<Integer> itera = st.iterator();
		System.out.println("Elementos do set:");
		while (itera.hasNext()) {
			System.out.println(itera.next());
		}
		
		
		sc.close();

	}

}
