class multithread extends Thread{
    public void run(){
        System.out.println("Inside run method");
    }
}
public class getandset {
    public static void main(String[] args) {
        multithread t1 = new multithread();
        multithread t2 = new multithread();
        multithread t3 = new multithread();
       System.out.println("t1 priority"+t1.getPriority());
       System.out.println("t2 priority"+t2.getPriority());
       System.out.println("t3.priority"+t2.getPriority());
       t1.setPriority(5);
       t2.setPriority(7);
       t3.setPriority(2);
        System.out.println("t1 priority"+t1.getPriority());
       System.out.println("t2 priority"+t2.getPriority());
       System.out.println("t3.priority"+t3.getPriority());
        System.out.println("currently executing Thread:"+Thread.currentThread().getName());
        System.out.println("main thread:"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
    }
}
