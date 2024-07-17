import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner obj =   new Scanner(System.in);
        int temp,num,rev=0;
        num = obj.nextInt();
        temp  = num;
        while(num!=0){
            int dig;
            dig = num%10;
            rev = rev*10+dig;
            num/=10;
        }
        System.out.println(rev);
        if(rev == temp){
            System.out.println("IT IS PALINDROME");
        }else{
            System.out.println("IT IS NOT A PALINDROME");
        }
    }
}
