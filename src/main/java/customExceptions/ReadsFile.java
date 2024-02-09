package customExceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadsFile {
    public static void main(String[] args) {
        try {
            File myfile = new File(("C:\\Users\\venka\\IdeaProjects\\Maven_sample\\src\\main\\resources\\file.txt"));

            Scanner sc = new Scanner(myfile);
            while (sc.hasNext()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}