#include <stdio.h>
int main() {
  int a,b,allMult=1;
 scanf("%d",&a);
 for(b = 1;b <= a;b++){
  allMult = allMult * b;
 }
 printf("%d",allMult);
	return 0;
}