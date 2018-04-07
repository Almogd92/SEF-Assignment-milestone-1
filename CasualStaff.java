package hrSystem;

public class CasualStaff extends AbstractAccount {
	// - setAvailabilty
	// - uploadResume
	// - selectCourse
	private String staffID;
	private String name;
	private String position;
	private String resume;
	private String studyStatus;

	public CasualStaff(String staffID, String name, String position, String studyStatus) {
		this.staffID = staffID;
		this.name = name;
		this.position = position;
		this.studyStatus = studyStatus;
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

	public String getStudyStatus() {
		return studyStatus;
	}

	public String uploadResume() {

		return resume;
	}

}
