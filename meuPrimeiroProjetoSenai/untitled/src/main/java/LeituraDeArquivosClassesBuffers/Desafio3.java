import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Leitura de Arquivos Classes Buffers
//Desafio 2 - Contar Dispositivos
//Desafio 3 - Exibir Apenas Linux
public class Main {
    public static void main(String[] args) throws IOException {
        String arquivo = "C:\\Users\\Downloads\\ativos.csv";
        String arquivo = "C:\\Users\\54727159899\\Downloads\\ativos.csv";
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            int total = 0;

            while ((linha = leitor.readLine()) != null) {
                total++;
                String[] dados = linha.split(",");
                if (dados.length >= 3) {
                    String host = dados[0];
                    String sistema = dados[2];
                    if (sistema.equalsIgnoreCase("Linux")) {
                        System.out.println("Host Linux: " + host);
                    }
                }
            }

            System.out.println("Total de dispositivos encontrados: " + total);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());

        }

    }
}