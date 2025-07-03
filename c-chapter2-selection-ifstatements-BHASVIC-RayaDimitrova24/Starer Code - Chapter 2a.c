#include <stdio.h>

int main(void) {
    char week;
    int child;
    int adult;
    float costChild;
    float costAdult;

    printf("Please enter day of the week, W for weekday, S for weekend and B for bank holiday: ");
    scanf("%c", &week);

    printf("Please enter number of child tickets");
    scanf("%d", &child);

    printf("Please enter number of adult tickets");
    scanf("%d", &adult);

    if (week == 'W') {
        costChild = (child*5);
        costAdult = (adult*8);
    }
    else if (week == 'S') {
        costChild = (child*7.5);
        costAdult = (adult*12);
    }
    else if (week == 'B') {
        costChild = (child*7.5);
        costAdult = (adult*14);
    }
    else {
        printf("Invalid day of the week.");
    }

    printf("The cost of child tickets is %f\n", costChild);
    printf("The cost of adult tickets is %f\n", costAdult);
    printf("The total cost of the tickets is %f\n", costChild + costAdult);

    return 0;
}
