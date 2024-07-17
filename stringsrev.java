import java.util.*;
public class stringsrev{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        stringsrev obj2 = new stringsrev();
        obj2.rev(str);
    }
    public void rev(String a){
        char s;
        String p = "";
        for(int i=0;i<a.length();i++){
            s = a.charAt(i);
            p = s + p;
        }
        System.out.println(p);
    }
}