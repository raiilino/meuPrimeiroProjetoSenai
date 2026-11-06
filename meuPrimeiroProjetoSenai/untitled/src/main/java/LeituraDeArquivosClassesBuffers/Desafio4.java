import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Leitura de Arquivos Classes Buffers
//Desafio 3 - Exibir Apenas Linux
//Desafio 4 - Exibir IPs Windows
public class Main {
    public static void main(String[] args) throws IOException {
        String arquivo = "C:\\Users\\54727159899\\Downloads\\ativos.csv";
        String arquivo = "C:\\Users\\Downloads\\ativos.csv";
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length >= 3) {
                    String host = dados[0];
                    String ip = dados[1];
                    String sistema = dados[2];
                    if (sistema.equalsIgnoreCase("Linux")) {
                        System.out.println("Host Linux: " + host);
                        if (sistema.equalsIgnoreCase("Windows")) {
                            System.out.println("IPs Windows: " + ip);
                        }
                    }
                }