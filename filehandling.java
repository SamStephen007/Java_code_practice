import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/*public class filehandling {
    public static void main(String[] args) {
        try{
        File obj = new File("amal.txt");
        if(obj.createNewFile()){
            System.out.println("FILE CREATED SUCCESSFULLY");
        }else{
            System.out.println("file already exists");
        }
        }
        catch(IOException y){
            System.out.println("an error occcured");
        }
    }
}*/
/*public class filehandling{
    public static void main(String[] args) {
    try{
    File obj = new File("amal.txt");
    Scanner read = new Scanner(obj);
    while(read.hasNextLine()){
        String  data = read.nextLine();
        System.out.println(data);
    }
    read.close();
}
catch(FileNotFoundException y){
    System.out.println("AN ERROR OCCURED");
}

}
}*/
public class filehandling{
    public static void main(String[] args) {
        try{
            FileWriter obj = new FileWriter("amal.txt");
            obj.write("AMAL IS A LOSU paiya");
            System.out.println("WRITED SUCCESSFULLY");
            obj.close();
        }
        catch(IOException e){
            System.out.println("FILE NOT FOUND");
        }
    }
}