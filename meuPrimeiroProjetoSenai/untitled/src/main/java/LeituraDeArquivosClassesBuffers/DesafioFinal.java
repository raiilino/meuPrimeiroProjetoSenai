import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Leitura de Arquivos Classes Buffers
//Desafio 4 - Exibir IPs Windows
//Desafio Final - Relatório de Ativos
public class Main {
    public static void main(String[] args) throws IOException {
        String arquivo = "C:\\Users\\Downloads\\ativos.csv";
        int totalAtivos = 0;
        int linux = 0;
        int windows = 0;
        int firewall = 0;
        int outros = 0;

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");

                if (dados.length >= 3) {
                    String ip = dados[1];
                    String sistema = dados[2];
                    if (sistema.equalsIgnoreCase("Windows")) {
                        System.out.println("IPs Windows: " + ip);
                        totalAtivos++;
                        String sistema = dados[2].trim();
                        if (sistema.equalsIgnoreCase("Linux")) {
                            linux++;
                        } else if (sistema.equalsIgnoreCase("Windows")) {
                            windows++;
                        } else if (sistema.equalsIgnoreCase("Firewall")) {
                            firewall++;
                        } else {
                            outros++;
                        }
                    }
                }
                System.out.println("      RELATÓRIO DE ATIVOS        ");
                System.out.println("Total de Ativos: " + totalAtivos);
                System.out.println("Linux:    " + linux);
                System.out.println("Windows:  " + windows);
                System.out.println("Firewall: " + firewall);
                if (outros > 0) {
                    System.out.println("Outros:   " + outros);
                }
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }