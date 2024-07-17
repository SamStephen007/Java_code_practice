import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class readandwrite {
    public static void main(String[] args) {
        try{
            File obj = new File("E:/java/myfile.txt");
            Scanner reader = new Scanner(obj);
            FileWriter  obj1 = new FileWriter("E:/java/test.txt");
            obj1.Write(reader);
            obj1.close();
            obj.close();
            System.out.println("Successfully read and write");
        }
        catch(IOException e){
            System.out.println("An error occured");
        }
    }
}
