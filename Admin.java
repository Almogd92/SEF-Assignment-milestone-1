package hrSystem;

public class Admin extends AbstractAccount {
	private String staffID;
	private String name;
	private String position;

	public Admin(String staffID, String name, String position) {

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

	public void createAccount() {

	}

	public void manageAccount() {

	}
}
