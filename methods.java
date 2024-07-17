public class methods {
    int a,b;
    public void read(int x,int y){
        a = x;
        b = y;
    }
    public int add(){
        return a+b;
    }
    public int sub(){
        return a-b;
    }
    public int mult(){
        return a*b;
    }
    public int div(){
        return a/b;
    }
    public static void main(String[] args){
        methods m = new methods();
        m.read(20,10);
        System.err.println(m.add());
        System.err.println(m.sub());
        System.err.println(m.mult());
        System.err.println(m.div());
    }
}
