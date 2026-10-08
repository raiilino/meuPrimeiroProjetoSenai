import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Informe o valor da matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nSomando os elementos:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
                System.out.print(matriz[i][j]);

                if (!(i == matriz.length - 1 && j == matriz[i].length - 1)) {
                    System.out.print(" + ");
                }
            }
        }

        System.out.println(" = " + soma);
        System.out.println("O resultado é: " + soma);
    }
}