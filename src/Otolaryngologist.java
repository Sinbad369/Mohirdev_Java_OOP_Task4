public class Otolaryngologist extends Doctor{
    // Specialization within ENT
    // Allergy Testing and Treatment
    // Voice and Speech Disorders Expertise
    // Hearing and Balance Testing
    // Contact Information

    private String specializationENT;
    private String allergyTestingAndTreatment;
    private String voiceAndSpeachDisordersExpertise;
    private String hearingAndBalanceTesting;
    private String contactInformation;

    // Constructor + call parent
    public Otolaryngologist(String name, String specialization, int id, String education, String workingHours,
                            double yearsOfExperience, double successRate, double professionalRating,
                            String specializationENT, String allergyTestingAndTreatment,
                            String voiceAndSpeachDisordersExpertise, String hearingAndBalanceTesting,
                            String contactInformation) {
        super(name, specialization, id, education, workingHours, yearsOfExperience, successRate, professionalRating);
        this.specializationENT = specializationENT;
        this.allergyTestingAndTreatment = allergyTestingAndTreatment;
        this.voiceAndSpeachDisordersExpertise = voiceAndSpeachDisordersExpertise;
        this.hearingAndBalanceTesting = hearingAndBalanceTesting;
        this.contactInformation = contactInformation;
    }

    // Print all related information
    public void printOtolaryngologistDetails(){
        printDoctorDetails();
        System.out.println("Specialization within ENT: " + specializationENT);
        System.out.println("Allergy Testing and Treatment: " + allergyTestingAndTreatment);
        System.out.println("Voice and Speech Disorders Expertise: " + voiceAndSpeachDisordersExpertise);
        System.out.println("Hearing and Balance Testing: " + hearingAndBalanceTesting);
        System.out.println("Contact Information: " + contactInformation);
    }
}
