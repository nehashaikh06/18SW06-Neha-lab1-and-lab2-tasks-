import java.util.Scanner;
class Lab5Task1{
	public static void main(String[]args){
	
        Scanner sc = new Scanner(System.in); 
  

        String name = sc.nextLine(); 
 
        int age = sc.nextInt();
        float per=sc.nextFloat();
        double marks=sc.nextDouble();
        char grade=sc.next().charAt(0);
   
        System.out.println("Name"+name); 
        System.out.println("Age:"+age); 
        System.out.println("Percentage:"+per);
        System.out.println("Marks:"+marks);
        System.out.println("Grade:"+grade);
       
    } 
} 
