interface drawable{
    void draw();
}
class circle implements drawable{
    public void draw(){
        System.out.println("Drawing circle");
    }
}
class rectangle implements drawable{
    public void draw(){
        System.out.println("Drawing rectangle");
    }
}
class triangle implements drawable{
    public void draw(){
        System.out.println("Drawing triangle");
    }
}
class draw{
    public static void main(String[] args) {
        circle obj = new circle();
        triangle obj1 = new triangle();
        rectangle obj2 = new rectangle();
        obj.draw();
        obj1.draw();
        obj2.draw();
    }
}