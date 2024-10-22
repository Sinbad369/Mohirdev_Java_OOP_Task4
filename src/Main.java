public class Main {
    public static void main(String[] args) {
        System.out.println("Information about doctors of L'Hopital De Rubin Baldoro as per your request");
        Surgeon surgeon = new Surgeon("Dr. Steve Harakah",
                "Cardiothoracic Surgery",
                19781229,
                "Ph.D., Cardiothoracic Surgery",
                "9 AM - 5 PM",
                14.5,
                96,
                4.9,
                "Expert in open heart surgery",
                "Familiar with all modern surgical tools",
                "Handles emergency with precision",
                "zero zero zero shliq bliq, lol, there should have been a phone number");

        Otolaryngologist otolaryngologist = new Otolaryngologist(
                "Dr. Serikpay Sho'lpankhoja",
                "ENT Surgery",
                19941122,
                "Ph.D., Otolaryngology",
                "1 PM - 6 PM",
                10,
                94,
                4.8,
                "Rhinology (Nose Surgery)",
                "Certified in allergy testing",
                "Expert in vocal cord disorders",
                "Advanced hearing and balance tests",
                "Yo prst wa wa ti mis ko,lol, there should have been a phone number");

        surgeon.printSurgeonDetails();
        System.out.println("################################################################################");
        otolaryngologist.printOtolaryngologistDetails();


        System.out.println("\n\n\nInformation about Electronics:");

        // Electronics (parent class)
        Electronics myElectronics = new Electronics("BrandA",
                "ModelX",
                300,
                1200.00,
                2);
        myElectronics.printElectronicsDetails();
        System.out.println("################################################################################");

        // Computers (child class)
        Computers myComputer = new Computers("BrandB",
                "ModelY",
                250,
                1500.00,
                3,
                "Intel i9",
                32,
                "2TB SSD",
                "Windows 11",
                "NVIDIA RTX 3080");
        myComputer.printComputerDetails();
        System.out.println("################################################################################");

        // Sounds (child class)
        Sounds mySoundSystem = new Sounds("BrandC",
                "ModelZ",
                150,
                500.00,
                2,
                "20Hz - 20kHz",
                100,
                8,
                90);
        mySoundSystem.printSoundsDetails();
        System.out.println("################################################################################");

        // PC (grandchild of Computers)
        PC myPC = new PC("BrandD",
                "ModelA",
                400,
                1800.00,
                2,
                "AMD Ryzen 9",
                32,
                "1TB SSD",
                "Windows 11",
                "NVIDIA RTX 3090",
                "Tower",
                "Liquid",
                true);
        myPC.printPC();
        System.out.println("################################################################################");

        // Laptop (grandchild of Computers)
        Laptop myLaptop = new Laptop("BrandE",
                "ModelB",
                65,
                1200.00,
                1,
                "Intel i7",
                16,
                "512GB SSD",
                "Windows 10",
                "Intel Iris Xe",
                10.5,
                1.8,
                15.6);
        myLaptop.printLaptopDetails();
        System.out.println("################################################################################");

        // Subwoofer (grandchild of Sounds)
        Subwoofer mySubwoofer = new Subwoofer("BrandF",
                "ModelC",
                200,
                800.00,
                1,
                "25Hz - 200Hz",
                150,
                4,
                95,
                "Active",
                12.0,
                true);
        mySubwoofer.printSubwooferDetails();
        System.out.println("################################################################################");

        // Loudspeaker (grandchild of Sounds)
        Loudspeaker myLoudspeaker = new Loudspeaker("BrandG",
                "ModelD",
                100,
                400.00,
                2,
                "20Hz - 20kHz",
                75,
                8,
                92,
                2,
                "Wood",
                "Ported");
        myLoudspeaker.printLoudSpeakerDetails();
        System.out.println("################################################################################");
    }

}