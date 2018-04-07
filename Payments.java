package hrSystem;

public class Payments {

	private static float rate;
	private static float hours;
	private static float funds;
	private static float salary;

	public Payments(float rate, float hours) {
		this.rate = rate;
		this.hours = hours;
	}

	public static float getRate() {
		return rate;
	}

	public static float getHours() {
		return hours;
	}

	public static float transferFunds(float hours, float rate) {
		funds = hours * rate;
		//more advanced calculation needed 
		salary = salary + funds;
		return salary;
	}
	public static float displaySalary()
	{
		System.out.print("The Salary is "+ salary);
		return salary;
	}

}
