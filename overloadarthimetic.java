class arthimetic{
    void multiply(int a,int b){
        int result = a*b;
        System.out.println(result);
    }
    void multiply(int a,int b,int c){
        int result  = a*b*c;
        System.out.println(result);
    }
    void multiply(double a,int b){
        double result = a*b;
        System.out.println(result);
    }
    void multiply(int a,double b,int c){
        double result = a*b*c;
        System.out.println(result);
    }
}
public class overloadarthimetic {
    public static void main(String[] args) {
        arthimetic obj = new arthimetic();
        obj.multiply(5, 6);
        obj.multiply(2,5, 7);
        obj.multiply(2.3, 6);
        obj.multiply(9,2.3,7 );
    }
}
