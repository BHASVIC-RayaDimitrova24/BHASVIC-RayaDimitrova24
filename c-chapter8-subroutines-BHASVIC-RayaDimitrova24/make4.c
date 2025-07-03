#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int add(int num1, int num2);
int subtract(int num1, int num2);
int multiply(int num1, int num2);
int divide(int num1, int num2);

int main(void) {
    int x=0, y=0;
    int addition;
    int subtraction;
    int multiplication;
    int division;
    printf("Enter number 1: ");
    fflush(stdin);
    scanf("%d", &x);
    printf("Enter number 2: ");
    fflush(stdin);
    scanf("%d", &y);
    addition = add(x,y);
    subtraction = subtract(x,y);
    multiplication = multiply(x,y);
    division = divide(x,y);

    return 0;
}

int add(int num1, int num2){
    int sum1;
    sum1 = num1+num2;
    printf("\n The output of the addition is %d", sum1);
    return 0;
}

int subtract(int num1, int num2){
    int sum2;
    sum2 = num1-num2;
    printf("The output of the subtraction is %d", sum2);
    return 0;
}

int multiply(int num1, int num2){
    int sum3;
    sum3 = num1*num2;
    printf("The output of the subtraction is %d", sum3);
    return 0;
}

int divide(int num1, int num2){
    int sum4;
    sum4 = num1/num2;
    printf("The output of the subtraction is %d", sum4);
    return 0;
}

