import java.util.*;
public class conditional {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int cgpa = obj.nextInt();
        if(cgpa>7 && cgpa<=10){
            System.out.println("Grade A");
        }
        else if(cgpa>6 && cgpa<=7){
            System.out.println("Grade B");
        }
        else if(cgpa>=5 && cgpa<=6){
            System.out.println("Grade C");
        }
        else if(cgpa>=0&&cgpa<5){
            System.out.println("grade D");
        }
        else{
            System.out.println("INVALID CHARACTER");
        }
    }
}
