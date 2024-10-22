public class Doctor {
    // Clinic
    public void clinic(){
        System.out.println("L`Hopital de Rubin Baldoro");
    }
    // Name
    // Surgical Specialization
    // ID
    // Education
    // Working Hours
    // Years of Experience
    // Success Rate
    // Professional Rating
    private String name;
    private String specialization;
    private int id;
    private String education;
    private String workingHours;
    private double yearsOfExperience;
    private double successRate;
    private double professionalRating;

    public Doctor(String name, String specialization, int id, String education, String workingHours,
                  double yearsOfExperience, double successRate, double professionalRating) {
        this.name = name;
        this.specialization = specialization;
        this.id = id;
        this.education = education;
        this.workingHours = workingHours;
        this.yearsOfExperience = yearsOfExperience;
        this.successRate = successRate;
        this.professionalRating = professionalRating;
    }

    public void printDoctorDetails(){
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("ID: " + id);
        System.out.println("Highest Educaiton Achieved: " + education);
        System.out.println("Years Of Experience: " + yearsOfExperience);
        System.out.println("Success Rate: " + successRate);
        System.out.println("Professional Rating: " + professionalRating);
    }

}
