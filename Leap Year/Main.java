#include<stdio.h>
int main()
{
  int i;
  scanf("%d",&i);
  if( i%4==0 && i%100 != 0){
     printf("LEAP YEAR");
  }else if( i%4==0 && i%100 == 0)
     {
     if(i%400 == 0){
        printf("LEAP YEAR");
     }else{
        printf("NOT LEAP YEAR");
     }
  }else{
     printf("NOT LEAP YEAR");
  }
  return 0;
}