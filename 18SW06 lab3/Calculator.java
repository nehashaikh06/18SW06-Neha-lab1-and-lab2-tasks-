//Runtime Argument Calculator
class Calculator{ 
public static void main(String[]args){
int FirstNo=Integer.parseInt(args[0]);
int SecondNo=Integer.parseInt(args[1]);
char Operator=args[2].charAt(0);
System.out.println(args[0]+args[2]+args[1]);


switch(Operator){
case '+': 
System.out.println(FirstNo + SecondNo);
break;
case '-': 
System.out.println(FirstNo - SecondNo);
break;
case '*': 
System.out.println(FirstNo * SecondNo);
break;
case '/': 
System.out.println(FirstNo / SecondNo);
break;
default:
System.out.println("invalid Entry");
}
}
}