import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class filereadwrite {
    public static void main(String[] args) {
        try {
            File obj = new File("myfile.txt");
            Scanner read = new Scanner(obj);
            while (read.hasNextLine()) {
                String data = read.nextLine();
                System.out.println(data);
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
        }
    }
}
