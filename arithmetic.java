import java.util.Scanner;
class ArithmeticOperators{
public static void main(String args[])
{
Scanner src=new Scanner(System.in);
System.out.println("Enter a number num1:");
double num1=src.nextDouble();
System.out.println("Enter a number num2:");
double num2=src.nextDouble();
double sum=num1+num2;
double difference=num1-num2;
double product=num1*num2;
double division=num1/num2;
double quotient=num1%num2;
System.out.println("The sum of two numbers is:"+sum);
System.out.println("The difference of two numbers is:"+difference);
System.out.println("The product of two numbers is:"+product);
System.out.println("The division of two numbers is:"+division);
System.out.println("The quotient of two numbers is:"+quotient);
}
}