public class singleinheritance {
    public static void main(String[] args) {
        subsingle obj = new subsingle();
        obj.met();
        obj.metho();
    }
}
class single{
    public void met(){
        System.out.println("I AM SINGLE");
    }
}
class subsingle  extends single{
    public void metho(){
        System.out.println("I AM ALSO SINGLE");
    }
}
