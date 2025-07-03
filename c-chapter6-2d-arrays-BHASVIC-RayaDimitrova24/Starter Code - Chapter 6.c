#include <stdio.h>

int main(void) {
    int students[2][6], iD= 0, score = 0, avg; //2D array students that is like a 2 by 6 table and holds integer values, like the variables id and score, which are 0 and avg, which is empty

    for(iD = 0; iD<2; iD++){  //start with iD = 0, while id < 2, increment id by 1
        printf("Enter student number: ");  // prompts user to enter number
        fflush(stdin);  // clears the output buffer
        scanf("%d",&students[iD][0]);  //integer entered by user stored in 2d array students, id is row index, 0 is column index
        for(score = 1; score < 6; score++){  // start with score = 1, while score is < 6, increment with every loop
            printf("Enter score %d: ",score);  // prompt user to enter score
            fflush(stdin);  //clears output buffer
            scanf("%d",&students[iD][score]);  //user input stored in 2d array students
        }
    }
    for(int i = 0; i < 2; i++){  //start with i=0, while i<2, i is incremented with every iteration
        avg = 0;  // average variable is 0
        for(int j = 1; j<6; j++){ //start with j=1, while j is<6, j is incremented with every iteration
            avg+=students[i][j]; //average = average + students[i][j]
        }
    printf("Student %d avg is: %d\n",students[i][0],avg/5); //outputs average of student
    }
    return 0;
}
