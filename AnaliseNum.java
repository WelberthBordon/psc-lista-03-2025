import java.util.Scanner;

public class AnaliseNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        double maior = num1;
        double menor = num1;

        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        double media = (num1 + num2 + num3) / 3;



        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média aritmética: " + media);

        scanner.close();
    }
}