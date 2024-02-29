class Student
{
	int rollno;
	void getno(int n)
	{
		rollno=n;
	}
	void putno()
	{
		System.out.println("rollno :"+rollno);
	}
}
class Test extends Student
{
	float part1,part2;
	void getMarks(float m1,float m2)
	{
		part1 = m1;
		part2 = m2;
	}
	void putMarks()
	{
		System.out.println("marks obtained");
		System.out.println("part 1 -"+part1);
		System.out.println("part 2 -"+part2);
	}
}
interface Sports
{
	float sportWt=6.0f;
	void putWt();
}
class Results extends Test implements Sports
{
	float total;
	public void putWt()
	{
		System.out.println("stort wt = "+sportWt);
	}
	void display()
	{
		total=part1+part2+sportWt;
		putno();
		putMarks();
		putWt();
		System.out.println("total score = "+total);
	}
}
class Hybrid
{
	public static void main(String[] args) {
		Results Student1=new Results();
		Student1.getno(1234);
		Student1.getMarks(27.5f,33.0f);
		Student1.display();
	}
}