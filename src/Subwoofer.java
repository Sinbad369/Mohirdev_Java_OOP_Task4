public class Subwoofer extends Sounds{
    private String subwoofer;
    private double wooferSize;
    private boolean bassBoost;

    public Subwoofer(String brand, String modelNumber, double powerConsumption, double price, int warrantyPeriod,
                     String frequencyResponse, double outputPower, double impedance, double sensitivity,
                     String subwoofer, double wooferSize, boolean bassBoost) {
        super(brand, modelNumber, powerConsumption, price, warrantyPeriod, frequencyResponse, outputPower, impedance,
                sensitivity);
        this.subwoofer = subwoofer;
        this.wooferSize = wooferSize;
        this.bassBoost = bassBoost;
    }

    public void printSubwooferDetails(){
        printSoundsDetails();
        System.out.println("Subwoofer: " + subwoofer);
        System.out.println("Woofer Size: " + wooferSize);
        System.out.println("Bass Boost: " + bassBoost);
    }
}
