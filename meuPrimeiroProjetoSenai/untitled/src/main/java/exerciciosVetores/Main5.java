import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int [] valores = {8, 5, 2, 5, 10, 7, 5, 3};
        Scanner entrada = new Scanner(System.in);

        int [] valores = new int [5];
        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("informe o valor do vetor " + i + ": ");
            valores[i] = entrada.nextInt();
            soma += valores[i];
            System.out.print(valores[i]);
            if (i == valores.length - 1) break;
            System.out.print(" + ");
        }

        System.out.println(" = " + soma);
        System.out.println("o resultado é: " + soma);
    }
}