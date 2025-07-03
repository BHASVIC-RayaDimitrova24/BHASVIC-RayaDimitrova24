#include <stdio.h>
#include <math.h>

int squareNum (int x);  //declares function as holding integer values

double sqrt(double x);

int main(void) {
    int input = 0, answer = 0;   //assignes values to integer variables
    printf("Enter a number: ");  // prompts user to enter a number
    scanf("%d", &input); //gets user input
    answer = squareNum(input); //passes input to function
    printf("\n %d square root = %d.", input, answer); //outputs answer
    return 0;
}

int squareNum (int x)  //define function
{
        int x_squared;  //declare variable as int
        printf("\n The value of x is %d", x);  //output val of user input
        x_squared = sqrt(x); //outputs x squared
        return x_squared; //returns value
    }


