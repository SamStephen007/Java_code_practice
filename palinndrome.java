import java.util.*;
public class palinndrome {
    public static void main(String[]args){
        String sc,rev = "";
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String:");
        sc = obj.nextLine();
        int length = sc.length();
        for(int i = length-1;i>=0;i--){
           rev = rev + sc.charAt(i);
        }
        if(sc.equals(rev)){
            System.out.println("the given string is palindrome");
        }else{
            System.out.println("it is not palindrome");
        }
        obj.close();
    }
}
