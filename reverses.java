import java.util.*;
class reverses{
    public static void main(String[]args){
        int num,rev = 0,dig;
        System.out.println("Enter the number:");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        int temp = num;
        while(num>0){
            dig = num % 10;
            rev = rev*10 + dig;
            num = num/10;
        }
        System.out.println("Given number:"+temp);
        System.out.println("Reverse number:"+rev);

    }
    
}