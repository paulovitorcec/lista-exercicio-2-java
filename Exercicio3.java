import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float coeficienteA, coeficienteB, coeficienteC;
        double delta;

        System.out.println("Exercício 3 - Equação de segundo grau:");

        System.out.print("Informe o coeficiente A: ");
        coeficienteA = scanner.nextFloat();

        System.out.print("Informe o coeficiente B: ");
        coeficienteB = scanner.nextFloat();

        System.out.print("Informe o coeficiente C: ");
        coeficienteC = scanner.nextFloat();

        /// Já podemos validar essa regra nesta linha
        if (coeficienteA == 0 && coeficienteB == 0 && coeficienteC != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else {
            System.out.printf("\n\nEquação informada: %.2fx² + %.2fx + %.2f = 0 \n", coeficienteA, coeficienteB,
                    coeficienteC);
            if (coeficienteA == 0 && coeficienteB != 0) {
                System.out.println("Essa é uma equação de primeiro grau");
                System.out.println("Resultado: " + (coeficienteC * -1) / coeficienteB);
            } else {
                delta = Math.pow(coeficienteB, 2) - (4 * coeficienteA * coeficienteC); // delta = b² - 4ac
                if (delta < 0)
                    System.out.println("Esta equação não possui raízes reais");
                else if (delta == 0)
                    System.out.println("Esta equação possui duas raízes iguais:");

                double raizUm, raizDois;
                raizUm = (-coeficienteB + Math.sqrt(Math.abs(delta))) / (2 * coeficienteA);
                raizDois = (-coeficienteB - Math.sqrt(Math.abs(delta))) / (2 * coeficienteA);

                System.out.println("Raíz Um (delta positivo): " + raizUm);
                System.out.println("Raíz Dois (delta negativo): " + raizDois);

            }
        }

        scanner.close();
    }

}

///  Paulo Vítor Amorim de Oliveira RA: 323114192