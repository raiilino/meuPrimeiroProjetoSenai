import java.util.Scanner;

class Main10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o salário do cliente: ");
        double salario = entrada.nextDouble();

        System.out.print("Informe o valor da parcela desejada: ");
        double parcela = entrada.nextDouble();

        // Calcula o limite correspondente a 30% do salário
        double limiteParcela = salario * 0.30;

        if (parcela <= limiteParcela) {
            System.out.println("Empréstimo aprovado.");
        } else {
            System.out.println("Empréstimo recusado.");
        }

        entrada.close();
    }
}