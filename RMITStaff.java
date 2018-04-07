package hrSystem;

public class RMITStaff extends AbstractAccount {

	private String staffID;
	private String name;
	private String position;

	public RMITStaff(String staffID, String name, String position) {

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

	public void displySalary(String staffID, String name, String position) {

	}

	public String toString() {
		return String.format("Staff ID: %s\nName: %s\nPosition: %s\n", this.staffID, this.name, this.position);
	}
}
