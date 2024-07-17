public class employee {
    int eid,ephone,esalary;
    String name;
   public void info(String n,int id,int phone,int salary){
    name  = n;
    eid = id;
    ephone = phone;esalary = salary;  
   }
   public void display(){
    System.out.println("emp name:" + name);
    System.out.println("emp id:" + eid);
    System.out.println("emp phone.no:" + ephone);
    System.out.println("emp salary:" + esalary);
   }
   public static void main(String[] args){
    employee e1 = new employee();
    employee e2 = new employee();
    e1.info("sam",12,1234567,10000);
    e2.info("stephen",20,12345678,20000);
    e1.display();
    e2.display();
   }
}
