import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número real:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número real:");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o símbolo da operação desejada (+, -, *, / ou ^): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 / numero2;
                break;
            case '^':
                resultado = Math.pow(numero1, numero2);
                break;
            default:
                System.out.println("Erro: símbolo da operação inválido.");
                System.exit(0);
        }

        System.out.println("O resultado é: " + resultado);
    }
}

///  Paulo Vítor Amorim de Oliveira RA: 323114192