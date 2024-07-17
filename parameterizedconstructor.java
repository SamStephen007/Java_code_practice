public class parameterizedconstructor {
    public static void main(String[] args) {
    person obj = new person("stephen",18);
}
}
class person{
    String name;
    int age;
    person(String name,int age){
        /*this.name = name;
        this.age = age;*/
        System.out.println(name);
        System.out.println(age);
    }
}