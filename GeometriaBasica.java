import java.util.Scanner;

public class GeometriaBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação:");
        System.out.println("1 - Perímetro do círculo");
        System.out.println("2 - Área do círculo");
        System.out.println("3 - Volume da esfera");
        int operacao = scanner.nextInt();

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();
        double pi = 3.141592;
        
        if (operacao == 1) {
            double perimetro = 2 * pi * raio;
            System.out.println("Perímetro do círculo: " + perimetro);
        } else if (operacao == 2) {
            double area = pi * raio * raio;
            System.out.println("Área do círculo: " + area);
        } else if (operacao == 3) {
            double volume = (4.0 / 3.0) * pi * raio * raio * raio;
            System.out.println("Volume da esfera: " + volume);
        } else {
            System.out.println("Código da operação inválido.");
        }

        scanner.close();
    }
}