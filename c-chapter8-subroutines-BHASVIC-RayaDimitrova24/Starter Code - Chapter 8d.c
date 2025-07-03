#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void revWord(char *revWord); //defines function

int main(void) {
    char word[11];  //variable word has 5 characters
    printf("Enter a 10 letter word: ");  //prompts user to enter word
    fflush(stdin);  //clears output buffer
    scanf("%s",word);  //gets input
    printf("Before reverse, word is %s\n", word); //outputs word
    revWord(word); //passes word as parameter
    printf("After reverse, word is %s\n", word);  //outputs reverse
    return 0;
}

void revWord(char *revWord){  //contents of function
    char tempWord[11]; //declare variable
    int j = 0;  //j is 0
    for(int i=9; i>=0; i--){  //loops 3 times from backwards to forewards
        tempWord[j] = revWord[i];  //reverses word
        j++; //adds 1 to j variable
    }
    tempWord[10] = revWord[];  //assigns value to revWord
    strcpy(revWord,tempWord);  //copies words
}
