public class Sounds extends Electronics{
    private String frequencyResponse;
    private double outputPower;
    private double impedance;
    private double sensitivity;

    public Sounds(String brand, String modelNumber, double powerConsumption, double price, int warrantyPeriod,
                  String frequencyResponse, double outputPower, double impedance, double sensitivity) {
        super(brand, modelNumber, powerConsumption, price, warrantyPeriod);
        this.frequencyResponse = frequencyResponse;
        this.outputPower = outputPower;
        this.impedance = impedance;
        this.sensitivity = sensitivity;
    }

    public void printSoundsDetails(){
        printElectronicsDetails();
        System.out.println("Frequency Response: " + frequencyResponse);
        System.out.println("Output Power: " + outputPower);
        System.out.println("Impedence: " + impedance);
        System.out.println("Sensitivity: " + sensitivity);
    }
}
