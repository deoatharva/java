import java.util.*;
class Course
{
	public static void main(String[] args) {
		Course course;
		String str,dept,number,name;
		Scanner scanner;
		scanner = new Scanner(System.in);

		System.out.println("enetr the course");
		str = scanner.nextLine();
		dept = str.substring(0,str.indexOf(" "));
		str = str.substring(0,str.indexOf(" ")+1,str.length());
		number = str.substring(0,str.indexOf(" "));
		name = str.substring(str.indexOf(" ")+1,str.length());
		course = new Course(dept,number,name);

		System.out.println();
		System.out.println("this class , \""+course.getName()+"\",is a ");
		System.out.println(course.getLevel() + "level class offered by the");
		System.out.println(course.getDepartment() + " department");
	}
}