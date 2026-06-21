import java.io.*;
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

            String newpath = path.getParent();
            File outDir = new File(newpath + "\\out");
            if (!outDir.exists()) {
                outDir.mkdir();
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }catch(RuntimeException e){
            System.out.println("Error: " + e.getMessage());
        }




    }
}