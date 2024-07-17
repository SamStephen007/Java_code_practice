import java.util.*;
public class grades {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        char grade = obj.next().charAt(0);
        switch (grade){
            case 'O':
            System.out.println("Excellent");
            break;
            case 'A':
            System.out.println("Very Good");
            break;
            case 'B':
            System.out.println("Good");
            break;
            case 'c':
            System.out.println("Average");
            break;
            default:
            System.out.println("Need Improvement");
        }
    }
}
