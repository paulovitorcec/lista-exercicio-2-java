import java.util.Scanner;

/**
 * Escreva o algoritmo de uma máquina de venda automática de salgadinhos, doces,
 * sucos e refrigerantes. O algoritmo deve calcular o menor número de notas que
 * deve
 * ser dado de troco para um pagamento efetuado.
 * O algoritmo deve ler o valor da compra e o valor pago. Se o valor pago for
 * menor que
 * o valor da compra, a máquina deve apresentar uma mensagem, informando que a
 * quantia paga é insuficiente para realizar a compra. A máquina aceita apenas
 * notas de
 * R$ 50.00, R$ 20.00, R$ 10.00, R$ 5.00, R$ 2.00 e R$ 1.00.
 * 
 * @author Caio Alves (@ocai0)
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitorEntrada = new Scanner(System.in);
        double valorCompra, valorPago;
        System.out.println("Exercício 1 - Cálculo do menor número de notas para máquina de vendas");
        System.out.println("Informe o valor total da compra");
        valorCompra = leitorEntrada.nextDouble();
        System.out.println("Informe a quantia total entregue pelo cliente");
        valorPago = leitorEntrada.nextDouble();

        if (valorPago < valorCompra) {
            System.out.printf("A quantia de %.2f é insuficiente para pagar a compra de %.2f", valorPago, valorCompra);
        } else {
            double troco = valorPago - valorCompra;
            int qtdNotas50, qtdNotas20, qtdNotas10, qtdNotas5, qtdNotas2, qtdNotas1;
            // Como as divisões feitas aqui levam a um resultado do tipo double, eu tive que
            // fazer uma conversão (cast) para o tipo inteiro
            // O cast é esse "(int)" que você vê nas linhas abaixo, ele transforma um tipo
            // compatível (neste caso double), em um valor do tipo inteiro
            qtdNotas50 = (int) troco / 50;
            troco = troco % 50;
            qtdNotas20 = (int) troco / 20;
            troco = troco % 20;
            qtdNotas10 = (int) troco / 10;
            troco = troco % 10;
            qtdNotas5 = (int) troco / 5;
            troco = troco % 5;
            qtdNotas2 = (int) troco / 2;
            troco = troco % 2;
            qtdNotas1 = (int) troco;
            System.out.printf("Deverá ser pago o troco de %.2f com as seguintes notas:", valorPago - valorCompra);
            if (qtdNotas50 > 0)
                System.out.printf("\n %d nota(s) de R$ 50,00", qtdNotas50);
            if (qtdNotas20 > 0)
                System.out.printf("\n %d nota(s) de R$ 20,00", qtdNotas20);
            if (qtdNotas10 > 0)
                System.out.printf("\n %d nota(s) de R$ 10,00", qtdNotas10);
            if (qtdNotas5 > 0)
                System.out.printf("\n %d nota(s) de R$ 5,00", qtdNotas5);
            if (qtdNotas2 > 0)
                System.out.printf("\n %d nota(s) de R$ 2,00", qtdNotas2);
            if (qtdNotas1 > 0)
                System.out.printf("\n %d nota(s) de R$ 1,00", qtdNotas1);
        }
        leitorEntrada.close();
    }
}

///  Paulo Vítor Amorim de Oliveira RA: 323114192