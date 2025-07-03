#include <stdio.h>

int main(void){
    int guess;
    int i;

    int random_number = rand()% 10+1;
    //printf("Random number: %d\n", random_number);

    for (i=1; i<6; i++) {
        printf("\nEnter guess: ");
        scanf("%d", &guess);

        if (guess == random_number){
            printf("\nCorrect");
            break;
        }
        else if (guess < random_number){
            printf("\nToo low");
        }
        else if (guess > random_number){
            printf("\nToo high");
        }
    }


        return 0;
}
