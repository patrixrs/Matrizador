import java.io.*;
import java.util.Scanner;

public class Matrizador {
	static String padrao;
	static int x, y;
	static String[][] vetor = new String[10][10];

	public static void main(String[] args) {
		reader();
		writer();		
	}

	public static void reader() {
		try {
			Scanner file = new Scanner(new File("example_4.txt"));
			padrao = file.nextLine();
			x = Integer.parseInt(padrao.substring(0, 1));			
			y = Integer.parseInt(padrao.substring(2));			
			while (file.hasNext()) {
				padrao = file.nextLine();
				//System.out.println(padrao+" "+x+" "+y );
				for (int i = 0; i < x; i++) {
					for (int j = 0; j < y; j++) {						
						vetor[i][j] = padrao;//falta dividir a string
					}			
				}								
			}
			file.close();
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

	public static void writer() {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print("|");
				System.out.print(vetor[i][j] + "|");
			}
			System.out.print("\n");
		}
	}
}