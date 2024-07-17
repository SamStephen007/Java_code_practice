import java.util.*;
public class countfactor {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int count = 0;
        int n = obj.nextInt();
        for(int i=1;i<n+1;i++){
            if(n%i == 0){
                count++;
            }
        }
        System.out.println("The factor of the given number is "+count);
    }
}
