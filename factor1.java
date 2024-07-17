class adhi{
    public static int factor(int number){
        int fact = 1,i;
        for(i=2;i<=number;i++){
            fact = fact*i;
        }
        return fact;
    }
}
public class factor1 {
    public static void main(String[] args) {
        adhi obj = new adhi();
        int result;
        result = obj.factor(5);
        System.out.println(result);
    }
}
