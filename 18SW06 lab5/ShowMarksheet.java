

public  class ShowMarksheet{
	public static void main(String[]args){
	Marksheet m1=new Marksheet();
	m1.java=98;
	m1.cp=106;
	m1.algebra=93;;
	m1.marks();
	m1.percentage();
	m1.grade();
}}

class Marksheet{
	int java;
	int cp;
	int algebra;
	int result;
	double per;
	public void marks(){
	result=java+cp+algebra;
	System.out.println("Totals marks="+result);
	}
	public void percentage(){
	 int tmarks=400;
	 per=result*100/tmarks;
	 System.out.println("Percentage="+per);
	}
	public void grade(){
	 if(per>90)
	 System.out.println("Grade:A");
	 else if(per>=80 && per<=90)
	 System.out.println("Grade:B");
	 else if(per>=70 && per<=80)
	 System.out.println("Grade:C");
	 else if(per<60)
	 System.out.println("FAIL");
	}
}