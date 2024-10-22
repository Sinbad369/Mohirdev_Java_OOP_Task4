public class PC extends Computers{
    private String formFactor;
    private String coolingSystem;
    private boolean expandability;

    public PC(String brand, String modelNumber, double powerConsumption, double price, int warrantyPeriod, String cpu,
              int ram, String storage, String OS, String graphicsCard, String formFactor, String coolingSystem,
              boolean expandability) {
        super(brand, modelNumber, powerConsumption, price, warrantyPeriod, cpu, ram, storage, OS, graphicsCard);
        this.formFactor = formFactor;
        this.coolingSystem = coolingSystem;
        this.expandability = expandability;
    }

    public void printPC(){
        printComputerDetails();
        System.out.println("Form Factor: " + formFactor);
        System.out.println("Cooling System: " + coolingSystem);
        System.out.println("Expandability: " + expandability);
    }
}
