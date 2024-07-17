import java.util.*;
public class plus {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int num  = obj.nextInt();
        for(int i=0;i<num;i++){
            if(i==num/2){
                for(int j=0;j<num;j++){
                System.out.print("0");
            }
            System.out.println();
        }
            else{
                for(int j=0;j<num;j++){
                    if(j==num/2){
                        System.out.print("0");
                    }
                    System.out.print("1");
                }

                System.out.println();
            }
        }
    }
}
