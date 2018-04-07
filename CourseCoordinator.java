package hrSystem;

public class CourseCoordinator extends AbstractAccount {

	private String staffID;
	private String name;
	private String position;

	public CourseCoordinator(String staffID, String name, String position) {

		this.staffID = staffID;
		this.name = name;
		this.position = position;
	}

	public String getStaffID() {
		return staffID;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public void staffPreferabilities() {

	}

	public void publishPositions() {

	}

	public static void hireNewStaff() {

	}

}
