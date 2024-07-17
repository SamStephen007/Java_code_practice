public class factorial {
    public  static int factor(int number){
        int i,fact = 1;
        for(i=2;i<=number;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args){
        int result = factor(5);
        System.out.println(result);
    }
}
