#include <stdio.h>
int main()
{
    double i,j,e;
    int x;
    for(i=0; i<=1.9; i+=.2)
    {
        for(j=1.0; j<=3.0; j++)
        {
            e=j+i;
            if(i==0.0||i==1.0)
                printf("I=%.0lf J=%.0lf",i,e);
            else if(e==3.0||e==4.0||e==5.0)
            printf("I=%.0lf J=%.0lf",i,e);
            else
                printf("I=%.1lf J=%.1lf",i,e);
            printf("\n");
        }
    }
    for(x=3; x<=5; x++)
        printf("I=2 J=%d\n",x);
    return 0;
}

