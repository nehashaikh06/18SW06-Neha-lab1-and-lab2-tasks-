class Astudent{
	String name;
	int rollno;
	int age;
	
	public void showDetails(){
	   System.out.println("Name:"+name+"\n"+"Rollno:"+rollno+"\n"+"Age:"+age);
	   
	}
}
public class ShowStudent{
	public static void main(String[]args){
	Astudent s1=new Astudent();
	s1.name="Neha";
	s1.rollno=6;
	s1.age=18;
	s1.showDetails();
	}
}