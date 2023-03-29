package Teacher;
import Person.Person;
public abstract class Teacher extends Person {
    private String specialty;
    protected String degree;

    public Teacher(String id, String name, String address, String phoneNumber, String email, String specialty, String degree) {
        super(id, name, address, phoneNumber, email);
        this.specialty = specialty;
        this.degree = degree;
    }

    // Getters and setters for instance variables

    // Override toString() method
    @Override
    public String toString() {
        return "Teacher [specialty=" + specialty + ", degree=" + degree + ", " + super.toString() + "]";
    }

    // Override equals() method
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
