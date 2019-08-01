#include <stdio.h>
int main() {
   int a,b,allMult=1,c,totalSum = 0,remainder;
 scanf("%d",&a);
 b = a;
 while(b!=0){
     remainder = b%10;
   allMult = 1;
   for(c = 1;c <= remainder;c++){
  allMult = allMult * c;
 }
 totalSum = totalSum + allMult;
 b = b/10;
 }
 if(totalSum == a){
 printf("Yes");
 } else {
 printf("No");
 }
	return 0;
}