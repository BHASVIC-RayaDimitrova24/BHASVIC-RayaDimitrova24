#include <stdio.h>
#include <math.h>

int powerFunction (int x, int z);  //declares function as holding integer values

int answer;


int main(void) {
    int input = 0, answer = 0, power;   //assignes values to integer variables
    printf("Enter a base number: ");  // prompts user to enter a number
    scanf("%d", &input); //gets user input

    printf("Enter a power number: ");  // prompts user to enter a number
    scanf("%d", &power); //gets user input

    answer = powerFunction(input, power); //passes input to function
    //printf("%d", answer);

    return 0;
}

int powerFunction (int x, int z)  //define function
{
        answer = pow(x, z);
        printf("%d to the power of %d is %d", x, z, answer);
        return 0; //returns value
    }


