import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Main{
public static class power{
public static double expo(double a,double b){
  double m;
  m=Math.pow(a,b);
  return m;
}
}
public static void main(String[] args){
 double l,m,s;
 Scanner scan = new Scanner(System.in);
 l = scan.nextDouble();
 m = scan.nextDouble();
 if( m < 0){
 System.out.println("Wrong input");
 }else{
 power v = new power();  
 s = v.expo(l,m);
 System.out.printf("%.0f",s);
}
}
}