public class wrapperclass {
    public static void main(String[] args) {
        Integer intwrapper = Integer.valueOf(45);
        Double douwrapper = Double .valueOf(56.8);
        Boolean boolwrapper = Boolean.valueOf(true);
        
        int intprimitive = intwrapper.intValue();
        double doubprimitive = douwrapper.doubleValue();
        boolean boolprimitive = boolwrapper.booleanValue();
        System.out.println("Wrapper class:");
        System.out.println(intprimitive);
        System.out.println(doubprimitive);
        System.out.println(boolprimitive);
 
        Integer age = 35;
        int agepri = age;
        System.out.println("Auto boxing and unboxing:");
        System.out.println("age wrapper:"+age);
        System.out.println("age primitive:"+agepri);
    }
}
