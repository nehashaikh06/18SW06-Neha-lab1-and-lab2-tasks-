//To Calculate the total electicity bill
import java.util.Scanner;
class ElectricityBill{
public static void main (String[]args){
long unit;

/*1 - 50 units - 10
50-100 units -  15
101-200 units - 20
201-300 units - 25
above 300 - 30*/

Scanner s=new Scanner(System.in);
System.out.print("Enter number of units consumed: ");
unit=s.nextLong();
if(unit<=50){
    System.out.print("Bill amount is "+(unit*10));
}
else if(unit>50 && unit<=100){
    System.out.print("Bill amount is "+((50*10)+(unit-50)*15));
}
else if(unit>100 && unit<=200){
    System.out.print("Bill amount is "+((50*10)+(100*15)+(unit-100)*20));
}
else if(unit>200 && unit<=300){
    System.out.print("Bill amount is "+((50*10)+(100*15)+(200*20)+(unit-200)*25));
}
 
else if(unit>300){
    System.out.print("Bill amount is "+((50*10)+(100*15)+(200*20)+(300*25)+(unit-300)*30));   
}
}}