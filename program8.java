import java.io.*;
import java.util.*;
class program8{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
int l=0;
if(num>=10){
l=(num/10)%10;
}
else{
l=-1;
}
System.out.println(l);
}
}