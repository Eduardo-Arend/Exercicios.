import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de termos da sequência de Fibonacci desejados: ");
        int n = scanner.nextInt();

        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.println("Sequência de Fibonacci até o " + n + "º termo:");

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiroTermo + " ");

            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        scanner.close();
    }
}