import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Leitura de Arquivos Classes Buffers
//Desafio 1 - Exibir apenas Hosts
//Desafio 2 - Contar Dispositivos
public class Main {
    public static void main(String[] args) throws IOException {
        String arquivo = "/C://Users//Downloads//ativos.csv/";
        String arquivo = "C:\\Users\\Downloads\\ativos.csv";
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            int total = 0;

            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));

            String linha;
            while (true){
                try {
                    if (!((linha = leitor.readLine()) != null)) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                    while ((linha = leitor.readLine()) != null) {
                        total++;
                    }
                    String[] dado = linha.split(",");
                    String hosts = dado[0];

                    System.out.println("Host: "+ hosts);
                    System.out.println("Total de dispositivos encontrados: " + total);

                } catch (IOException e) {
                    System.out.println("Erro ao ler o arquivo: " + e.getMessage());

                }