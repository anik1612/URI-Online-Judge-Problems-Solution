#include <stdio.h>

int main(){
    int empNum, workHour;
    float salary;

    scanf("%d%d",&empNum, &workHour);
    scanf("%f", &salary);

    printf("NUMBER = %d\n", empNum);
    printf("SALARY = U$ %.2f\n", workHour*salary);

}
