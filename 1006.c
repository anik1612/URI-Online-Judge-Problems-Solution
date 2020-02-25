#include <stdio.h>

int main (){
    double A, B, C, MEDIA;
    int D=2, E=3, F=5;
    scanf("%lf%lf%lf",&A,&B,&C);
    MEDIA = ((A*D)+(B*E)+(C*F))/(D+E+F);
    printf("MEDIA = %.1lf\n", MEDIA);

    return 0;
}
