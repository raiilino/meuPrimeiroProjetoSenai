import java.util.Scanner;

class Main13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor da transação: R$ ");
        double valorTransacao = entrada.nextDouble();

        if (valorTransacao > 10000) {
            System.out.println("Transação suspeita! Sinalizada para análise.");
        } else {
            System.out.println("Transação normal. Liberada.");
        }

        entrada.close();
    }
}