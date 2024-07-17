
import java.util.*;
public class trycatch {
    public static void main(String[] args) {
    int a,b,c;
    Scanner obj = new Scanner(System.in);
    a = obj.nextInt();
    b = obj.nextInt();
   
    try
    {
        c = a/b;
         int arr[] = {1,2,3,4,5};
        System.out.println(c);
        System.out.println(arr[6]);
    }    
    catch(ArrayIndexOutOfBoundsException|ArithmeticException l){
        System.out.println("Array out of bound");
        System.out.println("CAN'T DIVIDE BY ZERO");
    }
    
    catch(ArrayIndexOutOfBoundsException sss)
    {
     System.out.println("Array is out of bound");
   
    }
    catch(ArithmeticException ddd)
    {
     System.out.println("CAN' DIVIDED BY ZERO");
    }

   catch(Exception d)
    {
        System.out.println("GIVEN NUMBER IS NOT DIVIDED");
        System.out.println(d);
    }
}

}
//import java.lang.reflect.Array;