import java.util.*;
public class switches{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        char grade = obj.next().charAt(0);
        switch(grade){
            case 'A':
            System.out.println("Excellent");
            break;
            case 'B':
            System.out.println("very good");
            break;
            case 'C':
            System.out.println("Average");
            break;
            case 'D':
            System.out.println("satisfied");
            break;
            case 'F':
            System.out.println("need to improve");
            break;
            default:
            System.out.println("Invalid character");
        }
    }
}
