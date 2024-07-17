public class vehiclemethod {
    public static void main(String[] args) {
        car obj = new car();
        motorbike obj1 = new motorbike();
        System.out.println("CARS:");
        obj.startengine();
        obj.stopengine();
        System.out.println("MOTOR CYCLE:");
        obj1.startengine();
        obj1.stopengine();
    }
}
class vehicle{
    void startengine(){
        System.out.println("Generic procedure for starting a engine");
    }
    void stopengine(){
        System.out.println("Generic procedure for stop the vehicle");
    }
}
class car extends vehicle{
    void startengine(){
        System.out.println("Start the car engine:push the start button");
    }
    void stopengine(){
        System.out.println("Turn off the car using stop button");
    }
}
class motorbike extends vehicle{
     void startengine(){
        System.out.println("kick start or use ignition key");
    }
    void stopengine(){
        System.out.println("Turn off the key or use kill switch");
    }
}

