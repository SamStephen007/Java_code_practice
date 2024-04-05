import java.util.*;
abstract class shape{
    abstract void printarea();
}
class rectangle extends shape{
    int length;
    int breath;
     rectangle(int length,int breath){
        this.length = length;
        this.breath= breath;
    }
    void printarea(){
        int area = length*breath;
        System.out.println(area);
    }
}
class circle extends shape{
    int radius;
    circle(int radius){
        this.radius = radius;
    }
    void printarea(){
        double area = 3.14 *(radius*radius);
        System.out.println(area);
    }
}
class triangle extends shape{
    private int height,base;
     triangle(int height,int base){
        this.height = height;
        this.base = base;
    }
    void printarea(){
        double area = 0.5*height*base;
        System.out.println(area);
    }
}
public class abstractclass {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length = obj.nextInt();
        System.out.println("Enter the breath of rectangle:");
        int breath = obj.nextInt();
        System.out.println("Area of the rectangle is\n");
        rectangle rect = new rectangle(length,breath);   
        rect.printarea();

        System.out.println("Enter the height of the triange:");
        int height = obj.nextInt();
        System.out.println("Enter the base of triangle:");
        int base = obj.nextInt();
        System.out.println("Area of the triangle is\n");
        triangle tri = new triangle(height,base);
        tri.printarea();

        System.out.println("Enter the radius of the circle:");
        int radius = obj.nextInt();
        System.out.println("Area of the circle:\n");
        circle cir = new circle(radius);
        cir.printarea();
    }
}

