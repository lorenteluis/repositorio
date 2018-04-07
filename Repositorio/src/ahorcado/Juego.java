package ahorcado;
/* Crear un juego del ahorcado, en el que un primer usuario introduzca la palabra a adivinar, 
se muestre esta programa oculta con guiones (-----) y el programa acepte las letras que introduzca
el segundo usuario, cambiando los guiones por letras correctas cada vez que acierte (por ejemplo, a---a-t-).
La partida terminará cuando se acierte la palabra por completo o el usuario agote sus 8 intentos. */

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i, contador = 8, contador2 = 0;
		String palabra, palabra3;
		String letraIntroducida;

		System.out.print("\n\nIntroduzca la palabra a adivinar:    ");
		palabra =  teclado.nextLine();
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n");

		StringBuilder palabra2 = new StringBuilder(palabra);
		String[] letraPalabra = new String[palabra2.length()];

		for (i = 0; i < palabra2.length(); i++) {
			letraPalabra[i] = palabra2.toString();
			palabra2.replace(i, i, "_");
			//letraPalabra[i] = Convert.toString(palabra2[i]);
			//palabra2.Replace(letraPalabra[i], "-");
		}

		System.out.print(palabra2);
		do {
			System.out.print("\n\nIntroduzca una letra");
			letraIntroducida = teclado.nextLine();
			//letraIntroducida = Convert.toChar(teclado.nextLine());
			System.out.print("\n\n");

			/*for (i = 0; i < palabra2.length(); i++) {
				if (letraIntroducida == palabra[i]) {
					palabra2[i] = letraIntroducida;
					contador2++;
				}
			}*/

			if (contador2 > 0)
				System.out.printf("\n\n¡¡Acertaste!!, te siguen quedando {0} intentos", contador);

			else {
				contador--;
				if (contador != 0)
					System.out.printf("\n\n¡¡Fallaste!!, te quedan {0} intentos", contador);
				else
					System.out.print("\n\n¡¡Perdiste la partida!!");
			}

			contador2 = 0;
			palabra3 = palabra2.toString();
			System.out.printf("\n\n{0}", palabra2);

		} while (contador != 0 && palabra3.contains("-"));

		if (contador == 0)
			System.out.print("\n\nAgotaste los 8 intentos");
		else
			System.out.print("\n\n¡¡Ganaste");

	}
}
