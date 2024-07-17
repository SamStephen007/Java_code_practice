/*public class methodoverloadingadd {
    public static void main(String[] args) {
        calculator obj = new calculator();
        System.out.println(obj.sum(5, 7));
        System.out.println(obj.sum(4, 7, 9));
    }
}
class calculator{
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
}*/
//EXAMPLE 2
public class methodoverloadingadd{
    public static void main(String[] args) {
        methodoverloadingadd obj = new methodoverloadingadd();
        obj.display(7);
        obj.display(1222);
        obj.display("Stephen");
    }
    public void display(int a){
        System.out.println(a);
    }
    public void display(String a){
        System.out.println(a);
    }
    public void display(double a){
        System.out.println(a);
    }
}