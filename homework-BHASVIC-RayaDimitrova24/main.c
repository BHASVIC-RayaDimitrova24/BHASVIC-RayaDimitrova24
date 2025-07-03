#include <stdio.h>

int main(void) {
    int num;
    int min;
    int type;
    int max;
    int i;
    printf("Enter a number: ");
    scanf ("%d", &num);

    if (num%2 == 0) {
        printf("%d is even", num);
    }
    else {
        printf("%d is odd", num);
    }

    printf ("\n Min value for range");
    scanf("%d", &min);

    printf ("\n Max value for range");
    scanf("%d", &max);

    printf("If you want even type 0, 1 for odd");
    scanf("%d", &type);

    if (type == 0) {
        for (i = min; i<max; i++) {
            if (i%2 == 0) {
                printf("\n%d", i);
            }
        }
    }
    else if(type ==1) {
        for (i = min; i<max; i++) {
            if (i%2 != 0) {
                printf("\n%d", i);
            }
        }
    }
    else {
        printf("Invalid input");
    }

    return 0;
}
