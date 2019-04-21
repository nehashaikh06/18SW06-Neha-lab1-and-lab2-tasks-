import java.util.Scanner;
class Marksheet{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Please enter marks in C++:");
int num1=sc.nextInt();
System.out.print("Please enter marks in Data Structures:");
int num2=sc.nextInt();
System.out.print("Please enter marks in Operating System:");
int num3=sc.nextInt();
int Omarks=num1+num2+num3;
int Tmarks=300;
System.out.println("Total marks is:"+Omarks);
float per=(float)(Omarks*100)/Tmarks;
char p='%';
System.out.println("Percentage:"+per+p);
if(per>90){
System.out.println("Grada:A");}
else if(per<=90 && per>80){
System.out.println("Grade:B");}
else if(per<79 && per>=70){
System.out.println("Grade:C");}
else if(per<60){
System.out.println("Fail");}




}
}