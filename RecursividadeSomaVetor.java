import java.util.*;

public class RecursividadeSomaVetor {
    public static void main(String[] args) {

        int[] vet = new int[10];
        int tam = vet.length;

        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            vet[i] = rnd.nextInt(10);
            System.out.printf("%1$5d", vet[i]);
        }

        System.out.println("\n\n");

        System.out.println("\n\nSoma = " + somaVetor(vet, tam-1));
    }

    static int somaVetor(int[] vet, int tam) {
        int soma = 0;
        if (tam < 0) {
            return 0;
        } else {
            soma = vet[tam] + somaVetor(vet, tam - 1);
        }
        return soma;
    }
}