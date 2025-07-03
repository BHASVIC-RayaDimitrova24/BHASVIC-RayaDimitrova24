#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int x;
    int y;
    int correct = 0;

    char map[10][10];
    for (int i = 0; i<10; i++) {
        printf("\n");
        for(int b=0; b< 10; b++) {
            map[i][b] = '-';
            printf("%c", map[i][b]);
        }
    }

    int randrow = rand()%10+1;
    int randcolumn = rand()%10+1;
    printf("%d", randrow);
    printf("%d", randcolumn);
    map[randrow][randcolumn] = 'x';

    while(2 == 1 + 1) {
        do {
            printf("\n Enter x coordinate: ");
            scanf("%d", &x);
        }
        while (x>10||x<1);

        do {
           printf("\n Enter y coordinate: ");
           scanf("%d", &y);
        }

        while (y>10||y<1);

        if (map[x][y]=='x') {
            printf("Yes, that was right");
            printf(map);
        }
        else {
            printf("That was not right");
            map[x][y] = 'o';
            for (int i = 0; i<10; i++) {
                printf("\n");
                for(int b=0; b< 10; b++) {
                    map[i][b] = '-';
                    printf("%c", map[i][b]);
                    break;
                }
            }

        }





    }


    return 0;
}
