import java.io.*;
import java.util.*;
class program7{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int Total=scan.nextInt();
int year=Total/365;
int b=Total-(365*year);
int months=b/30;
int days=b-(months*30);
System.out.println("YEARS:"+year+" MONTH:"+months+" DAYS:"+days);
}
}