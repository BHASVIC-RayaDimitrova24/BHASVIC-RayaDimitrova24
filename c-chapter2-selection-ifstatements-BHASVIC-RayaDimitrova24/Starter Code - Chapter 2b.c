#include <stdio.h>

int main(void) {
    int height;  // height is a whole number
    int biscuits;  // biscuits variable is an integer
    int age;
    fflush(stdin);  // clears the output buffer and moves buffered data to the console or  or disk in case of file output stream
    printf("Please enter your height (cm): "); // user prompted to enter height
    scanf("%d",&height); //assigns input to variable height
    fflush(stdin);

    printf("Please enter your age: "); // user prompted to enter height
    scanf("%d",&age);

    printf("How many biscuits have you eaten today?");
    scanf("%d",&biscuits);
    if(height>170 && biscuits >= 2 && age<18 ){  //if they are shorter than 180cm and have eaten more than 2 biscuits
        printf("You are %d cm tall, have eaten more than two biscuits today and are under 18!",height); //prints contents of variable height in place of %d
    }
    else if(age > 10 || biscuits < 1){  // in case if statement not true
        printf("You are either older than 10 OR you haven't eaten a biscuit today");
    }


    else if (biscuits > 5){
        printf ("You have eaten 5 biscuits today!");
    }


    else{  //if the previous 2 conditions not met
        printf("The only thing I know for certain is that you've eaten at least 1 biscuit today.");
    }
    return 0;
}
