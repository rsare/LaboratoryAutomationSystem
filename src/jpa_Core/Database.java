package jpa_Core;

import CorePackage.MedicalAnalysis;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author sare
 */
public class Database {

//    static EntityManagerFactory emf;
//    static EntityManager em;

//    public static void initEntitiyManager() {
//
//        if (emf == null || em == null) {
//            emf = Persistence.createEntityManagerFactory("LaboratoryAutomationSystem");
//            em = emf.createEntityManager();
//        }
//
//    }
    
    
    public static Person loginVerification(String username, String password) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaboratoryAutomationSystem");
        EntityManager em = emf.createEntityManager();
        try {
            Person person = em.createQuery("SELECT p FROM Person p WHERE"
                    + " p.username = :username AND p.password = :password",
                    Person.class).setParameter("username", username).setParameter("password", password).getSingleResult();
            em.close();
            emf.close();
            return person;
        } catch (NoResultException e) {
            em.close();
            emf.close();
            return null;
        }

    }

    public static boolean checkUsername(String username) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaboratoryAutomationSystem");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT COUNT(p) FROM Person p WHERE p.username = :username");
        query.setParameter("username", username);
        Long count = (Long) query.getSingleResult();
        em.close();
        emf.close();
        return count != 0;
    }

    public static void saveUser(Person person) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaboratoryAutomationSystem");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        em.close();
        emf.close();
        Database.getPeople().add(person);

    }

    public static Person getUserByID(int ID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaboratoryAutomationSystem");
        EntityManager em = emf.createEntityManager();
        em.close();
        emf.close();
        return em.find(Person.class, ID);

    }

    public static void addAnalysis(Analysis analysis, Doctor doctor, Patient patient) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaboratoryAutomationSystem");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Analysisresult analysisresult = new Analysisresult();
        analysisresult.setDoctorId(doctor);
        analysisresult.setPatientId(patient);
        analysisresult.setAnalysisId(analysis);
        //analysisresult.setDate(date);
        doctor.getAnalysisresultList1().add(analysisresult);
        patient.getAnalysisresultList().add(analysisresult);
        em.persist(analysis);
        em.persist(analysisresult);
        em.persist(doctor);
        em.persist(patient);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    public static List<Person> getPeople() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaboratoryAutomationSystem");
        EntityManager em = emf.createEntityManager();
        List<Person> people = em.createNamedQuery("Person.findAll", Person.class).getResultList();
        em.close();
        emf.close();
        return people;

    }

    public static Analysisresult findAnalysisResultByID(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaboratoryAutomationSystem");
        EntityManager em = emf.createEntityManager();
        Analysisresult analysisresult = em.find(Analysisresult.class, id);
        em.close();
        emf.close();
        return analysisresult;

    }
    
    public static List<Analysisresult> getAnalysisResultForPatient(int id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaboratoryAutomationSystem");
        EntityManager em = emf.createEntityManager();
        List<Analysisresult> analysisresults = em.createQuery("SELECT a FROM Analysisresult a WHERE a.patientId.id = :id")
                .setParameter("id", id).getResultList();
        em.close();
        emf.close();
        return analysisresults;
    }
    

}
