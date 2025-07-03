#include <stdio.h>


int main(void) {
    int integer=0;
    float fl=0.0;
    char ch='\0';

    float calc1=0.0;

    printf("Please enter an integer: ");
    scanf("%d\n",&integer);
    printf("Please enter a float: ");
    scanf("%f\n",&fl);
    printf("Please enter a letter or character: ");
    scanf("%c\n",&ch);

    calc1=fl - integer;
    printf("The difference between %f and %d is %f ", fl, integer, calc1);

    return 0;
}
