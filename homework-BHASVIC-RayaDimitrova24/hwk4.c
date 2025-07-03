#include <stdio.h>
// Created by rayad on 18/09/2024.
//
int main(void) {
    int a, i;
    int num;
    printf("Enter number until which the program would output the prime numbers: ");
    scanf("%d", &num);
    for (a=1; a<=num; a++) {
        for (i=2; i<a; i++) {
            if (a % i == 0)
                break;
        }
        if (i == a)
            printf ("%d\t", a);
    }
    return 0;
}
