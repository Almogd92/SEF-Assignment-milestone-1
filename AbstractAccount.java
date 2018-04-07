package hrSystem;

abstract class AbstractAccount {

	private String staffID;
	private String name;
	private String position;

	private void login() {
		if (staffID != null && name != null && position != null) {
			System.out.print("login successful ");
		}
	}

	abstract String getStaffID();

	abstract String getName();

	abstract String getPosition();

}
