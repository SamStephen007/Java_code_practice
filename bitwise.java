import java.util.*;
public class bitwise {
    public static void main(String[] args){
        /*
         * AND = &
         * OR = |
         * X-OR = ^
         * MISCELLENOUS = ~
         */
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~b);
    }
}
