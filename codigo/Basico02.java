package codigo;

import java.util.Arrays;
import java.util.Scanner;

public class Basico02 {
    static Scanner teclado = new Scanner(System.in);

    public static void imprimirVetorDeInteiros(int[] vet) {
        for (int i : vet) {
            System.out.print(i + " - ");
        }
    }

    public static void lerVetorDeInteiros(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print("\nDigite o " + (i + 1) + " número: ");

            vet[i] = Integer.parseInt(teclado.nextLine());
        }
    }

    public static int[] somarVizinhosEmVetorDeInteiros(int[] vet) {
        int tamanhoNovoVetor = (vet.length / 2) + 1;
        int ultimoValor = vet[vet.length - 1];

        int[] novoVetor = new int[tamanhoNovoVetor];

        for (int i = 0; i < vet.length - 1; i += 2) {
            novoVetor[i / 2] = vet[i] + vet[i + 1];
        }

        if (vet.length % 2 == 1) {
            novoVetor[tamanhoNovoVetor - 1] = ultimoValor + ultimoValor;
        } else {
            novoVetor = Arrays.copyOf(novoVetor, tamanhoNovoVetor - 1);
        }

        return novoVetor;
    }

    public static void main(String[] args) {
        int[] valores = new int[5];

        lerVetorDeInteiros(valores);
        int[] vetorSomado = somarVizinhosEmVetorDeInteiros(valores);
        imprimirVetorDeInteiros(vetorSomado);
        teclado.close();
    }
}