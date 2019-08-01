import java.io.*;
import java.lang.Math;
import java.util.Scanner;

public class Main{
public static class factorial{
public static long fact(long x){
  if(x==1){
  return 1;
  }else{
  x = x * fact(x-1);
  return x;
  }
}
}
public static void main(String[] args){
  long n,val;
  Scanner scan = new Scanner(System.in);
  n = scan.nextLong();
  factorial v = new factorial();
  val = v.fact(n);
  System.out.println(val);
}
}