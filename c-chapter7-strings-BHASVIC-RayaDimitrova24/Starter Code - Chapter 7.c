#include <stdio.h>
#include <string.h>

int main(void) {
    char name[60];  //variable name can contain up to 60 characters

    do {   //does once before checks condition
        printf("Name: ");   //asks user for name
        gets(name);  //gets the name from the user and assigns to variable name

        if(strlen(name) < 2){  //if variable less than 2 characters
            printf("It isn't possible %s is a name!\n",name); //outputs their name and says it is too short
        }
        else if(strlen(name) > 35) {
            //if variable more than 30 characters
            printf("It isn't possible %s is a name !\n",name); //outputs their name and says it is too long
        }
        else if(strlen(name) == 6){
            printf(" %s is 6 characters long!\n",name);
        }
        else{  //if none of previous conditions true
            printf("Your name is accepted\n");  //output that it is accepted
        }

    }while(strlen(name) < 2 || strlen(name) > 35);  //do the loop while name is shorter than 2 or longer than 30

    return 0;
}
