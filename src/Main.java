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

            System.out.println("New folder");
            System.out.print("Enter a folder path: ");
            String newpath = sc.nextLine();


            boolean sucess = new File(newpath + "\\out").mkdir();
            System.out.println("Diretory created sucessfully: " + sucess);

        


        } catch (IOException e) {
            throw new RuntimeException(e);
        }catch(RuntimeException e){
            System.out.println("Error: " + e.getMessage());
        }




    }
}