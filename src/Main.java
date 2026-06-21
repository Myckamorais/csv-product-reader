import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String strPath = "C:\\ProjectIntellij\\csv-product-reader\\src\\products.csv";

        File path = new File(strPath);

        //O arquivo de saída fica na mesma pasta do CSV de entrada
        String newPath = path.getParent();

        // garante que a pasta out existe antes de tentar escrever
        File outDir = new File(newPath + "\\out");
        if (!outDir.exists()) {
            outDir.mkdir();
        }

        //Realiza a leitura do arquivo de entrada e escrita do arquivo de saída
        try (BufferedReader br = new BufferedReader(new FileReader(path));
             BufferedWriter bw = new BufferedWriter(new FileWriter(newPath + "\\out\\summary.csv"))) {

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);
                double total = price * quantity;
                line = br.readLine();

                String totalFormatted = String.format("%.2f", total);
                bw.write(name + "," + totalFormatted);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}