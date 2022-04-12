package stt55_leThanhNghia_20116351;

public class FullName {
    private String lastName;
    private String firstName;

    public FullName(String lastName, String firstName) {
        setLastName(lastName);
        setFirstName(firstName);
    }

    public FullName() {
        this("Unknown", "Unknown");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (!lastName.equals(""))
            this.lastName = lastName;
        else
            this.lastName = "Unknown";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (!firstName.equals(""))
            this.firstName = firstName;
        else
            this.firstName = "Unknown";
    }
    
    public static String getTieuDeName() {
        return String.format("%-20s", "Ho ten");
    }
    
    @Override
    public String toString() {
        String s = firstName +" "+ lastName;
        return String.format("%-20s", s);
    }

}
