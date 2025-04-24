import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dois números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Solicita o operador
        System.out.print("Digite o operador (+, -, *, /, ^): ");
        char operador = scanner.next().charAt(0);

        // Executa a operação correspondente
        double resultado = 0;
        boolean operadorValido = true;

        if (operador == '+') {
            resultado = num1 + num2;
        } else if (operador == '-') {
            resultado = num1 - num2;
        } else if (operador == '*') {
            resultado = num1 * num2;
        } else if (operador == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: divisão por zero.");
                operadorValido = false;
            }
        } else if (operador == '^') {
            resultado = Math.pow(num1, num2);
        } else {
            System.out.println("Erro: símbolo de operação inválido.");
            operadorValido = false;
        }

        // Exibe o resultado se o operador for válido
        if (operadorValido) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}