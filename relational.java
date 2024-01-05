import java.util.Scanner;
class RelationalOperators{
public static void main(String args[]){
Scanner scr=new Scanner(System.in);
System.out.println("Enter first number:");
int num1=scr.nextInt();
System.out.println("Enter second number:");
int num2=scr.nextInt();
System.out.println("num1>num2 is"+(num1>num2));
System.out.println("num1>num2 is"+(num1<num2));
System.out.println("num1>=num2 is"+(num1>=num2));
System.out.println("num1<=num2 is"+(num1<=num2));
System.out.println("num1==num2 is"+(num1==num2));
System.out.println("num1!=num2 is"+(num1!=num2));
}
}