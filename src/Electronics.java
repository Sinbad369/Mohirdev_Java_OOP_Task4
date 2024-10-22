public class Electronics {
    private String brand;
    private String modelNumber;
    private double powerConsumption;
    private double price;
    private int warrantyPeriod;

    public Electronics(String brand, String modelNumber, double powerConsumption, double price, int warrantyPeriod) {
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.powerConsumption = powerConsumption;
        this.price = price;
        this.warrantyPeriod = warrantyPeriod;
    }

    public void printElectronicsDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Power Consumption: " + powerConsumption);
        System.out.println("Price: " + price);
        System.out.println("Warranty Period: " + warrantyPeriod);
    }
}
