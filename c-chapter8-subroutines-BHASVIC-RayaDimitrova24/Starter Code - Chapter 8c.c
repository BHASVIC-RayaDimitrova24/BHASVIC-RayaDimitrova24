#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int findVol(int radius); //define subroutine

int main(void) {
    int h=0, w=0, diameter=0, volume=0;  //assigns the variables to 0, hold integer values
    printf("Enter radius: ");  //prompts user to enter w,h,d
    fflush(stdin);  //clears output buffer
    scanf("%d", &diameter);  //gets responces
    volume = findVol(diameter);  //pass as parameters to function
    printf("\n The shape volume = %d",volume); //outputs volume
    return 0;
}

int findVol(int diameter){  //parameter values in function
    int vol;  //vol is integer
    vol = (4/3)*3.1415*pow(diameter,3);  //finds the volume
    return vol;
}

