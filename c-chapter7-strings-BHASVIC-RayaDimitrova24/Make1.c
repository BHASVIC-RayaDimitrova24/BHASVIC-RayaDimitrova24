#include <stdio.h>
#include <string.h>


int main(void) {

    char words[5][100];
    char string[100];

    for(int i = 0; i < 5; i ++) {
        printf("Enter word %d ", i + 1);
        fgets(words[i], sizeof(words[i]), stdin);
    }


    strcpy(string, words[0]);
    for(int i = 1; i < 5; i++) {
        if(strcmp(words[i],string ) < 0 ){
            strcpy (string, words[i]);
        }
    }

    printf(" %s is first in alphabetical order", string);

    return 0;
}
