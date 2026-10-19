import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

void main() {
File arquivo = new File("TESTE.txt");

        if(arquivo.exists()) {
        System.out.println("Arquivo ja existe");
        } else {
            try {
                if (arquivo.createNewFile()) {
                    System.out.println("Criado com sucesso");
                } else {
                    System.out.println("Não deu :(");
                }
            } catch(IOException e){
                    throw new RuntimeException(e);
                }
            }
        }
