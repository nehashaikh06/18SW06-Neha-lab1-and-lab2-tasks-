import java.util.Scanner;
class ArrayClass{
	int arr[]=new int[5];
	public void populateArray()
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Elements:");
	  for(int k=0;k<=5;k++){
	   arr[k]=sc.nextInt();
	  }
	     }
	     public void evenOdd()
	     {
	       for(int k=0;k<=5;k++){
	   if(arr[k]%2 !=0){
	   System.out.println("Even Numbers are:"+" "+arr[k]);
	   }
	  }
	  for(int k=0;k<=5;k++){
	  if(arr[k]%2==0){
	  System.out.println("Odd numbers are:"+" "+arr[k]);
	  }
	  }
	}
}

public class DisplayArray{
	public static void main(String[]args){
	ArrayClass a1=new ArrayClass();
	a1.populateArray();
	a1.evenOdd();
}
}