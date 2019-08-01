import java.util.Scanner;
public class Main{
 public static class Length{
static double ArcLength(float x,float y){
 double acir;
 acir= (y/360)*(2*3.14*x);
 return acir;
}
}
public static void main (String[] args) {
Scanner scan = new Scanner(System.in);
float radius,angle;
double plength;
Length v = new Length();
radius = scan.nextFloat();
angle = scan.nextFloat();
plength = v.ArcLength(radius,angle);
System.out.printf("%.2f",plength);
}
}