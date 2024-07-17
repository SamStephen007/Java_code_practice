import java.io.File;
import java.util.*;
import java.io.IOException;
public class readfile {
    public static void main(String[] args) {
        try{
            File obj = new File("E:/java/myfile.txt");
            Scanner Reader = new Scanner(obj);
            while(Reader.hasNextLine()){
                String data = Reader.nextLine();
                System.out.println(data);
            }
        Reader.close();
        }
    catch(IOException d){
        System.out.println("An error occured");
    }
}
    
}
