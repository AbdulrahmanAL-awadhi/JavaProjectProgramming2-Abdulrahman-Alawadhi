package Teacher;

public class FullTimeTeacher extends Teacher {
    public FullTimeTeacher(String id, String name, String address, String phoneNumber, String email, String specialty, String degree) {
        super(id, name, address, phoneNumber, email, specialty, degree);
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
        return (32 * degreeRate * 2) * 0.85;
    }


	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

    // Additional fields and methods specific to full-time teachers
}