public class singleinheritance1 {
    public static void main(String[] args) {
        /*child obj = new child();
        System.out.println(obj.sum);
        System.out.println(obj.size);
        father s = new father();
        s.print();*/
        uncle u = new uncle();
        father f = new father();
        System.out.println(f.gender);
         u.pr();
        u.print();
    }    
}
class father extends grandfather{
    int data  = 7;
    int size = 10;
    char gender =  'm';
}
class child extends father{
    int sum = data + 8;
    int total = 15+size;
}
class grandfather{
    void print(){
        System.out.println("I AM GRANDFATHER");
    }

}
class uncle extends grandfather{
    void pr(){
        System.out.println("I AM UNCLE");
    }
}