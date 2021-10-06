import java.io.*;
import java.util.Scanner;
 class Reverse
 {
 public static void main(String args[])
 {
 int a=0;
 int b=0;
 int c=0;
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the no");
 a=sc.nextInt();

 
 for(;a>0;)
 {
 b=a%10;
 c=(c*10)+b;
 a=a/10;
 }
 System.out.println("The reverse String is:"+c);
 }
 }
