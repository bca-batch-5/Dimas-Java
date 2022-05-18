package tugasSistemAkademik.Obj;

public class Person extends Student {
    private String firstName;
    private String lastName;
    private String address;

    public Person(String firstName, String lastName, String address, String matKul, int sks) {
        super(matKul, sks);
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        if (super.getSks() < 144) {
            return getFirstName() + " " + getLastName();
        } else {
            return getFirstName() + " " + getLastName() + ",S.Kom";
        }
    }

    @Override
    public String toString() {
        return getFullName();
    }

}
