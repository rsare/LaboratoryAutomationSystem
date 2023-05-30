package CorePackage;

import java.util.ArrayList;

/**
 *
 * @author sare
 */
public class Database {

    //  ################# ArrayList Declerations #################
    private static final ArrayList<Person> people = new ArrayList<>();

    //  ################# Encapsulate ArrayLists #################
    public static ArrayList<Person> getPeople() {
        return people;
    }
    //  ################# Methods #################
    
    public static Person loginVerification(String username, String password) {
        Person account = null;
        for (Person person : people) {
            if (person.getUsername().equalsIgnoreCase(username) && person.getPassword().equals(password)) {
                account = person;
                //return person;
                break;
            }
        }
            
        return account;
        // return null;
    }

    public static boolean checkUsername(String username) {
        boolean flag = false;
        for (Person person : Database.getPeople()) {
            if (person.getUsername().equalsIgnoreCase(username)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

}
