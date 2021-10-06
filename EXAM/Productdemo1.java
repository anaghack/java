import java.io.*;
import java.util.*;
import java.util.Scanner;

class Product
{
int pcode;
String pname;
int price;

void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the product code:");
pcode=sc.nextInt();

System.out.println("Enter the product name:");
pname=sc.next();

System.out.println("Enter the price:");
price=sc.nextInt();
}
void display()
{
System.out.println("Product code is:"+pcode);
System.out.println("Product name:"+pname);
System.out.println("Enter the product code"+price);
}
}
class Productdemo1
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
System.out.println("Enter the Limit");
int n=s.nextInt();
Product p[]=new Product[n];
for(int i=0;i<n;i++)
{
p[i]=new Product();
p[i].read();
}
 int min=1;
 for(int i=0;i<n;i++)
 {
 if(p[min].price>p[i].price)
 min=1;
 }
 System.out.println("The Minimum price product is:");
 p[min].display();
 }
 

 }
 

