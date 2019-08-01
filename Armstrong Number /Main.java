#include <stdio.h>
int main() {
  int a,b,digits,remainder,result=0,power=1,i;
 scanf("%d",&a);
 b = a;
   while(b!=0){
    b = b/10;
    ++digits;
  }
 b = a;
   while(b!=0){
     remainder = b%10;
     power = 1;
       for(i=1; i<= digits; i++)
    {
        power = power * remainder;
    }
    result += power;
    b = b/10;
   }
  if(result == a){
  printf("Armstrong Number");
  } else {
  printf("Not an Armstrong Number");
  }
	return 0;
}