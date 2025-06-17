package loops;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		/*System.out.println("Inserisci primo numero");
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.println("Inserisci secondo numero");
		int num2 = Integer.parseInt(scanner.nextLine());

		// ------------------------------------------------- WHILE ------------------------------------------------------------------
		// Nei while loop, come prima cosa, viene valutata la condizione. Se questa è falsa, allora si salta l'intero loop. Se invece
		// dovesse essere vera si entra nel blocco di codice del loop e si itera fino a che la condizione non diventa falsa. Ciò
		// significa che la variabile che sto valutando all'interno della condizione, prima o poi dovrà cambiare di valore

		while (num2 <= num1 + 20) {
			//num1++;
			num2 += 4;
			System.out.println(num2);
		}


		int sum = 0;

		while (true) {
			System.out.println("Dammi il numero da sommare, 0 per uscire");
			int num = Integer.parseInt(scanner.nextLine());
			if (num == 0) break; // break serve per uscire in maniera forzata dal loop, in questo caso al verificarsi di una condizione
			sum += num;
		}

		System.out.println("La somma è: " + sum);*/

		// --------------------------------------------------------- DO-WHILE -----------------------------------------------
		// Nei do-while loop la condizione viene valutata dopo aver eseguito il blocco di codice tra le graffe. Ciò vuol dire che
		// anche se la condizione dovesse essere falsa fin da subito, il codice almeno una volta verrebbe eseguito
		/*
		int sum = 0;
		int num;

		do {
			System.out.println("Dammi il numero da sommare, 0 per uscire");
			num = Integer.parseInt(scanner.nextLine());
			sum += num;
		} while (num != 0);

		System.out.println("La somma è: " + sum);

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Inserisci un numero intero");
			numbers[i] = Integer.parseInt(scanner.nextLine());
		}

		System.out.println(Arrays.toString(numbers));

		for (int number : numbers) { // <-- ENHANCED FOR. Alternativa compatta ad un for tradizionale quando abbiamo a che fare con gli array ma non abbiamo
			// bisogno direttamente degli indici ma solo dell'elemento corrente
			System.out.println(number);
		}

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) continue; // continue serve per saltare alla prossima iterazione
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			if (i == 5) break; // break serve per forzare l'uscita dal loop
			System.out.println(i);
		}*/

		loopesterno:
		// Mettendo un'etichetta al loop esterno, poi con i break posso uscire direttamente da quel loop anche se il break è inserito in un loop interno
		for (int i = 0; i < 5; i++) {
			if (i == 3) continue;
			System.out.println("i: " + i);
			for (int j = 0; j < 5; j++) {
				if (j == 2) break loopesterno;
				System.out.println("j: " + j);
			}
		}

		scanner.close();
	}
}
