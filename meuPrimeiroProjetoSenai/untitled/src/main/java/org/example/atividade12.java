import java.util.Scanner;

class Main12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a renda mensal: R$ ");
        double renda = entrada.nextDouble();

        System.out.print("Informe o score de crédito: ");
        int score = entrada.nextInt();

        // Operador AND (&&) para verificar as duas condições necessárias
        if (renda > 8000 && score > 700) {
            System.out.println("Cartão Premium aprovado!");
        } else {
            System.out.println("Cartão Premium recusado.");
        }

        entrada.close();
    }
}