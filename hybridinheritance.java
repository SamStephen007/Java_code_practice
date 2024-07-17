public class hybridinheritance {
    public static void main(String[] args) {
        grandson obj1 = new grandson();
        obj1.print();
        daughter obj = new daughter();
        System.out.println(obj.data);
        obj.pr();
        son i = new son();
        System.out.println(i.info);
    }
}
class daughter extends father{
    int data = 9;
}
class son extends father{
    int info = 7;
}
class grandson extends daughter{
    void print(){
    System.out.println("I AM grandson");
}
}
class father{
    void pr(){
    System.out.println("I AM FATHER");
}
}