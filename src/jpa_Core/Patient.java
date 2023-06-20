package jpa_Core;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author bayra
 */
@Entity
@DiscriminatorValue("Patient")
public class Patient extends Person {

    @OneToMany(mappedBy = "patientId")
    private List<Analysisresult> analysisresultList;

    public Patient() {

    }

    public Patient(String name, String surname, String username, String password) {
        super(name, surname, username, password);
    }

    public List<Analysisresult> getAnalysisresultList() {
        return analysisresultList;
    }

    public void setAnalysisresultList(List<Analysisresult> analysisresultList) {
        this.analysisresultList = analysisresultList;
    }
    @ManyToMany(mappedBy = "patients", fetch = FetchType.EAGER)
    private List<Doctor> doctors;

   
    public List<Doctor> getDoctors() {
        return doctors;
    }

  
    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

}
