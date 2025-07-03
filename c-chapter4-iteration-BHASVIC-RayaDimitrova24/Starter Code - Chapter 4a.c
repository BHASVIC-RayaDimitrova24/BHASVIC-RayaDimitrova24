#include <stdio.h>
//student demo

int main(void) {
    int age = 0;
    while (age < 0 || age > 115){
        printf("Age:");
        fflush(stdin);
        scanf("%d",&age);

    }
    printf("You have %d years until 100",100-age);
    return 0;
}
