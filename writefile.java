import java.io.FileWriter;
import java.io.IOException;
public class writefile {
    public static void main(String[] args) {
        try{
            FileWriter obj = new FileWriter("E:/java/myfile.txt");
            obj.write("FELL PAIN!!ACCEPT PAIN!! AND KNOW PAIN!!");
            obj.close();
            System.out.println("SUCCESSFULLY WRITTEN");
        }
        catch(IOException f){
            System.out.println("An error has occured");
        }
    }
}
