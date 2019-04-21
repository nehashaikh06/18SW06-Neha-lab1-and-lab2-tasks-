//Runtime Argument Calculator
class Calculator{ 
public static void main(String[]args){
int num1=Integer.parseInt(args[0]);
int num2=Integer.parseInt(args[1]);
char Oper=args[2].charAt(0);
System.out.println(args[0]+args[2]+args[1]);


switch(Oper){
case '+': 
System.out.println(num1 + num2);
break;
case '-': 
System.out.println(num1 - num2);
break;
case '*': 
System.out.println(num1 * num2);
break;
case '/': 
System.out.println(num1 / num2);
break;
default:
System.out.println("invalid Entry");
}
}
}