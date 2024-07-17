import java.util.Scanner;
public class employes {
    public static void main(String[] args) {
        
    employee e1 = new employee();
    employee e2 = new employee();
    e1.add_info("ronaldo",7,20000000,"striker");
    e2.add_info("messi",10,2000007,"winger");
    e1.print();
    e2.print();
}
}
class employee{
    String name,dep;
    int id,salary;
   void add_info(String name,int id,int salary,String dep){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.dep = dep;
    }
    void print(){
        System.out.println("name:"+name);
        System.out.println("Id:"+id);
        System.out.println("Salary:"+salary);
        System.out.println("Department::"+dep);
    }
}
