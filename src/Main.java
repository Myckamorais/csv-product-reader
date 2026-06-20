import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String strPath = "C:\\ProjectIntellij\\csv-product-reader\\src\\products.csv";

        File path = new File(strPath);

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }catch(RuntimeException e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}