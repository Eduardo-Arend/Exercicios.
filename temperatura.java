import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura atual: ");
        double temperatura = scanner.nextDouble();

        if (temperatura > 35) {
            System.out.println("A temperatura está acima de 35 graus. Use protetor solar!");
        } else {
            System.out.println("A temperatura está abaixo de 35 graus. Não é necessário usar protetor solar.");
        }

        scanner.close();
    }
}