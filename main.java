package GSLC2;

public class main {
	public static void main(String[] args)
	{
		System.out.println("Student Info:");
		
		Score s1 = new Score("Jonk", "25123", "Computer Science", 87, 80, 92);
		System.out.println(s1.toString());
		Elective1 e1 = new Elective1(s1.averageScore(), "Comptetitive Programming", 85);
		System.out.println(e1.toString());
		e1.requirement();
		
		Score s2 = new Score("Bonk", "24321", "International Business Management", 81, 72, 82);
		System.out.println(s2.toString());
		Elective1 e2 = new Elective1(s2.averageScore(), "Accounting", 65);
		System.out.println(e2.toString());
		e2.requirement();
		
		Score s3= new Score("Zonk", "26721", "Computer Science", 73, 95, 62);
		System.out.println(s3.toString());
		Elective1 e3 = new Elective1(s3.averageScore(), "Comptetitive Programming", 85);
		System.out.println(e3.toString());
		e3.requirement();
	}
}
