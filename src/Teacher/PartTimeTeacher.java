package Teacher;

public class PartTimeTeacher extends Teacher {
    private int hoursWorked;

    public PartTimeTeacher(String id, String name, String address, String phoneNumber, String email, String specialty, String degree, int hoursWorked) {
        super(id, name, address, phoneNumber, email, specialty, degree);
        this.hoursWorked = hoursWorked;
    }

    public double ComputePayRoll() {
        double degreeRate;
        switch (degree) {
            case "PhD":
                degreeRate = 112;
                break;
            case "Master":
                degreeRate = 82;
                break;
            default:
                degreeRate = 42;
        }
        return (hoursWorked * degreeRate * 2) * 0.76;
    }
    
	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

    // Additional fields and methods specific to part-time teachers
}