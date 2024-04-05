import java.util.*;//IMPORTANT FOR INTERNAL 1
public class adamnumber {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int temp = num;
        int square,rev=0,rev2=0,dig,revsquare;
        while(num!=0){
            dig = num%10;
            rev = rev*10+dig;
            num/=10;
        }
        System.out.println(rev);
        square = temp*temp;
        System.out.println(square);
        revsquare = rev*rev;
        System.out.println(revsquare);
        while(revsquare!=0){
            int digit = revsquare%10;
            rev2 = rev2*10+digit;
            revsquare/=10;
        }
        System.out.println(rev2);
        if(square == rev2){
            System.out.println("IT IS ADAM NUMBER");
        }
        else
        System.out.println("NOT AN ADAM NUMNER");
    }
}
