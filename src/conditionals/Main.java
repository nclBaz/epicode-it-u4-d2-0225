package conditionals;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// --------------------------------------------- IF ELSE --------------------------------------------------
		// if ("") System.out.println("La stringa è vuota"); <-- NON Siamo in JS quindi non esiste il concetto di Truthy/Falsy (stringa vuota sarebbe falsy in JS)
	/*	if ("".isEmpty()) System.out.println("La stringa è vuota");

		int x = 1, y = 2, z = 3;

		if (x > y) System.out.println("X è maggiore di Y");
		else System.out.println("X è minore o uguale a Y");

		if (!(x > y)) System.out.println("X non è minore di Y");

		// ----------------------------------------------- TERNARY --------------------------------------------------
		String testo = x > y ? "X è maggiore di Y" : "X  è minore o uguale a Y";
		System.out.println(testo);

		int a = x > y ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println(a); */

		// ---------------------------------------------- SWITCH-CASE ------------------------------------------------

		Scanner scanner = new Scanner(System.in);
/*
		System.out.println("Dammi il voto");
		int score = Integer.parseInt(scanner.nextLine());

		switch (score) {
			case 100:
			case 90:
				System.out.println("Il voto è eccellente");
				break;
			case 80:
				System.out.println("Il numero inserito è 3");
				break;
			case 70:
				System.out.println("Il numero inserito è 4");
				break;
			default:
				System.out.println("Il numero non è nessuno dei precedenti");
		}

		System.out.println("Dammi il primo numero");
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.println("Dammi il secondo numero");
		int num2 = Integer.parseInt(scanner.nextLine());

		int num3 = num1 > num2 ? num1 : num2; // 1000

		switch (num3) {
			case 10: {
				System.out.println("è 10");
				num1++;
			}
			case 100: {
				System.out.println("è 100");
				num1--;
				break;
			}
			case 1000: {
				System.out.println("è 1000");
				num1++; // 1001
			}
			default: {
				System.out.println("Nessuno dei precedenti");
				num1--; // 1000
				break;
			}
		}

		System.out.println("num1? " + ++num1); // 1001 // Pre incremento, prima incrementa e poi legge il valore
		System.out.println("num1? " + num1++); // 1001 --> 1002  Post incremento, prima leggo e poi incremento

		System.out.println(num1);

		*/

		System.out.println("Inserisci un numero da 1 a 7");
		int num = Integer.parseInt(scanner.nextLine());

		// Enhanced Switch-Case, utile per quando devo assegnare un valore ad una variabile basandomi sulle condizioni definite nello switch
		String giornoInLettere = switch (num) {
			case 1 -> "Lun"; // I break in questo caso sono impliciti
			case 2 -> "Mar";
			case 3 -> "Mer";
			case 4 -> "Gio";
			case 5 -> "Ven";
			case 6 -> "Sab";
			case 7 -> "Dom";
			default -> "Num inserito non valido";
		};

		System.out.println(giornoInLettere);


		scanner.close();
	}
}
