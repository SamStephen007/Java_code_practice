import java.util.*;
public class time {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int HH,MM,SS;
        HH = obj.nextInt();
        MM = obj.nextInt();
        SS = obj.nextInt();
        if(HH>0 && HH<=12){
            if(MM>0  && MM<=59){
                if(SS>0 && SS<=59){
                    System.out.println("VALID TIME");
                }else{
                System.out.println("INVALID TIME");
                }
            }else{
                System.out.println("INVALID TIME");
            }
        }
        else{
            System.out.println("INVALID TIME");
        }
    }
}
