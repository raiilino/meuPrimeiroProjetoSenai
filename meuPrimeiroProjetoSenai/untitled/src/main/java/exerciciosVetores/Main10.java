import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Informe o valor da matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 8) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) break;
        }

        if (encontrado) {
            System.out.println("O valor 8 foi encontrado na matriz!");
        } else {
            System.out.println("O valor 8 NÃO foi encontrado na matriz.");
        }
    }
}