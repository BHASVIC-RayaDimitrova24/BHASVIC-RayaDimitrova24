#include <stdio.h>
//student demo

int main(void) {
    int nums[10], guess = 0;  //declares array numbers as having 10 values and being an integer like the variable guess which is 0

    for(int x = 0; x<10; x++){  //count controllled loop, 10 times, with every loop x is incremented by 1
        printf("PLease enter number %d",x+1);  //prompt user to enter next number
        fflush(stdin);  //deletes what is currently stored
        scanf("%d:",&nums[x]);  //accepts number user entered
    }
    printf("Which index would you like to check:");  //asks a question
    fflush(stdin); //deletes what is currently stored
    scanf("%d",&guess);  //accepts the index input

    printf("Index %d is %d\n",guess,nums[guess]);  //outputs the value held at the index
    return 0;
}
