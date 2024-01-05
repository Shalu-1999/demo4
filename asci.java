.import java.util.Scanner;
class PrintAsciiValue{
public static void main(String args[]){ 

System.out.println("Enter a ascii character:");
Scanner src=new Scanner(System.in);
char chr=src.next().charAt(0);
int asciiValue=chr;
System.out.println("Ascii value of"+chr+"is:"+asciiValue);
}
}