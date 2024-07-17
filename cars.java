import java.time.Year;

class Car {
    private String make;
    private String model;
    private int year;

    // Constructor initializing make and model to "unknown" and year to current year
    public Car() {
        this.make = "unknown";
        this.model = "unknown";
        this.year = Year.now().getValue();
    }

    // Getters and setters (optional)
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
public class cars{
    public class Main {
        public static void main(String[] args) {
            // Creating an instance of Car
            Car car1 = new Car();
    
            // Accessing attributes of the instance
            System.out.println("Make: " + car1.getMake());   // Output: unknown
            System.out.println("Model: " + car1.getModel()); // Output: unknown
            System.out.println("Year: " + car1.getYear());   // Output: current year
        }
    }
    
}
