package seven;

public class Dinglemouse {

    private final String firstName;
    private final String lastName;

    public Dinglemouse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        String fullName = firstName + " " + lastName;
        return fullName.trim();
    }

}