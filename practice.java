import java.util.*;
import java.io.*;
class practice{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int result =  a/b;
            int []arr = new int[5];
            arr[10] = 50;
        }
        catch(ArithmeticException u){
            System.out.println("no number can't be divided by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }
        catch(Exception v){
            System.out.println(v);
        }
        finally{
            System.out.println("Finally block executed successfully");
        }

    }
}