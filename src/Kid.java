public class Kid {
    private String name;
    int yearOfBirth;

    // Getter -------------
    public String getName() {
        return name;
    }

    // Setter -------------
    void setName(String newName) {
        this.name = newName;
    }

    // Constructors --------
    public Kid() {

    }

    public Kid(String name) {
        setName(name);
    }


    @Override
    public String toString() {
        return "This kids " +
                "name is " + name + "\n" +
                "and year of birth is " + yearOfBirth;
    }
}

