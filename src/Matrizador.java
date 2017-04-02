import java.io.*;
import java.util.Scanner;

public class Matrizador {
	static String padrao;
	static int x, y, f, g, resp;
	static int[][] vetor1 = new int[11][11];
	static int[][] vetor2 = new int[11][11];
	static int[][] vetor3 = new int[11][11];

	public static void main(String[] args) {
		reader();
		writer(vetor1);
		menu();
	}
	
	@SuppressWarnings("resource")
	private static void menu() {
		Scanner e = new Scanner(System.in);
		System.out.println("\nSelecio 1 ou 2 para ver os vetores cópias ou 3 para sair:");
		resp = e.nextInt();
		switch (resp) {
		case 1:
			writer(vetor2);
			menu();
			break;
		case 2:
			writer(vetor3);
			menu();
			break;
		case 3:			
			break;
		default:
			break;
		}
	}

	public static void reader() {
		try {
			Scanner file = new Scanner(new File("example_3.txt")); //selecionar o arquivo wxemplo para execução			
			x = file.nextInt(); //recebem os primeiros parametros inteiros
			y = file.nextInt();
			padrao = file.nextLine();
			while (file.hasNext()) {
				for (int i = 0; i < y; i++) {
					padrao = file.nextLine(); //recebe a linha como string
					f = 0;
					g = 1;
					for (int j = 0; j < x; j++) {
						int valor = Integer.parseInt(padrao.substring(f, g));//corta a string por caracter
						vetor1[i][j] = valor;
						if (valor == 1) {
							vetor2[i][j] = 2;
						}
						if (valor == 0) {
							vetor3[i][j] = 2;
						}
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

	public static void writer(int[][] vetor) {
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print("|");
				System.out.print(vetor[i][j] + "|");
			}
			System.out.print("\n");
		}
	}
}