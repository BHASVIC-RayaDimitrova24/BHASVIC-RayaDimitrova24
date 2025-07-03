#include <stdio.h>

int main(void) {
    int num;

    printf ("Please enter a number between 1 and 100: );
    scanf ("%d", &num);

    if (num <= 20) {
        printf ("you chose low");
    }
    else if (num >= 80) {
        printf("You chose high");
    }
    else if (num > 20 && num <80) {
        printf("You chose a middle value");
    }
    else {
        printf("Error");
    }


    return 0;
}
