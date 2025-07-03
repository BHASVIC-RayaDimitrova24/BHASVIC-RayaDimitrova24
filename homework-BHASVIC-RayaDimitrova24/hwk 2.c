#include <stdio.h>
// Created by rayad on 18/09/2024.
//
int main(void){
  int score = 0;
  int ans;

  printf("\nWhat base is binary? \n1)base 10 \n2)base 2 \n3)base 16 \n4)base 12\n");  //question 1
  printf("\nEnter your choice: ");
  scanf("%d",&ans);


  if (ans ==2) {
      printf("\nCorrect");
      score = score + 1;
  }
  else {
      printf("\nWrong");
  }

  printf("\nWhy use secondary storage? \n1)bacause it is faster \n2)to store data long term \n3)because it is volatile \n4)because it is more expensive\n");
  printf("\nEnter your choice: ");  //question 2
  scanf("%d",&ans);


  if (ans ==2) {
      printf("\nCorrect");
      score = score + 1;
  }
  else {
      printf("\nWrong");
  }

  printf("\nWhich is NOT a programming construct? \n1)sequence \n2)selection \n3)iteration \n4)logic errors\n");
  printf("\nEnter your choice: ");  //question 3
  scanf("%d",&ans);


  if (ans ==4) {
      printf("\nCorrect");
      score = score + 1;
  }
  else {
      printf("\nWrong");
  }

  printf("\nWhat software is the operating system an example of? \n1)open source \n2)application \n3)system \n4)utility\n");
  printf("\nEnter your choice: ");  //question 4
  scanf("%d",&ans);


  if (ans ==3) {
      printf("\nCorrect");
      score = score + 1;
  }
  else {
      printf("\nWrong");
  }

  printf("\nWhen is virtual memory used? \n1)when RAM runs out \n2)when ROM runs out \n3)to store data long term \n4)cpu crashes\n");
  printf("\nEnter your choice: "); //question 5
  scanf("%d",&ans);


  if (ans ==1) {
      printf("\nCorrect");
      score = score + 1;
  }
  else {
      printf("\nWrong");
  }

  printf("\nWhat is binary 0011 in denary? \n1)-3 \n2)3 \n3)F4 \n4)1100\n");
  printf("\nEnter your choice: "); //question 6
  scanf("%d",&ans);


  if (ans ==2) {
      printf("\nCorrect");
      score = score + 1;
  }
  else {
      printf("\nWrong");
  }

  printf("\nWhich of these is NOT a way of developing software? \n1)Rapid Application Development \n2)waterfall lifecycle \n3)Extreme Programming \n4)multilevel feedback queue\n");
  printf("\nEnter your choice: "); //question 7
  scanf("%d",&ans);


  if (ans ==4) {
      printf("\nCorrect");
      score = score + 1;
  }
  else {
      printf("\nWrong");
  }

  printf("\nWhich of these is an input device? \n1)ransomware \n2)encryption \n3)mouse \n4)defragmentation\n");
  printf("\nEnter your choice: "); //question 8
  scanf("%d",&ans);


  if (ans ==3) {
      printf("\nCorrect");
      score = score + 1;
  }
  else {
      printf("\nWrong");
  }

  printf("\nWhich type of secondary storage is most expensive and most portable? \n1)Solid State \n2)Magnetic \n3)Optical \n4)RAM\n");
  printf("\nEnter your choice: "); //question 9
  scanf("%d",&ans);


  if (ans ==1) {
      printf("\nCorrect");
      score = score + 1;
  }
  else {
      printf("\nWrong");
  }

  printf("\nWhich of these is NOT a sorting algorithm? \n1)bubble \n2)merge \n3)insertion \n4)binary\n");
  printf("\nEnter your choice: "); //question 10
  scanf("%d",&ans);


  if (ans ==4) {
      printf("\nCorrect");
      score = score + 1;
  }
  else {
      printf("\nWrong");
  }

  printf ("\nYour score was %d out of 10", score);

  return 0;
 }
