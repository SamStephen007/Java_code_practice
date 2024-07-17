public class multicatch {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 0;
            int arr[] = new int[5];
            //int c = a/b;
            //System.out.println(c);
            System.out.println(arr[4]);
        }
        catch(ArithmeticException e){
            System.out.println("no number can be divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException f){
            System.out.println("Array out of bound");
        }
        catch(Exception g){
            System.out.println("parent error occured");
        }
    }
}
