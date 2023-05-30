package CorePackage;

/**
 *
 * @author sare
 */
public class Person {
    static int newid = 400;
    private String name;
    private String surname;
    private String password;
    private String username;
    private String phone;
    private int id = 0;

    public Person(String name, String surname, String password, String username, String phone) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.username = username;
        this.phone = phone;
        this.id=newid;
        newid++;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
