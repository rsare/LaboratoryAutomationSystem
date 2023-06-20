/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_Core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author bayra
 */
public class Test {
    
    public static void main(String[] args) {
        //addPerson();
        //addAnalysis();
        //addAnalysisResult();
        queryAnalysisResult();
        //addPatientToDoctor();
       // showMedicalAnalysis();
    }
    
    public static void addPerson() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaboratoryAutomationSystem");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Doctor doctor = new Doctor("Emirhan", "Soylu", "emirhan", "123");
        LabAttendant labAttendant = new LabAttendant("Sare", "Bayram", "sare", "123");
        Patient patient = new Patient("Meryem", "Kılıç", "meryemki", "123");
        
        em.persist(patient);
        em.persist(doctor);
        em.persist(labAttendant);
        
        em.getTransaction().commit();
    }
    
    public static void addAnalysis() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaboratoryAutomationSystem");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        UrineAnalysis urineAnalysis = new UrineAnalysis(1, 2, 5, 8, 6, 3, 3, 5, 5, 7);
        BloodAnalysis bloodAnalysis = new BloodAnalysis(1, 2, 5, 7, 2, 10, 3, 5, 5, 7);
        
        em.persist(urineAnalysis);
        em.persist(bloodAnalysis);
        
        em.getTransaction().commit();
    }
    
    public static void addAnalysisResult() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaboratoryAutomationSystem");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
//        Date date = null;
//        try {
//            date = new SimpleDateFormat("yyyy-MM-dd").parse("2023-05-21");
//        } catch (ParseException ex) {
//            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//        }
        Analysis analysisId = em.find(Analysis.class, 251);
        Patient patientId = em.find(Patient.class, 1);
        Doctor doctorId = em.find(Doctor.class, 2);
        
        Analysisresult analysisresult = new Analysisresult(null, analysisId, patientId, doctorId);

//        em.persist(date);
        em.persist(analysisId);
        em.persist(patientId);
        em.persist(doctorId);
        em.persist(analysisresult);
        
        em.getTransaction().commit();
        
    }
    
    public static void queryAnalysisResult() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaboratoryAutomationSystem");
        EntityManager em = emf.createEntityManager();
        
        Analysisresult analysisresult = em.createNamedQuery("Analysisresult.findAll", Analysisresult.class).getResultList().get(0);
        System.out.println(analysisresult.toString());
        
        System.out.println(analysisresult.getDoctorId().getName());
        Doctor doctor = em.createNamedQuery("Person.findByName", Doctor.class).setParameter("name", "Emirhan").getSingleResult();
        System.out.println(doctor.getAnalysisresultList1().get(0));
        Patient patient = em.find(Patient.class, 1);
//        for (Analysisresult analysisresult1 : patient.getAnalysisresultList()) {
//            System.out.println(analysisresult1.toString());
//            
//        }
    }
    
    public static void addPatientToDoctor() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaboratoryAutomationSystem");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        Patient patient = em.find(Patient.class, 1);
        Doctor doctor = em.find(Doctor.class, 2);
        
        patient.getDoctors().add(doctor);
        //doctor.getPatients().add(patient);
        em.persist(patient);
        em.persist(doctor);
        
        em.getTransaction().commit();
    }
    
    
    public static void showMedicalAnalysis(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaboratoryAutomationSystem");
        EntityManager em = emf.createEntityManager();
        
        Patient patient = em.find(Patient.class, 1);
        System.out.println(patient.getAnalysisresultList().get(0));
        
        
    }
    
    
    
}
