#include <stdio.h>
// Created by rayad on 18/09/2024.
//
int main(void){
  int choice;
  int starter;
  int mainMeal;
  int desserts;
  int drinks;

  printf ("Would you like to view \n1)starters \n2)mains \n3)desserts \n4)drinks\n\n");
  scanf("\n %d", &choice);

  switch(choice) {
      case 1:
          printf("Which would you like \n1)dumplings \n2)vegetable soup \n3)tomato bruschetta \n4)spring rolls \n5)salad\n\n");
          scanf("\n %d", &starter);
          switch(starter) {
              case 1:
                  printf("Homemade Chinese dumplings with juicy pork and fresh chives");
                  break;
              case 2:
                  printf("Delicious cream soup made of fresh broccoli and carrot ");
                  break;
              case 3:
                  printf("Homemade crispy Italian bruschetta with finely chopped tomato");
                  break;
              case 4:
                  printf("Vietmanese rice paper rolls stuffed with salmon and fresh herbs");
                  break;
              case 5:
                  printf("A mix of refreshing lettuce, tomatoes and cucumber");
                  break;
          }
      case 2:
          printf("Which would you like \n1)pasta \n2)pizza \n3)fish and chips \n4)roast chicken \n5)salmon\n\n");
          scanf("\n %d", &mainMeal);
          switch(mainMeal) {
              case 1:
                  printf("Inspired by traditional italian recipes and served with tomato puree and bacon");
                  break;
              case 2:
                  printf("Italian crispy dough pizza with peperoni and shredded cheese");
                  break;
              case 3:
                  printf("Battered fish with delicious crispy chips");
                  break;
              case 4:
                  printf("Roast chicken with a side of boiled potatoes and carrots and served with gravy");
                  break;
              case 5:
                  printf("Tasty salmon served with mashed potatoes and peas");
                  break;
          }
      case 3:
          printf("Which would you like \n1)chocolate cake \n2)ice cream \n3)pancakes \n4)jelly \n5)cheesecake\n\n");
          scanf("\n %d", &desserts);
          switch(desserts) {
              case 1:
                  printf("Warm delicious cake made from dark Belgium chocolate");
                  break;
              case 2:
                  printf("italian style ice cream with flavours strawberry, chocolate and vanilla");
                  break;
              case 3:
                  printf("French style pancakes served with a selection of jams");
                  break;
              case 4:
                  printf("Delicious strawberry jelly");
                  break;
              case 5:
                  printf("Strawberry cheesecake served with vanilla ice cream");
                  break;
          }
      case 4:
          printf("Which would you like \n1)water \n2)lemonade \n3)orange juice \n4)tea \n5)coffee\n\n");
          scanf("\n %d", &drinks);
          switch(drinks) {
              case 1:
                  printf("Free jug of tap water");
                  break;
              case 2:
                  printf("Fresh homemade lemonade with ice");
                  break;
              case 3:
                  printf("Freshly squeezed orange juice with no added sugar");
                  break;
              case 4:
                  printf("Mint or camomile served with milk or sugar ");
                  break;
              case 5:
                  printf("Espresso with milk if desired");
                  break;
          }

  }

  return 0;
 }
