#include <stdio.h>
#include <string.h>
int main(void) {
    char name[50];
    char surname[50];
    char dateOfBirth[11];
    int adults;
    int children;
    char boardType[3];
    int length;
    char newspaper;
    char bookingID;
    int roomNumber;
    int age;
    int roomRate;

    if (roomNumber <= 2) roomRate = 100;
    else if (roomNumber == 3) roomRate = 85;
    else if (roomNumber <= 5) roomRate = 75;
    else if (roomNumber == 6) roomRate = 50;
    else roomRate = 0;

    //apply 10% discount if the main user is 65 or older
    if (age >= 65) {
        roomRate = roomRate * 0.9;
    }
    int boardPrice;
    if (strcmp(boardType, "FB") == 0) boardPrice = 20;
    else if (strcmp(boardType, "HB") == 0) boardPrice = 15;
    else if (strcmp(boardType, "BB") == 0) boardPrice = 5;
    else boardPrice = 0;

    //define guests variable
    int guests = adults + children;
    int totalBoardCost = guests * boardPrice * length;
    if (children > 0) {
        totalBoardCost -= (children * boardPrice * length) / 2; // 50% off for children
    }
    float totalCost = (roomRate * length) + totalBoardCost;
    if(newspaper == 'y') {
        float totalCost = + 5.5;
    }
    bookingID == 'oneill232';
    //display the final bill
    printf("\n--- Final Bill ---\n");
    printf("Booking ID: %s\n", bookingID);
    printf("Room Cost: %d\n", roomRate * length);
    printf("Board Cost: %d\n", totalBoardCost);
    printf("Thr total cost is %f", totalCost);

    return 0;
}