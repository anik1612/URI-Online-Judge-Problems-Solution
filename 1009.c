#include <stdio.h>

int main(){
    char name[20];
    double salary, totalSale, totalSalary;

    scanf("%s", &name);
    scanf("%lf%lf", &salary, &totalSale);

    double bonus = totalSale * .15;
    totalSalary = salary + bonus;
    printf("TOTAL = R$ %.2lf", totalSalary);

    return 0;

}
