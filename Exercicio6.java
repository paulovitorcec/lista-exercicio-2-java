import java.util.Scanner;
import java.util.Random;

import javax.lang.model.util.ElementScanner14;

public class Exercicio6 {
    public static void main(String[] args) {

        Random gerador = new Random();
        Scanner scanner = new Scanner(System.in);
        int N1 = 0;
        int N2 = 0;
        int Resultado = 0;

        System.out.print("Escreva o primeiro numero: ");
        N1 = scanner.nextInt();

        System.out.print("Escreva o segundo numero: ");
        N2 = scanner.nextInt();

        if (N1 > N2) {
            Resultado = gerador.nextInt(N1);
        } else {
            Resultado = gerador.nextInt(N2);
        }

        if (Resultado % 2 == 0)
            System.out.printf("O numero sorteado e par sendo ele: " + Resultado);
        else
            System.out.printf("O numero sorteado e impar sendo ele " + Resultado);
        scanner.close();
    }
}

///  Paulo Vítor Amorim de Oliveira RA: 323114192