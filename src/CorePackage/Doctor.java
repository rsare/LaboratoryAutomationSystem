package CorePackage;

import java.util.ArrayList;

/**
 *
 * @author sare
 */
public class Doctor extends Person {

    private ArrayList<Patient> myPatients = new ArrayList<>();
    //static int newid = 300;

    public Doctor() {

    }

    public Doctor(String name, String surname, String password, String username, String phone) {
        super(name, surname, password, username, phone);

        //super.setId(newid++);
    }

        public ArrayList<Patient> getMyPatients() {
        return myPatients;
    }

}
