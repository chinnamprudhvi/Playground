import java.io.*;
import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
  int a,b,c,out=0;
  a = scan.nextInt();
  b = scan.nextInt();
  c = scan.nextInt();
  if(a > b && a > c){
    if(b > c){
       out = b;
    }
    else
      out = c;
  }
    if(b > c && b > a){
    if(a > c){
       out = a;
    }
    else
      out = c;
  }
    if(c > b && c > a){
    if(b > a){
       out = b;
    }
    else
      out = a;
  }
  System.out.println(out);
}
}