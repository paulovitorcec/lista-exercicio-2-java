import java.util.Scanner;

/**
 * Escreva um algoritmo que leia 3 números a partir do teclado. O algoritmo deve
 * apresentar:
 * a. O maior número.
 * b. O menor número.
 * c. A média aritmética dos três números.
 * 
 * @author Caio Alves (@ocai0)
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitorEntrada = new Scanner(System.in);
        double primeiroNumero, segundoNumero, terceiroNumero;

        System.out.println("Exercício 1 - Qual o maior número");
        System.out.println("Informe o primeiro número");
        primeiroNumero = leitorEntrada.nextDouble();
        System.out.println("Informe o segundo número");
        segundoNumero = leitorEntrada.nextDouble();
        System.out.println("Informe o terceiro número");
        terceiroNumero = leitorEntrada.nextDouble();

        double maiorNumero = primeiroNumero;
        if (segundoNumero > maiorNumero) maiorNumero = segundoNumero;
        if (terceiroNumero > maiorNumero) maiorNumero = terceiroNumero;

        double menorNumero = primeiroNumero;
        if (segundoNumero < menorNumero) menorNumero = segundoNumero;
        if (terceiroNumero < menorNumero) menorNumero = terceiroNumero;

        double mediaAritmetica = (primeiroNumero + segundoNumero + terceiroNumero) / 3;

        System.out.printf("Dos números informados [%.2f, %.2f, %.2f], o maior número foi: %.2f \n", primeiroNumero, segundoNumero, terceiroNumero, maiorNumero);
        System.out.printf("Dos números informados [%.2f, %.2f, %.2f], o menor número foi: %.2f \n", primeiroNumero, segundoNumero, terceiroNumero, menorNumero);
        System.out.printf("A média aritmética dos números [%.2f, %.2f, %.2f], é de: %.2f \n", primeiroNumero, segundoNumero, terceiroNumero, mediaAritmetica);
        leitorEntrada.close();
    }
}
///  Paulo Vítor Amorim de Oliveira RA: 323114192