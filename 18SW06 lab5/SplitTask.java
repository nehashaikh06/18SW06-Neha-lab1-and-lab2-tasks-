import java.util.Scanner;
public class SplitTask{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String split[]=str.split(",");
	System.out.println("Student 1 Data:");
	System.out.println("Name:"+split[0]);
	System.out.println("Age:"+split[1]);
	System.out.println("Prog:"+split[2]);
	System.out.println("Student 2 Data:");
	System.out.println("Name:"+split[3]);
	System.out.println("Age:"+split[4]);
	System.out.println("Prog:"+split[5]);
	}
}