public class overriding {
    public static void main(String[] args) {
      
      System.out.println(obj.num);
      System.out.println(obj.weight);
      System.out.println(obj.height);  
    }
}
class dog
{
    void cases(){
    int num = 17;
    int weight = 20;
    }
}
class puppy extends dog
{
    void cases()
    {
    int num = 16;
    int height = 100;
    }
}
