package Person;
public abstract class Person {
    private String id;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person(String id, String name, String address, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public abstract String getCategory();

    // Getters and setters for instance variables

    // Override toString() method
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber
                + ", email=" + email + "]";
    }

    // Override equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return id.equals(other.id);
    }

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
