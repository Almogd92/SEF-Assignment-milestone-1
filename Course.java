package hrSystem;

import java.util.Scanner;

public class Course {

	private String name;
	private String courseID;

	public Course(String name, String courseID) {
		this.name = name;
		this.courseID = courseID;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return courseID;
	}

	public void showAvailability(String courseID) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the desired course ID: \n");
		courseID = scan.nextLine();
		if (courseID == this.courseID) {
			System.out.print(toString());
			System.out.print("This course is available on the following dates: \n");
			System.out.print("Tuesday - 10:30-12:30\n Wednsday - 8:30-10:30\n");
		}
	}

	public String toString() {
		return String.format("Course Name: %s\nCourse ID: %s\n", this.name, this.courseID);
	}
}
