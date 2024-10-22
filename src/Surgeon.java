public class Surgeon extends Doctor{
    // Operating Room Skills
    // Surgical Instruments Knowledge
    // Emergency Response
    // Contact Information

    private String operatingSkills;
    private String surgicalInstrumentKnowledge;
    private String emergencyResponse;
    private String contactInformation;

    // Constructor + call parent
    public Surgeon(String name, String specialization, int id, String education, String workingHours,
                   double yearsOfExperience, double successRate, double professionalRating, String operatingSkills,
                   String surgicalInstrumentKnowledge, String emergencyResponse, String contactInformation) {
        super(name, specialization, id, education, workingHours, yearsOfExperience, successRate, professionalRating);
        this.operatingSkills = operatingSkills;
        this.surgicalInstrumentKnowledge = surgicalInstrumentKnowledge;
        this.emergencyResponse = emergencyResponse;
        this.contactInformation = contactInformation;
    }

    // Print all details
    public void printSurgeonDetails(){
        printDoctorDetails();
        System.out.println("Operating Room Skills: " + operatingSkills);
        System.out.println("Surgical Instrument Knowledge: " + surgicalInstrumentKnowledge);
        System.out.println("Emergency Respons: " + emergencyResponse);
        System.out.println("Contact Information: " + contactInformation);
    }
}
