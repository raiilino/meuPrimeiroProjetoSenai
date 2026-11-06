import java.io.IOException;
import java.util.Scanner;

//Leitura de Arquivos Classes Buffers
//Desafio 1 - Exibir apenas Hosts
public class Main {
    public static void main(String[] args) throws IOException {
        String arquivo = "/C://Users//Downloads//ativos.csv/";
        @@ -19,12 +20,9 @@ public static void main(String[] args) throws IOException {
        }
        String[] dado = linha.split(",");
        String hosts = dado[0];
        String ips = dado[1];
        String so = dado[2];

        System.out.println("Host: "+ hosts);
        System.out.println("IPS: "+ ips);
        System.out.println("SO: "+ so);

    }

}