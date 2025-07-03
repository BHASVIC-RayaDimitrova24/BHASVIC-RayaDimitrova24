#include <stdio.h>

int main(void) {
    int correct = 88309867532, passcode = 0;  //sets integer variables correct and passcode

    do{ //does once no matter what
        if
        printf("Passcode:");  // prompts user to enter passcode
        fflush(stdin);  //erases values currently held in registers
        scanf("%d",&passcode);  //assigns input to passcode variable
    } while(correct != passcode);  //continues until user enter correct passcode

    printf("Well done, that was correct.");  // outputs this to user

    return 0;
}
