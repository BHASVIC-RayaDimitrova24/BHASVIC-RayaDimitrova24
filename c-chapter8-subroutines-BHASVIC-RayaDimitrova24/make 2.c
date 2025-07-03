#include <stdio.h>
#include <math.h>

int testCount (int x);  //declares function as holding integer values



int main(void) {
    int input = 0, answer = 0;   //assignes values to integer variables
    printf("Enter a number: ");  // prompts user to enter a number
    scanf("%d", &input); //gets user input
    answer = testCount(input); //passes input to function

    return 0;
}

int testCount (int x)  //define function
{
        for(int y = 0; y<x+1; y++){
            printf("%d", y);
        }
        //x_squared = sqrt(x); //outputs x squared
        return 0; //returns value
    }


