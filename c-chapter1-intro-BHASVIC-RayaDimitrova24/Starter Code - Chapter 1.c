#include <ctype.h>
#include<stdio.h>
#include<stdlib.h>

int main(void) {
    char choice;
    printf("\nChoose a number\n\na) 10\nb) 2\nc) 3\nd) 4 \n\n Enter an option: ");
    scanf("%c", &choice);

    switch(toupper(choice)) {
        case 'A';
            printf("You entered an even number");
            break;
        case 'B';
            printf("You entered an odd number");
            break;


    }

    return 0;
}
