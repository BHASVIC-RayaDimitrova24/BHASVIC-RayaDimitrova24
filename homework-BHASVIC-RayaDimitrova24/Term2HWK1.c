#include <stdio.h>
#include <stdlib.h>

int main(void) {
    char name[50];
    int choice;
    int foodChoice;
    int activityChoice;
    int hunger = (rand() % 99)+2;
    int happiness = (rand() % 99)+2;
    int energy = (rand() % 99)+2;

    printf("Enter pet's name: ");
    scanf("%s", name);
    printf("\n Hunger: %d ", hunger, "%");
    printf("\n Happiness: %d ", happiness, "%");
    printf("\n Energy: %d ", energy, "%");

    while (hunger!=100&&happiness!=0&&energy!=0) {
        printf("\n\n Do you want to \n1)feed pet \n2)play with pet \n3)check pet status");
        scanf("\n %d", &choice);
        if (choice == 1) {
            printf("\n Do you want to feed \n1)treat(reduces hunger by 10%, increases happiness by 20%, increase energy by 10%) \n2)fish(reduce hunger by 50%, increase happiness by 40%, increase energy by 50%) \n3)meat(reduce hunger by 100%, increase hapiness by 70%, increase energy by 70%)");
            scanf("\n %d", &foodChoice);
            if (foodChoice == 1) {
                if(hunger>=10) {
                    hunger=hunger-10;
                }
                else {
                    hunger = 0;
                }
                if(energy<=90) {
                    energy=energy+10;
                }
                else {
                    energy = 100;
                }
            }
            else if(foodChoice == 2) {   //choice 2
                if(hunger>=50) {
                    hunger=hunger-50;
                }
                else {
                    hunger = 0;
                }
                if(energy<=50) {
                    energy=energy+50;
                }
                else {
                    energy = 100;
                }

            }
            else if(foodChoice == 3) {    //choice 3
                hunger = 0;
                if(energy<=30) {
                    energy=energy+70;
                }
                else {
                    energy = 100;
                }

            }
            else {
                printf("Invalid option");
            }

        }
        else if (choice == 2) {
            printf("\nChoose an activity \n1)fetch(happiness increase by 30%, energy decrease by 10%) \n2)tug of war(happiness increase by 50%, energy decrease by 60%) \n3)nap(happiness increase by 10%, energy increase by 40%)");
            scanf("\n %d", &activityChoice);
            if (activityChoice == 1) {   //option1
                if(happiness<=70) {
                    happiness=happiness+30;
                }
                else {
                    happiness = 100;
                }
                if (energy<=90) {
                    energy=energy-10;
                }
                else {
                    energy = 100;
                }
            }
            else if(activityChoice == 2) {
                //option2
                if(happiness<=50) {
                    happiness=happiness+50;
                }
                else {
                    happiness = 100;
                }
                if (energy<=40) {
                    energy=energy-60;
                }
                else {
                    energy = 100;
                }
            }
            else if(activityChoice == 3) {
                //option 3
                if(happiness<=90) {
                    happiness=happiness+10;
                }
                else {
                    happiness = 100;
                }
                if (energy<=60) {
                    energy=energy-40;
                }
                else {
                    energy = 100;
                }
            }
            else {
                printf("Invalid option");
            }
        }
        else if (choice == 3) {
            printf("\n\nHunger: %d ", hunger, "%");
            printf("Happiness: %d ", happiness, "%");
            printf("Energy: %d ", energy, "%");
        }
        else {
            printf("Invalid option");
        }
    }
    if (hunger == 100) {
        printf("Your pet died from starvation");
    }
    else if (happiness == 0) {
        printf("Your pet died from sadness");
    }
    else if (energy == 0) {
        printf("Your pet died from tiredness");
    }
}
