#include <stdio.h>
#include <string.h>

int main(void) {

    int num;

    printf("Enter number of rows: ");
    scanf("%d", &num);


    for(int i = 1; i <= num; i++){
        for(int n = 1; n<=i; n++) {
            printf("  %d", n);
        }
        printf("  \n");

    }

    return 0;
}
