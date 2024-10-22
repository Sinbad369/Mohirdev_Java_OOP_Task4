public class Loudspeaker extends Sounds{
    private int numberOfDrivers;
    private String cabinetMaterial;
    private String portType;

    public Loudspeaker(String brand, String modelNumber, double powerConsumption, double price, int warrantyPeriod,
                       String frequencyResponse, double outputPower, double impedance, double sensitivity,
                       int numberOfDrivers, String cabinetMaterial, String portType) {
        super(brand, modelNumber, powerConsumption, price, warrantyPeriod, frequencyResponse, outputPower,
                impedance, sensitivity);
        this.numberOfDrivers = numberOfDrivers;
        this.cabinetMaterial = cabinetMaterial;
        this.portType = portType;
    }

    public void printLoudSpeakerDetails(){
        printSoundsDetails();
        System.out.println("Number Of Drivers: " + numberOfDrivers);
        System.out.println("Cabinet Material: " + cabinetMaterial);
        System.out.println("Port Type: " + portType);
    }
}
