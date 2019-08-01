#include<stdio.h>

int main()
{
  int ap[4],i,small,j,count;
  for(i=0;i<4;i++){
     scanf("%d",&ap[i]);
  }
  for(i=0;i<4;i++){
    count=0;
    for(j=0;j<4;j++){
       if(i != j){
          if(ap[i] <= ap[j]){
             ++count;
          }
         if(count == 3){
            small = ap[i];
         }
       }
    }
  }
  printf("%d",small);
  return 0;
}