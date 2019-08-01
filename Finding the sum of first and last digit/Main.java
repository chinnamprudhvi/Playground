#include <stdio.h>
int main() {
int a,b,c,d,sum;
scanf("%d",&a);
b = a%10;
c = a;
 while(c > 100)
          {
             c = c/10;
          } 
d = c/10;
sum = b+d;
printf("%d",sum);
return 0;
}