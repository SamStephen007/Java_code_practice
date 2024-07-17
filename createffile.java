import java.io.File;
import java.io.IOException;
public class createffile {
    public static void main(String[] args) {
        
            File obj = new File("E:/java/myfile.txt");
        try{
            if(obj.createNewFile()){
                System.out.println("File created successfully: " + obj.getName());
            }else{
                System.out.println("FILE ALREADY EXIST");
            }
        }
        catch(IOException e)
        {
            System.out.println(" An error occured");
        }
    }
}
