import java.util.*;
public class tryandcatch {
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        int d = obj.nextInt();
        int arr[] = {1,2,3,4,5};
        try{
            c=a/b;
            System.out.println(arr[d]);
            System.out.println(c);
        }
        catch(ArithmeticException f){
            System.out.println("NUMBER  CAN'T BE DIVIDED BY ZERO");
        }
        catch(ArrayIndexOutOfBoundsException v){
            System.out.println("Array out of bound");
        }
    }
}
