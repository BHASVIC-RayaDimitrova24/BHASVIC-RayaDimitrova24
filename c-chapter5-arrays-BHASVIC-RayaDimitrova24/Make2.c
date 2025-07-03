#include <stdio.h>
//student demo

int main(void) {
    int nums[10], guess = 0;  //declares array numbers as having 10 values and being an integer like the variable guess which is 0
    int above = 0;

    for(int x = 0; x<10; x++){  //count controllled loop, 10 times, with every loop x is incremented by 1
        printf("PLease enter score %d",x+1);  //prompt user to enter next number
        fflush(stdin);  //deletes what is currently stored
        scanf("%d:",&nums[x]);  //accepts number user entered
    }
    int sum = (nums[0]+nums[1]+nums[2]+nums[3]+nums[4]+nums[5]+nums[6]+nums[7]+nums[8]+nums[9]);
    int average = sum/10;
    //fflush(stdin);
    printf("The average is %d", average);
    for (int n = 0; n<10; n++) {
        if (nums[n]> average) {
            above = above + 1;

        }
        else {
            above = above;;
        }
    }



    printf("\n Above average are %d", above);

    for (int i = 1; i < 10; ++i) {
        if (nums[0] < nums[i]) {
            nums[0] = nums[i];
        }
    }

    printf("\n Largest element = %d", nums[0]);   //highest

    for (int r = 1; r < 10; ++r) {
        if (nums[0] > nums[r]) {
            nums[0] = nums[r];
        }
    }

    printf("\n Smallest element = %d", nums[0]);  //lowest


    printf("\nWhich index would you like to check:");  //asks a question
    fflush(stdin); //deletes what is currently stored
    scanf("%d",&guess);  //accepts the index input

    printf("Index %d is %d\n",guess,nums[guess]);  //outputs the value held at the index
    return 0;
}
