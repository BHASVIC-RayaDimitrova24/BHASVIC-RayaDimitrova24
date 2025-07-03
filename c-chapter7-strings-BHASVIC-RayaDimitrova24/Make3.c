#include <stdio.h>
#include <string.h>

int main(void) {
    char str[100];

    printf("Enter string: ");
    fgets(str,sizeof(str), stdin);

    for(int i=0; i< strlen(str);i++) {
        if (str[i] != 'a'&& str[i] != 'e'&& str[i] != 'o'&& str[i] != 'i'&& str[i] != 'u') {
            printf("%c", str[i]);
        }
    }

    return 0;
}
