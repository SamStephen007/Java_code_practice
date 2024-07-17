/*import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
public class copyfile {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            String data;
            File obj = new File("E:/java/myfile.txt");
            Scanner obj1 = new Scanner(obj);
            while(obj1.hasNextLine()){
                data = obj1.nextLine();
                System.out.println(data);
            }
            try{
                FileWriter obj2 = new FileWriter("E:/java/pain.txt");
                obj2.write(data);
                obj2.close();
            }
            catch (IOException e){
                System.out.println("error");
            }
            System.out.println("Content copied successfully");
        }
        catch(FileNotFoundException v){
            System.out.println("error");
        }
    }
}*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException; 
import java.util.*;
import java.io.FileWriter;
public class copyfile{
 public static void main(String[] args) throws FileNotFoundException{
 try{
 String data;
 File obj=new File("E:/java/myfile.txt");
 Scanner obj1=new Scanner(obj);
 while(obj1.hasNextLine()){
 data=obj1.nextLine();
 System.out.println(data);
 try{
 FileWriter obj2=new FileWriter("E:\\java\\pain.txt");
 obj2.write(data);
 obj2.close();
 }
 catch(IOException e){
 System.out.println("Error");
 }
 }
 System.out.println("content from a.txt is copied to b.txt successfully!!!");
 }
 catch(FileNotFoundException a){
 System.out.println("Error!!!");
 }
 }
}