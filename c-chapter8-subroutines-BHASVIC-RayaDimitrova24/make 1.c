#include <stdio.h>
#include <math.h>

int divEleven (int x);  //declares function as holding integer values

double sqrt(double x);

int main(void) {
    int input = 0, answer = 0;   //assignes values to integer variables
    printf("Enter a number: ");  // prompts user to enter a number
    scanf("%d", &input); //gets user input
    answer = divEleven(input); //passes input to function
    printf("\n %d can be divided by 11 %d times.", input, answer); //outputs answer
    return 0;
}

int divEleven (int x)  //define function
{
    int x_squared;  //declare variable as int
    printf("\n The value of x is %d", x);  //output val of user input
    x_squared = x/11; //outputs x squared
    return x_squared; //returns value
}


