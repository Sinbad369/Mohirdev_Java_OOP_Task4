public class Laptop extends Computers{
    private double batteryLife;
    private double weight;
    private double screenSize;

    public Laptop(String brand, String modelNumber, double powerConsumption, double price, int warrantyPeriod,
                  String cpu, int ram, String storage, String OS, String graphicsCard, double batteryLife, double weight,
                  double screenSize) {
        super(brand, modelNumber, powerConsumption, price, warrantyPeriod, cpu, ram, storage, OS, graphicsCard);
        this.batteryLife = batteryLife;
        this.weight = weight;
        this.screenSize = screenSize;
    }

    public void printLaptopDetails(){
        printComputerDetails();
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Weight: " + weight);
        System.out.println("Screen Size: " + screenSize);
    }
}
