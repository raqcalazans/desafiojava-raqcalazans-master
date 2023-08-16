package codigo;

import java.lang.String;
import java.util.Scanner;

public class Basico04 {
    static Scanner leitor = new Scanner(System.in);

    public static String lerFrase() {
        System.out.println("Digite uma frase de at\u00E9 100 caracteres ou 'fim' para terminar: ");
        String fraseLida = leitor.nextLine();

        return fraseLida;
    }
    
    public static String inverter(String frase) {
        final int TAMANHO_MAX = 100;
        int tamanho;

        if (frase.length() < TAMANHO_MAX) {
            tamanho = frase.length();
        } else {
            tamanho = 100;
        }

        char[] fraseArray = frase.toCharArray();

        for (int i = 0; i < tamanho/2; i++) {
            char letra = fraseArray[i];
            fraseArray[i] = fraseArray[tamanho - i - 1];
            fraseArray[tamanho - i - 1] = letra;
        }

        String fraseInvertida = String.valueOf(fraseArray); 
        return fraseInvertida;
    }

    static void imprimir(String frase) {
        System.out.println("\nFrase Invertida:\n");
        System.out.println(frase);
        System.out.println("\nFIM.\n");
    }

    public static void main(String[] args) throws Exception {
        String frase = new String();

        frase = lerFrase();
        frase = inverter(frase);
        imprimir(frase);
        leitor.close();
    }
}