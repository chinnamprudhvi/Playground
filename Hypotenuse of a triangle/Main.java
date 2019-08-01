import java.io.*;
import java.lang.Math;
import java.util.Scanner;

public class Main{
public static class Hypo{
public static double side(float x,float y){
double z;
z = Math.pow(x,2) + Math.pow(y,2);
z = Math.sqrt(z); 
return z;
}
}
public static void main(String[] args){
float s1,s2;
double h;
Hypo v = new Hypo();
Scanner scan = new Scanner(System.in);
s1=scan.nextFloat();
s2=scan.nextFloat();
h = v.side(s1,s2);
System.out.printf("%.2f",h);
}
}