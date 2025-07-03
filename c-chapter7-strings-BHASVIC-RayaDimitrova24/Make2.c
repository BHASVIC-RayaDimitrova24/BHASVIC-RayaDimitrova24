#include <stdio.h>
#include <string.h>

int main(void) {
    char str1[100];
    char str2[100];
    char character;
    int count1 = 0;
    int count2 = 0;

    printf("Enter string 1: ");
    fgets(str1, sizeof(str1), stdin);

    printf("\n Enter string 2: ");
    fgets(str2, sizeof(str2), stdin);

    printf("\n Enter character: ");
    scanf(" %c", &character);

    for(int i = 0; i<strlen(str1); i++){
        if(str1[i] == character){
        count1=count1+1;
        }
    }

    printf("There are %d %cs in the first string you entered", count1, character);


    for(int i = 0; i<strlen(str2); i++){
        if(str2[i] == character){
        count1=count1+1;
        }
    }

    printf("\n There are %d %cs in the second string you entered", count2, character);

    if(count1>count2){
        printf("\n String one has more %cs in it", character);
    }
    else if (count2>count1){
        printf("\n String two has more %cs in it", character);
    }
    else{
        printf("\n Both strings have equal %cs in them", character);
    }


    return 0;
}
