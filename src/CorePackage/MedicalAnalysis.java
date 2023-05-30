package CorePackage;

import javax.swing.text.Highlighter;

/**
 *
 * @author sare
 */
public class MedicalAnalysis {
    
    
    //enum
    public final static String[] analysisType = {"Blood Analysis", "Urine Test"};

    public final static String[] bloodExaminations = {"WBC", "NEU", "LYM", "MONO", "EOS",
        "BASO", "RBC", "HGB", "HCT", "MCV"};

    public final static String[] urineExaminations = {"Glukoz", "Protein", "Bilirubin",
        "Urobilinojen", "pH", "Hemoglobin", "Keton", "Nitrit", "Lokosit Esteraz", "Dansite"};

    //For Analysis Result
    public final static String low = "Low";
    public final static String normal = "Normal";
    public final static String high = "High";
    
   /* public enum EResultType{
        Low,
        Normal,
        High,
  
    }*/

    //For status
    public final static String inProcess = "In Process";
    public final static String testsConcluded = "Tests Concluded";
    
    //private EResultType resulty= EResultType.;
    private String[] result = new String[10];
    private String status;
    
    private Patient patient;
    private Doctor doctor;
    private String medicalAnalysisType;
    private int medicalAnalysisId = 0;
    static int newID = 100;

    public MedicalAnalysis(Patient patient, Doctor doctor, String medicalAnalysisType) {
        this.patient = patient;
        this.doctor = doctor;
        this.medicalAnalysisType = medicalAnalysisType;
        medicalAnalysisId = newID++;
        for (String result : result) {
            result = "";
            
        }

    }
    
    //Beginning Of Encapsulations

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   
    public Doctor getDoctor() {
        return doctor;
    }

    
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

  
    public Patient getPatient() {
        return patient;
    }

   
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    
    public String[] getResult() {
        return result;
    }

   
    public void setResult(String[] result) {
        this.result = result;
    }

  
    public int getMedicalAnalysisId() {
        return medicalAnalysisId;
    }

   
    public String getMedicalAnalysisType() {
        return medicalAnalysisType;
    }

   
    public void setMedicalAnalysisType(String medicalAnalysisType) {
        this.medicalAnalysisType = medicalAnalysisType;
    }

    @Override
    public String toString() {
        return medicalAnalysisId + "-" + medicalAnalysisType;
    }

    

}
