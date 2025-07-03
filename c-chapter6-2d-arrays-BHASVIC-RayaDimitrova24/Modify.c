#include <stdio.h>

int main(void) {
    int students[2][5], iD= 0, score = 0, avg; //2D array students that is like a 2 by 6 table and holds integer values, like the variables id and score, which are 0 and avg, which is empty

    int max = 0;
    int min = 100;
    int a;
    int minnum;

    for(iD = 0; iD<2; iD++){  //start with iD = 0, while id < 2, increment id by 1
        printf("Enter student number: ");  // prompts user to enter number
        fflush(stdin);  // clears the output buffer
        scanf("%d",&students[iD][0]);  //integer entered by user stored in 2d array students, id is row index, 0 is column index
        for(score = 1; score < 5; score++){  // start with score = 1, while score is < 6, increment with every loop
            printf("Enter score %d: ",score);  // prompt user to enter score
            fflush(stdin);  //clears output buffer
            scanf("%d",&students[iD][score]);  //user input stored in 2d array students
        }
    }
    for(int i = 0; i < 2; i++){  //start with i=0, while i<2, i is incremented with every iteration
        avg = 0;  // average variable is 0
        for(int j = 1; j<5; j++){ //start with j=1, while j is<6, j is incremented with every iteration
            avg+=students[i][j]; //average = average + students[i][j]
        }
    printf("Student %d avg is: %d\n",students[i][0],avg/4); //outputs average of student
    }
    for( int a = 0; a<2; a++) {
        for(int b = 1; b < 5; b++) {
            if (students[a][b]>max) {
                max = students[a][b];

            }
        }
    }

    printf("The largest score is %d", max );  //max

    for( int a = 0; a<2; a++) {   //min
        for(int b = 1; b < 5; b++) {
            if (students[a][b]<min) {
                min = students[a][b];
                if(students[0][b]>students[1][b]) {
                    int minnum = students[0][b];
                }
                else {
                    int minnum = students[1][b];
                }
            }
    //printf("\n The smallest score is %d by %d", min ,students[b][0]);

        }


    }
    printf("\n The smallest score is %d", min );

    return 0;
}
