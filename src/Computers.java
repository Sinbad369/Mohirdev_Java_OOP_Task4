public class Computers extends Electronics{
    private String cpu;
    private int ram;
    private String storage;
    private String OS;
    private String graphicsCard;

    public Computers(String brand, String modelNumber, double powerConsumption, double price, int warrantyPeriod,
                     String cpu, int ram, String storage, String OS, String graphicsCard) {
        super(brand, modelNumber, powerConsumption, price, warrantyPeriod);
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.OS = OS;
        this.graphicsCard = graphicsCard;
    }

    public void printComputerDetails(){
        printElectronicsDetails();
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("CPU: " + cpu);
        System.out.println("OS: " + OS);
        System.out.println("Graphics Card: " + graphicsCard);
    }
}
