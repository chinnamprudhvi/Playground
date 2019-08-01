#include <stdio.h>
int main() {
int a,b,c,z,d;
scanf("%d",&a);
b = a;
z = a;
   if(b < 100)
      {
       c = b%10;
       printf("%d",c);
      }
   else 
      {
       while(z > 100)
          {
             z = z/10;
          } 
          d = z%10;
          printf("%d",d);
      }
	return 0;
}