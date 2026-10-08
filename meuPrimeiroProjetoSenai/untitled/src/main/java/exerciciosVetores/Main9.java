import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int contadorPares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Informe o valor da matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    contadorPares++;
                }
            }
        }

        System.out.println("A quantidade de números pares na matriz é: " + contadorPares);
    }
}