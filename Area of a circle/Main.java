#include<stdio.h>
int main()
{
  float dia,r,area;
  scanf("%f",&dia);
  r=dia/2;
  area = 3.14*r*r;
  printf("%.2f",area);
}