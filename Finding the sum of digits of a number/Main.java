#include <stdio.h>
int main() {
int num,sum=0,z,r,q;
scanf("%d",&num);
q = num;
z = num;
while(z > 0){
z = q/10;
r = q%10;
q = z;
sum = sum + r;  
}
printf("%d",sum);
	return 0;
}