import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int rev;
        int  num =  obj.nextInt();
        while(num!=0)
        {
            rev = num%10;
            System.out.print(rev);
            num = num/10;
        }
    }
}
