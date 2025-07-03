#include <stdio.h>

void enter_Array();  //define subroutine
void get_Average();  //define subroutine

int Scores[5]; //array of scores with 5 items

int lowest = 0;
int highest = 0;
int count2;
int mode;
int main(void) {
    printf("Enter scores for 10 students: \n");  //prompts user
    enter_Array();  //calls function
    get_Average();  //calls function
    for (int x = 0; x < 10; x++){
        if(Scores[x]<lowest){
            lowest = Scores[x];
        }
    }
    printf("\n The lowest is %d", lowest);

    for (int x = 0; x < 10; x++){
        if(Scores[x]> highest){
            highest = Scores[x];
        }
    }
    printf("\n The highest is %d", highest);

    for(int a= 0; a<10; a++){
        int count = 0;
        for(int b=0; b<10; b++){
            if(Scores[a] == Scores[b]){
                count++;
            }
        }
        if (count > count2){
            count2 = count;
            mode = Scores[a];
        }
    }
    printf("\n The mode is %d", mode);

    return 0;
}

void enter_Array() {

    for (int x = 0; x < 10; x++) {  //loops 5 times

        printf("Score %d:", x + 1);  //user enter score
        fflush(stdin);  //get score from user
        scanf("%d", &Scores[x]); //gets score and adds to array
        //if(Scores[x]<lowest){
            //lowest = Scores[x];

    }//printf("%d", lowest);
}


//int lowest;
//Scores[0]= lowest;

void get_Average(){
    float average = 0;
    int lowest = 0;
    //Scores[0] = lowest;
    for(int y=0; y<10; y++){  //loops 5 times
        //int lowest = Scores[0];
        //int lowest;
        //Scores[0]= lowest;
        average = average + Scores[y]; //adds all 5 inputs together
        if(Scores[y]<lowest){
            lowest = Scores[y];
        }
       // printf("%d", lowest);
    }
    average = average/10;  //divides by 5
    printf("\n The average of the scores is %f",average);  //outputs average to user
    //printf("%d", lowest);
}

