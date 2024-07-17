public class throwing {
    static void check(int n) throws ArithmeticException{
        if(n<18){
            throw new ArithmeticException("Access denied- not old enough");
        }
        else{
            System.out.println("Access granted");
        }
    }
    public static void main(String[] args) {
        final int n = 11;
        try{
            
            check(n);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("END OF THE CODE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
        }
    }
}