package hrSystem;

public class Approval extends AbstractAccount {

	private String staffID;
	private String name;
	private String position;
	private float rate;
	private float hours;
	private float salary;
	public Approval(String staffID, String name, String position) {

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

	public void approveHiredStaff() {
		CourseCoordinator.hireNewStaff();
	}

	public void checkFinances() {
		
		Payments.displaySalary();
		System.out.print("The Salary is "+ salary);
		
	}

	public void handlePayment() {
		rate = Payments.getRate();
		hours = Payments.getHours();
		salary = Payments.transferFunds(hours, rate);
		System.out.print("The payment has been accepted the updated salary is now "+ salary);

	}

}
