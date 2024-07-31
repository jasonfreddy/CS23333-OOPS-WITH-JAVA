import java.io.*;
import java.util.*;
class program3{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int one=scan.nextInt();
int more=scan.nextInt();
double c=one*0.10;
double d=more*0.25;
System.out.println("Your total refund will be $"+(c+d));
}
}