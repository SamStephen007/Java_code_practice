public class multilevelinheritance {
    public static void main(String[] args) {
        multi2 obj = new multi2();
        obj.sprc();
        obj.subc();
        obj.subc1();
    }
}
class multi{
    public void sprc(){
        System.out.println("WAKE UP TO REALITY");
    }
}
class multi1 extends multi{
    public void subc(){
        System.out.println("NOTHING EVER GOES PLANNED IN THIS ACCURSED WORLD");
    }
}
class multi2 extends multi1{
    public void subc1(){
        System.out.println("the longer you live the more you realise");
    }
}
