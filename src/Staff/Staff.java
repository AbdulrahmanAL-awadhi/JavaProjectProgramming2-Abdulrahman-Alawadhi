package Staff;

import Person.Person;

public class Staff extends Person implements PayRoll {
    private String duty;
    private int workload;

    public Staff(String id, String name, String address, String phoneNumber, String email, String duty, int workload) {
        super(id, name, address, phoneNumber, email);
        this.setDuty(duty);
        this.workload = workload;
    }

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double ComputePayRoll() {
	    if (workload > 40) {
	        workload = 40;
	    }
	    return (workload * 32 * 2) * 0.75;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}


    // Getters and setters for instance variables
    // Override toString() and equals() methods
    // Implement ComputePayRoll() method
}