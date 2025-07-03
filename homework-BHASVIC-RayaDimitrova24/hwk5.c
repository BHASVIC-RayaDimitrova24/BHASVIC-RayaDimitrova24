#include <stdio.h>

int main(void) {
    int wage;
    int total;

    float monthProfit;
    float weekProfit;
    float dayProfit;

    int food;
    int rent;
    int electricity;
    int water;
    int fuel;
    int gas;

    printf("How much do you earn per month: ");
    scanf("%d", &wage);

    printf("\nHow much do you spend on food per month: ");
    scanf("%d", &food);

    printf("\nHow much do you pay for rent per month: ");
    scanf("%d", &rent);

    printf("\nHow much do you pay for electric per month: ");
    scanf("%d", &electricity);

    printf("\nHow much do you pay for water per month: ");
    scanf("%d", &water);

    printf("\nHow much do you pay for fuel per month: ");
    scanf("%d", &fuel);

    printf("\nHow much do you pay gas per month: ");
    scanf("%d", &gas);

    printf("\n Your expenses are:");
    printf("\n\n Food: %d",food);
    printf("\n Rent: %d",rent);
    printf("\n Electricity: %d",electricity);
    printf("\n Water: %d",water);
    printf("\n Fuel: %d",fuel);
    printf("\n Gas: %d",gas);

    total = food+rent+electricity+water+fuel+gas;
    printf("\n Your total expenses are: %d",total);

    monthProfit = wage - total;
    weekProfit = monthProfit/4;
    dayProfit = monthProfit/28;

    printf("\n\n Your monthly profit is: %.2f",monthProfit);
    printf("\n Your weekly profit is: %.2f",weekProfit);
    printf("\n Your daily profit is: %.2f",dayProfit);

    return 0;
}
