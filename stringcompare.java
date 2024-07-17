
public class stringcompare {
    public static void main(String[] args) {
        
    String str1 = new String("hashirama");
    String str2 = new String("madara");
    String str3 = new String("naruto");
    String str4 = new String("sasuke");
    String str5 = new String("madara");
    System.out.println("Result:"+str1.equals(str2));
    System.out.println("Result:"+str3.equals(str4));
    System.out.println("Result:"+str3.equals(str5));
    System.out.println("Result:"+str2.equals(str5));
    System.out.println("Result:"+str3.equals(str3));
}
}