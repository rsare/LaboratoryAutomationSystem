package jpa_Core;

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

    static EntityManagerFactory emf;
    static EntityManager em;

    public static void initEntitiyManager() {

        if (emf == null || em == null) {
            emf = Persistence.createEntityManagerFactory("LaboratoryAutomationSystem");
            em = emf.createEntityManager();
        }

    }

    public static Person loginVerification(String username, String password) {

        try {
            Person person = em.createQuery("SELECT p FROM Person p WHERE"
                    + " p.username = :username AND p.password = :password",
                    Person.class).setParameter("username", username).setParameter("password", password).getSingleResult();

            return person;
        } catch (NoResultException e) {

            return null;
        }

    }

    public static boolean checkUsername(String username) {

        Query query = em.createQuery("SELECT COUNT(p) FROM Person p WHERE p.username = :username");
        query.setParameter("username", username);
        Long count = (Long) query.getSingleResult();

        return count != 0;
    }

    public static void saveUser(Person person) {

        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();

    }

    public static Person getUserByID(int ID) {
        return em.find(Person.class, ID);
    }

    public static void addAnalysis(Analysis analysis, Doctor doctor, Patient patient) {
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
        
        
        
        
    }
    
    
    public static List<Person> getPeople(){
        
        List<Person> people = em.createNamedQuery("Person.findAll", Person.class).getResultList();
        em.close();
        emf.close();
        return people;
        
    }

}
