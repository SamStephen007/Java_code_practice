import java.util.*;
public class divisibleby3 {
    public static void main(String[]  args){
    int num;
    Scanner obj = new Scanner(System.in);
    num = obj.nextInt();
    if(num%3==0){
        System.out.println("The given number is divisible by 3");
    }else{
        System.out.println("The given num is not divisible by 3 and gives remainder "+ num%3);
    }
}
}
