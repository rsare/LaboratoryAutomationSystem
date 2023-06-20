package jpa_Core;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author sare
 */
@Entity
@DiscriminatorValue("Doctor")
public class Doctor extends Person {

    @JoinTable(
            name = "Doctor_Patient",
            joinColumns = {
                @JoinColumn(name = "doctor_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "patient_id")}
    )
   // @ManyToMany(mappedBy = "doctors")
    private List<Patient> patients;

    @OneToMany(mappedBy = "doctorId")
    private List<Analysisresult> analysisresultList1;

    public Doctor() {
    }

    public Doctor(String name, String surname, String username, String password) {
        super(name, surname, username, password);
    }

    public List<Analysisresult> getAnalysisresultList1() {
        return analysisresultList1;
    }

    public void setAnalysisresultList1(List<Analysisresult> analysisresultList1) {
        this.analysisresultList1 = analysisresultList1;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

}
