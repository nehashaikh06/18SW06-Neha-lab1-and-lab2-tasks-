class Stdnt{
	String name;
	int rollno;
	int age;
}
class Mrksht{
	int java;
	int cp;
	int algebra;
	int result;
	double per;
}
class Result{
	Stdnt s;
	Mrksht m;
	Result(Stdnt s1,Mrksht m1){
	s=s1;
	m=m1;
	}
	public void createStudentResult()
	{
	System.out.println("Name:"+s.name);
	System.out.println("Rollno:"+s.rollno);
	System.out.println("Age:"+s.age);
	System.out.println("Marks in Java:"+m.java);
	System.out.println("Marks in CP:"+m.cp);
	System.out.println("Marks in Algebra:"+m.algebra);
	System.out.println("Total marks:"+(m.java+m.cp+m.algebra));
	System.out.println("Percentage:"+(m.java+m.cp+m.algebra)*100/400);
	}
}
public class Combine{
	public static void main(String[]args){
	Stdnt s=new Stdnt();
	Mrksht m=new Mrksht();
	s.name="Neha";
	s.rollno=6;
	s.age=18;
	m.java=98;
	m.cp=106;
	m.algebra=103;
	Result r=new Result(s,m);
	r.createStudentResult();
	}
}
