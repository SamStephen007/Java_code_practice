import java.util.*;
public class sumofdig {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int sum=0,dig,num;
        num = obj.nextInt();
        while(num!=0){
            dig = num%10;
            sum += dig;
            num/=10;
        }
        System.out.println(sum);
    }
}
