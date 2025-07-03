#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <time.h>
#include <stdlib.h>

//declare all variables as global so can be accessed by the 2 subroutines and the main program
int age;
int roomRate;
int boardPrice;
int totalBoardCost;
float totalCost;
char name[50];
char surname[50];
char dateOfBirth[50];
int guests, adults, children, length;
char boardType[50];
char newspaper[50];
int roomNumber;
char bookingID[50];
char bookings[6][10][50] = {""};  //2d array for bookings, 6 rows for each room, 10 columns for user data and each field store max of 50 characters, initially all values set to null
char tables[3][2][50] = {""}; //3 tables, 2 sitting times

void checkIn();
void bookTable();
void checkOut();  //the 2 subroutines

int main() {
    int userChoice;  //user chooses 1 of 3 options

    while(1) {
        printf("\n\nDo you want to \n1) Check in \n2) Book a dinner table \n3) Check out\n");
        scanf("%d", &userChoice);
        if (userChoice == 1) {
            checkIn();
        }
        else if (userChoice == 2) {
            bookTable();
        }
        else if (userChoice == 3) {
            checkOut();
        }
    }


}

void checkIn() {

    int valid, day, month, year;  //local as only need to be accessed by this subroutine
    // Validate first name
    do {
        printf("\n Enter first name: ");
        scanf("%s", name);

        valid = 1;
        int length = strlen(name);

        if (length < 2 || length > 10) {
            valid = 0;
            printf("Name must be between 2 and 10 characters long.\n");
        }

        for (int i = 0; i < length; i++) {
            if (!isalpha(name[i])) {  //if does not contain alphabet characters
                valid = 0;
                printf("Name must contain only letters.\n");
                break;
            }
        }
    } while (!valid);  //!means NOT

    // Validate surname
    do {
        printf("\n Enter surname: ");
        scanf("%s", surname);

        valid = 1;
        int length = strlen(surname);

        if (length < 2 || length > 20) {
            valid = 0;
            printf("Surname must be between 2 and 20 characters long.\n");
        }

        for (int i = 0; i < length; i++) {
            if (!isalpha(surname[i])) {
                valid = 0;
                printf("Surname must contain only letters.\n");
                break;
            }
        }
    } while (!valid);

    // Validate format of DOB

    do {
        printf("\nEnter Date of Birth (dd/mm/yyyy): ");
        scanf("%s", dateOfBirth);
        valid = sscanf(dateOfBirth, "%2d/%2d/%4d", &day, &month, &year);
        if (valid == 3 && day >= 1 && day <= 31 && month >= 1 && month <= 12 && year >= 1900 && year <= 2024) { //checks format
        } else {
            valid = 0;
            printf("Invalid Date of Birth format. Please enter in dd/mm/yyyy format.\n");
        }

        age = year-2024;
         if (11 <= month ) { //works out age
            age = age-1;
        }
        age = age*-1;
        if (age < 18) {
            printf("You are too young to book a room");
            return;
        }

    } while (!valid);

    //validate number of guests
    do {
        printf("\nEnter number of guests (max of 4): ");
        scanf("%d", &guests);
    } while (guests != 1 && guests != 2 && guests != 3 && guests != 4);

    //validate number of adults and children match number of guests
    do {
        printf("\nEnter number of adults: ");
        scanf("%d", &adults);
        printf("\nEnter number of children: ");
        scanf("%d", &children);
    } while (adults + children != guests);

    //validate board type
    do {
        printf("\nEnter board type (FB, HB, BB): ");
        scanf("%s", boardType);
    } while (strcmp(boardType, "FB") != 0 && strcmp(boardType, "HB") != 0 && strcmp(boardType, "BB") != 0);

    //user enter days
    printf("\nEnter how many days you will stay at the hotel: ");
    scanf("%d", &length);

    //validate if user wants a newspaper
    do {
        printf("\nEnter if you want a newspaper (yes or no): ");
        scanf("%s", newspaper);
    } while (strcmp(newspaper, "yes") != 0 && strcmp(newspaper, "no") != 0);

    int roomAvailable = 0; //if no rooms available
    for (int i = 0; i < 6; i++) {
        //outputs available rooms and prices
        if (strcmp(bookings[i][0], "") == 0) {
            printf("\n\nRoom %d is available", i + 1);
            roomAvailable = 1;
            if (i == 0 || i == 1) {
                printf("\nThe room would cost %d pounds for you", 100 * length);
            } else if (i == 2) {
                printf("\nThe room would cost %d pounds for you", 85 * length);
            } else if (i == 3 || i == 4) {
                printf("\nThe room would cost %d pounds for you", 75 * length);
            } else if (i == 5) {
                printf("\nThe room would cost %d pounds for you", 50 * length);
            }

            if (strcmp(boardType, "FB") == 0) {
                printf("\nThe board will cost you %d pounds", 20 * guests * length);
            } else if (strcmp(boardType, "HB") == 0) {
                printf("\nThe board will cost you %d pounds", 15 * guests * length);
            } else if (strcmp(boardType, "BB") == 0) {
                printf("\nThe board will cost you %d pounds", 5 * guests * length);
            }
        }
    }

    if (!roomAvailable) { //if there are no rooms available
        printf("No rooms available.\n");
        return; // Exit the checkIn function, return to main menu
    }

    do {
        printf("\n\nWhich room would you like? ");
        scanf("%d", &roomNumber);
        //assigns user data to the 2d array
        if (roomNumber >= 1 && roomNumber <= 6 && strcmp(bookings[roomNumber - 1][0], "") == 0) {
            strcpy(bookings[roomNumber - 1][0], name);
            strcpy(bookings[roomNumber - 1][1], surname);
            strcpy(bookings[roomNumber - 1][2], dateOfBirth);
            sprintf(bookings[roomNumber - 1][3], "%d", guests);
            sprintf(bookings[roomNumber - 1][4], "%d", adults);
            sprintf(bookings[roomNumber - 1][5], "%d", children);
            strcpy(bookings[roomNumber - 1][6], boardType);
            sprintf(bookings[roomNumber - 1][7], "%d", length);
            strcpy(bookings[roomNumber - 1][8], newspaper);

            //generate booking id
            srand(time(0));
            int random = (rand() % 90) + 10;
            sprintf(bookingID, "%s%d", surname, random);
            strcpy(bookings[roomNumber - 1][9], bookingID);

            printf("\nYour room has been booked");
            printf("\nYour booking ID is %s\n", bookingID);
            break;
        } else {
            printf("\nInvalid room choice or room already booked.\n");
        }
    } while (1);

}


void checkOut(){
        if (roomNumber <= 2) roomRate = 100;
        else if (roomNumber == 3) roomRate = 85;
        else if (roomNumber <= 5) roomRate = 75;
        else if (roomNumber == 6) roomRate = 50;
        else roomRate = 0;


        //apply 10% discount if the main user is 65 or older
        if (age >= 65) {
            roomRate = roomRate * 0.9;
        }

        //int boardPrice;
        if (strcmp(boardType, "FB") == 0) boardPrice = 20;
        else if (strcmp(boardType, "HB") == 0) boardPrice = 15;
        else if (strcmp(boardType, "BB") == 0) boardPrice = 5;
        else boardPrice = 0;

        //define guests variable
        //int guests = adults + children;
        totalBoardCost = guests * boardPrice * length;
        if (children > 0) {
            totalBoardCost -= (children * boardPrice * length) / 2; // 50% off for children
        }
        totalCost = (roomRate * length) + totalBoardCost;


        //display the final bill
        printf("\n--- Final Bill ---\n");
        printf("Name: %s %s\n", name, surname);
        printf("Booking ID: %s\n", bookingID);
        printf("Room Cost: %d\n", roomRate * length);
        printf("Board Cost: %d\n", totalBoardCost);
    if(strcmp(newspaper, "yes") == 0) {
        totalCost = totalCost+ 5.5;
        printf("Newspaper Cost: 5.50\n");
    }
        printf("The total cost is %.2f", totalCost);
}


void bookTable(){
    char enterid[50];  //local variables
    char table[50];
    int tablenum;
    int tabletime;
    int timenum;

        printf("Enter booking ID: ");
        scanf("%s", enterid);

        //checks if user is a guest at the hotel
        int found = 0;
        for (int a = 0; a < 6; a++) {
            if (strcmp(bookings[a][9], enterid) == 0) {
                printf("\nBooking ID found");
                if (strcmp(bookings[a][6], "BB") == 0)  {
                        printf("\nYou are staying BB so cannot book a dinner table\n");
                    return;
                }
                found = 1;

                //only FB and HB can order a table
                //checks if there are any available tables
                int available = 0;
                for (int c = 0; c < 6; c++) {
                    if (strcmp(bookings[c][6], "FB") == 0 || strcmp(bookings[c][6], "HB") == 0) {
                        printf("\nYou may order a table\n");

                        for (int i = 0; i < 3; i++) { for (int j = 0; j < 2; j++) {
                            if (strcmp(tables[i][j], "") == 0) { available = 1;
                                break;

                            }

                        }
                        if (available) break;

                }
                if (!available) {
                    printf("There are no available tables.\n");
                }


                        if (strcmp(tables[0][0], "") == 0) {
                            printf("\n\nEndor is available at 7");
                        }
                        if (strcmp(tables[0][1], "") == 0) {
                            printf("\n\nEndor is available at 9");
                        }
                        if (strcmp(tables[1][0], "") == 0) {
                            printf("\n\nNaboo is available at 7");
                        }
                        if (strcmp(tables[1][1], "") == 0) {
                            printf("\n\nNaboo is available at 9");
                        }
                        if (strcmp(tables[2][0], "") == 0) {
                            printf("\n\nTatooine is available at 7");
                        }
                        if (strcmp(tables[2][1], "") == 0) {
                            printf("\n\nTatooine is available at 9");
                        }

                        do{
                        printf("\n\nWhich table would you like to book: ");
                        scanf("%s", table);
                        }while (strcmp(table, "Endor") != 0 && strcmp(table, "Naboo") != 0&& strcmp(table, "Tatooine") != 0);

                        do{
                        printf("\nWhich time would you like to book: ");
                        scanf("%d", &tabletime);
                        }while(tabletime != 7 && tabletime != 9);

                        if(strcmp(table, "Endor") == 0){
                            tablenum=0;
                        }
                        else if(strcmp(table, "Naboo") == 0){
                            tablenum=1;
                        }
                        if(strcmp(table, "Tatooine") == 0){
                            tablenum=2;
                        }

                        if(tabletime=7){
                            timenum=0;
                        }
                        else if(tabletime=9){
                            timenum=1;
                        }

                        strcpy(tables[tablenum][timenum], bookingID);
                        printf("Your table has been booked");

                    }
                }
                break;
            }
        }

        if (!found) {
            printf("Booking ID not found.\n");
        }

}
