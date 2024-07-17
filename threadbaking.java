class bake extends Thread{
    public void run(){
        try{
        System.out.println("Thread" + bake.currentThread().getId());
        }
        catch(Exception e){
            System.out.println("Error catched");
        }
}
}
class threadbaking{
    public static void main(String[] args) {
        int n = 8;
        for(int i=0;i<n;i++)
        {
            bake obj = new bake();
            obj.start();
        }
    }
}