import java.util.Scanner;
import java.util.Random;

public class SorteioSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Solicita dois números inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int menor, maior;
        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }

        int numeroSorteado = menor + random.nextInt(maior - menor + 1);

        if (numeroSorteado % 2 == 0) {
            System.out.println("Número sorteado: " + numeroSorteado + " (Par)");
        } else {
            System.out.println("Número sorteado: " + numeroSorteado + " (Ímpar)");
        }

        scanner.close();
    }
}