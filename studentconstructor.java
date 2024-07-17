class student{
    int sage;
    String sname;
    char sgrade;
    public void student(String name,int age,char grade){
        sage = age;
        sname = name;
        sgrade = grade;
    }
    public void display(){
        System.out.println("Student name :"+sname);
        System.out.println("Student age :"+sage);
        System.out.println("Student grade:"+sgrade);
    }
    
}
public class studentconstructor{
    
}