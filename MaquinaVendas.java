import java.util.Scanner;

public class MaquinaVendas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor da compra: ");
        int compra = scanner.nextInt();

        System.out.print("Valor pago: ");
        int pago = scanner.nextInt();

        if (pago < compra) {
            System.out.println("Pagamento insuficiente.");
        } else {
            int troco = pago - compra;
            System.out.println("Troco: R$ " + troco);

            int[] notas = {50, 20, 10, 5, 2, 1};
            for (int nota : notas) {
                if (troco >= nota) {
                    System.out.println("Notas de R$ " + nota + ": " + (troco / nota));
                    troco %= nota;
                }
            }
        }
        scanner.close();
    }
}