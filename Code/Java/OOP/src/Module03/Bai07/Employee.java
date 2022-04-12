package Module03.Bai07;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialSecurityNumber(socialSecurityNumber);
    }

    public Employee() {
        this("KXD", "KXD", "KXD");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (!firstName.equals(""))
            this.firstName = firstName;
        else
            this.firstName = "KXD";
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (!lastName.equals(""))
            this.lastName = lastName;
        else
            this.lastName = "KXD";
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        if (!socialSecurityNumber.equals(""))
            this.socialSecurityNumber = socialSecurityNumber;
        else
            this.socialSecurityNumber = "KXD";
    }

    public abstract double earnings();

    public static String getTieuDe() {
        return String.format("%-15s %-15s", "FullName", "SSN");
    }

    @Override
    public String toString() {
        return String.format("%s %-10s %-15s", firstName, lastName, socialSecurityNumber);
    }
}
