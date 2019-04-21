//To find out that the given alphabet is vowel or a consonant
import java.util.Scanner; 
class VowelCons{ 
public static void main(String[]args){ 
System.out.println("Enter a character:");
Scanner sc = new Scanner(System.in);
char ch = sc.next().charAt(0);
switch (ch){
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.println(ch + " is vowel");
break;
default:
System.out.println(ch + " is consonant");
}
}
}