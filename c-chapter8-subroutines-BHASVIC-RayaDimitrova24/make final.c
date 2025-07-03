#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int editScores(int s1, int s2, int s3, int s4, int s5);
int scores[5];

int main(void) {
    for(int x=0; x<5;x++){
        do{
        printf("Enter score %d: ", x+1);
        scanf("%d", &scores[x]);
        }
        while(scores[x]< 0|| scores[x] >=75);
    }
    for(int x=0; x<5;x++){
        printf("\n Score %d is %d", x+1, scores[x]);
    }
    editScores(scores[0], scores[1], scores[2],scores[3], scores[4]);

    return 0;


}

int editScores(int s1, int s2, int s3, int s4, int s5){
    printf("\n New Scores: ");
    if(s1< 20){
        scores[0] = 0;
    }
    if(s1< 20){
        scores[1] = 0;
    }
    if(s1< 20){
        scores[2] = 0;
    }if(s1< 20){
        scores[3] = 0;
    }if(s1< 20){
        scores[4] = 0;
    }

    for(int x=0;x<5; x++){
        printf("\n Score %d is %d", x+1, scores[x]);
    }
}