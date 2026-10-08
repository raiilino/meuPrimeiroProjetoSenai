import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Informe o valor da matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Soma de cada linha:");


        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;

            System.out.print("Linha " + i + ": ");

            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];
                System.out.print(matriz[i][j]);

                if (j < matriz[i].length - 1) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + somaLinha);
        }
    }
}