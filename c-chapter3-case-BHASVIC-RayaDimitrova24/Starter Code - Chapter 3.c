#include <stdio.h>
//demo comment

int main(void) {
    int num1;
    int num2;
    char operator;

    printf("Enter a number: ");
    scanf("%d", &num1);
    if (scanf("%c", &num1) != 1) {
        printf("Invalid Input");

    }
    else {
        printf("Valid input");
    }

    printf("\nEnter another number: ");
    scanf("%d", &num2);

    printf("Enter +, -, * or /: ");
    scanf(" %c", &operator);

    switch (operator) {
        case '+':
            printf ("The result is %d + %d = %d", num1, num2, num1 + num2);
            break;
        case '-':
            printf ("The result is %d - %d = %d", num1, num2, num1 - num2);
            break;
        case '*':
            printf ("The result is %d * %d = %d", num1, num2, num1 * num2);
            break;
        case '/':
            printf ("The result is %d / %d = %d", num1, num2, num1 / num2);
            break;
        default:
            printf("Invalid operator");
    }








    return 0;
}
