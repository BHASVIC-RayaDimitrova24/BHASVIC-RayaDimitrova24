#include <stdio.h>
#include <stdlib.h>


int main(void) {
    char gameBoard[3][3] ={ {'-','-','-'}, {'-','-','-'},{'-', '-', '-'}};
    int Player1x;
    int Player1y;
    int Player2x;
    int Player2y;
    int Xval =0;
    int Yval =0;
    for(int i =0; i<3; i++) {
        for(int j=0; j<3; j++) {
            printf("%c", gameBoard[i][j]);
        }
        printf("\n");
    }
    for(int count =1; count<=9; count++) {
        if (count==1||count==3||count==5||count==7||count==9) {
            printf("Player 1 enter row number: ");

            scanf("%d", &Player1x);
            Xval = Player1x-1;


            printf("Player 1 enter column number: ");
            scanf("%d", &Player1y);
            Yval = Player1y-1;

            gameBoard[Xval][Yval]='x';
            for(int i =0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    printf("%c", gameBoard[i][j]);
                }
                printf("\n");
            }
        }

        else {
            printf("Player 2 enter row number: ");
            scanf("%d", &Player2x);
            Xval = Player2x-1;

            printf("Player 2 enter column number: ");
            scanf("%d", &Player2y);
            Yval = Player2y-1;

            gameBoard[Xval][Yval]='o';
            for(int i =0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    printf("%c", gameBoard[i][j]);
                }
                printf("\n");

            }


        }
    }
    for(int i =0; i<3; i++) {
        if(gameBoard[i][0]==gameBoard[i][1]&&gameBoard[i][1]==gameBoard[i][2]&&gameBoard[i][0]==gameBoard[i][2]) {
            if(gameBoard[i][0]=='x') {
                printf("\n\nPlayer x has won");
            }
            else {
                printf("\n\nPlayer y has won");
            }

        }
        if (gameBoard[0][i]==gameBoard[1][i]&&gameBoard[1][i]==gameBoard[2][i]&&gameBoard[0][i]==gameBoard[2][i]) {
            if(gameBoard[0][i]=='x') {
                printf("\n\nPlayer x has won");
            }
            else {
                printf("\n\nPlayer y has won");
            }


        }
    }
    if(gameBoard[0][0]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[2][2]&&gameBoard[0][0]==gameBoard[2][2]) {
        if(gameBoard[0][0]=='x') {
            printf("\n\nPlayer x has won");
        }
        else {
            printf("\n\nPlayer y has won");
        }

    }
    else if(gameBoard[2][0]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[0][2]&&gameBoard[0][2]==gameBoard[2][0]) {
        if(gameBoard[2][0]=='x') {
            printf("\n\nPlayer x has won");
        }
        else {
            printf("\n\nPlayer y has won");
        }

    }
    else {
        printf("\n\nTie");
    }

}

