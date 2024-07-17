interface libitem{
    String gettitle();
    void settitle(String title);
    void display();
}
class books implements libitem{
    String title;
    public String gettitle(){
        return title;
    }
    public void settitle(String title){
        this.title = title;
    }
    public void display(){
        System.out.println("Book " + title);
    }
}
class cd implements libitem{
    String title;
    public String gettitle(){
        return title;
    }
    public void settitle(String title){
        this.title = title;
    }
    public void display(){
        System.out.println("CD:"+title);
    }
}
class dvd implements libitem{
    String title;
    public String gettitle(){
        return title;
    }
    public void settitle(String title){
        this.title = title;
    }
    public void display(){
        System.out.println("DVD:"+title);
    }
}
class bookcddvd{
    public static void main(String[] args) {
        books obj = new books();
        cd obj1 = new cd();
        dvd obj2 = new dvd();
        obj.settitle("broken hero");
        obj1.settitle("kattu malli");
        obj2.settitle("dragon ball");
        obj.display();
        obj1.display();
        obj2.display();
    }
}