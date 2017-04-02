import java.io.*;
import java.util.Scanner;

public class Matrizador {
	static String padrao;
	static int x, y, f, g;
	static String[][] vetor = new String[11][11];

	public static void main(String[] args) {
		reader();
		writer();
	}

	public static void reader() {
		try {
			Scanner file = new Scanner(new File("example_4.txt"));			
			x = file.nextInt(); //recebem os primeiros parametros inteiros
			y = file.nextInt();
			padrao = file.nextLine();
			while (file.hasNext()) {
				for (int i = 0; i < y; i++) {
					padrao = file.nextLine(); //recebe a linha como string
					f = 0;
					g = 1;
					for (int j = 0; j < x; j++) {
						vetor[i][j] = padrao.substring(f, g);  //corta a string por caracter
						f++;
						g++;
					}
				}
			}
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void writer() {
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print("|");
				System.out.print(vetor[i][j] + "|");
			}
			System.out.print("\n");
		}
	}
}