package CorePackage;

import java.util.ArrayList;

/**
 *
 * @author sare
 */
public class Patient extends Person{

    private ArrayList<MedicalAnalysis> myMedicalAnalysis = new ArrayList<>();
    
    private Doctor doctor;

    

    public Patient(String name, String surname, String password, String username, String phone) {
        super(name, surname, password, username, phone);

        //super.setId(newid++);
    }

    

    
    public ArrayList<MedicalAnalysis> getMyMedicalAnalysis() {
        return myMedicalAnalysis;
    }

   
    public Doctor getDoctor() {
        return doctor;
    }

  
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

  

}
