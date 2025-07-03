import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class HelloWorld {
    static int age = 27;
    public static void main(String[] arguments) {
        int age = 27;

        System.out.println("I am " +age+ " years old.");

        //integer types
        byte aSingleByte = 100; //-128 to 127
        short aSmallNumber = 20000; //-32768 to 32767
        int anInteger = 214784647; //-2147483648 to 2147483647
        long aLargeNumber = 132747385925049753L; //very long numbers

        //decimal types
        double aDouble = 1.793736362;
        float aFloat = 4.4028F;

        //booleans
        boolean isWeekend = false;
        boolean isWorkday = true;

        //characters
        char percentSymbol = '%';
        System.out.println("The percent symbol is " +percentSymbol);

        //turning int to double
        int number1 = 5;
        double number2 = number1;
        System.out.println(number2);

        //turning double to int
        double num1 = 5.8;
        int num2 = (int)num1;
        System.out.println(num2);

        //arithmetic operators
        int Number1 = 12;
        int Number2 = 6;
        System.out.println(Number1+Number2);
        System.out.println(Number1-Number2); //can output negative numbers
        System.out.println(Number1*Number2);
        System.out.println(Number1/Number2); //rounds answer unless numbers declared as double
        System.out.println(Number1%Number2); //modulo division

        //comparison operators
        System.out.println(Number1 == Number2);
        System.out.println(Number1 != Number2);
        System.out.println(Number1 > Number2);
        System.out.println(Number1 < Number2);
        System.out.println(Number1 >= Number2);
        System.out.println(Number1 <= Number2);

        int new_number = 12;
        //new_number = new_number +5;
        new_number +=5;
        System.out.println(new_number);

        int age2 = 40;
        System.out.println(age>=18 && age<=40); //AND

        boolean isStudent = false;
        boolean isLibraryMember = false;
        System.out.println(isStudent || isLibraryMember); //OR

        int score = 0;
        int turns = 10;
        score++;
        turns--;
        System.out.println(score);
        System.out.println(turns);
        System.out.println(--score); //decreases by 1

        //String name = "Raya Dimitrova";
        String name = new String ("Raya Dimitrova"); //creates a new object
        System.out.println(name);

        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectString1 = new String ("xyz");
        String objectString2 = new String ("xyz");

        System.out.println(literalString1 == literalString2); //true
        System.out.println(objectString1 == objectString2);  //false

        String Name = "Raya Dimitrova";  //%s
        String Country = "UK";  //%s
        int Age = 16;  //%d
        double FavDouble = 3.8; //%f
        char percentSign = '%'; //%c
        boolean information = true;  //%b
        //System.out.println("Hello World! I am" + Name + ".I live in the" +Country+ "I am"+age);
        String formattedString = String.format("My name is %s. I live in the %s. My age is %d. My favourite double number is %f. My attendance is 95%c. This is all %b.", Name, Country, Age, FavDouble, percentSign, information);
        System.out.println(formattedString);

        System.out.println(Name.length());//counts spaces as well
        System.out.println(Name.isEmpty());//check if string is empty
        System.out.println(Name.toUpperCase());
        System.out.println(Name.toLowerCase());

        String string1 = new String ("abc");
        String string2 = new String ("ABC");
        System.out.println(string1.equals(string2)); //outputs false as case-sensitive
        System.out.println(string1.equalsIgnoreCase(string2)); //outputs true

        String string = "The sky is blue";
        System.out.println(string.replace("blue", "red"));
        System.out.println(string);
        String updatedString = string.replace("blue", "red");
        System.out.println(updatedString);
        System.out.println(string.contains("sky"));

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? "); //without ln, so not on a new line
        String user_name = scanner.nextLine();
        System.out.println(user_name);

        System.out.printf("Hello %s. How old are you?", user_name);
        int user_age = Integer.parseInt(scanner.nextLine());
        double decimal = Double.parseDouble(scanner.nextLine());
        System.out.printf("%d is a good age.", user_age);

        //cleans up the input buffer
        //scanner.nextLine();

        System.out.printf("%d is a good age.What language do you prefer?", user_age);
        String language = scanner.nextLine();
        System.out.printf("%s is a good language", language);


        System.out.print("\n Enter the first number: ");
        double input1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        double input2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What operation do you want to perform? ");
        String operation = scanner.nextLine();

        /*if (operation.equals("sum")){  //better to use a switch case statement
            System.out.printf("%f + %f = %f", input1, input2, input1+input2);
        } else if (operation.equals("sub")){
            System.out.printf("%f - %f = %f", input1, input2, input1-input2);
        } else if (operation.equals("mul")){
            System.out.printf("%f * %f = %f", input1, input2, input1*input2);
        } else if (operation.equals("div")){
            if (number2 ==0){
                System.out.println("Cannot divide by zero");
            }else{
                System.out.printf("%f / %f = %f", input1, input2, input1/input2);
            }
        }
        else{
            System.out.printf("%s is not a supported operator", operation);
        }*/

        switch (operation){
            case "sum":
                System.out.printf("%f + %f = %f", input1, input2, input1+input2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", input1, input2, input1-input2);
                break;
            case "mul":
                System.out.printf("%f * %f = %f", input1, input2, input1*input2);
                break;
            case "div":
                if (number2 ==0){
                    System.out.println("Cannot divide by zero");
                }else{
                    System.out.printf("%f / %f = %f", input1, input2, input1/input2);
                }
                break;
            default:
                System.out.printf("%s is not a supported operator", operation);
        }

        char vowels[] = new char [5];

        //a e i o u
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        System.out.println(vowels[2]);
        System.out.println(Arrays.toString(vowels));

        char vowels2[] = {'e', 'u', 'a', 'o', 'i'};
        vowels2[2] = 'x'; //replaces value
        Arrays.sort(vowels2); //put in alphabetical order
        int startingIndex = 1;
        int endingIndex = 4;
        Arrays.sort(vowels2, startingIndex, endingIndex);
        System.out.println(Arrays.toString(vowels2));
        System.out.println(vowels2.length); //outputs 5

        int startingIndex2 = 1;
        int endingIndex2 = 4;
        char key = 'o';
        int foundItemIndex = Arrays.binarySearch(vowels2, startingIndex2, endingIndex2, key);
        System.out.println(foundItemIndex);

        Arrays.fill(vowels2, startingIndex2, endingIndex2, 'x'); //fill entire array with x
        System.out.println(Arrays.toString(vowels));

        int numbers[] = {1,2,3,4,5};
        int copyOfNumbers[] = Arrays.copyOfRange(numbers, startingIndex2, endingIndex2);
        Arrays.fill(numbers, 0);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));
        System.out.println(Arrays.equals(numbers, copyOfNumbers));

        for(int i =1; i<=10;i++){
            System.out.println(i);
        }

        int numbers2[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int index = 0; index <numbers2.length;index++){
            //sum += numbers[index];
            System.out.println(numbers2[index]);
        }
        System.out.println(sum);

        int newNumber = 5;
        for(int multiplier = 1; multiplier <10; multiplier++){
            System.out.printf("%d x %d = %d \n", newNumber, multiplier, newNumber*multiplier);

        }

        for (int x =1; x<=2; x++){
            for(int y =1; y<=2; y++){
                System.out.printf("%d x %d = %d \n", x,y, x*y);
            }
        }

        for (int a = 1;a<=3;a++){
            if(a %2 == 1){
                System.out.println(a);
            }
        }

        int arrayNumbers[] = {1,2,3,4,5};
        int sum2 =0;
        for(int b:arrayNumbers){
            System.out.println(b);
            sum += b;
        }
        System.out.println(sum2);

        int value = 5;
        int multiplier2 = 1;
        /*while(multiplier2 <= 10){
            System.out.printf("%d x %d = %d \n", value, multiplier2, value +multiplier2);
        }*/

        do{
            System.out.printf("%d x %d = %d \n", value, multiplier2, value +multiplier2);
            multiplier2++;
        }while (multiplier2<=10);

        scanner.close(); //always have to close, otherwise stay open in memory

        ArrayList<Integer> numbersArrayList = new ArrayList<Integer>();
        numbersArrayList.add(1);
        numbersArrayList.add(2);
        numbersArrayList.add(3);
        numbersArrayList.add(4);
        numbersArrayList.add(5);
        System.out.println("Before: " +numbersArrayList.toString());

        numbersArrayList.remove(2);
        numbersArrayList.remove(Integer.valueOf(4));
        numbersArrayList.clear();
        //numbersArrayList.set(2, Integer.valueOf(30));
        numbersArrayList.sort(Comparator.naturalOrder());
        numbersArrayList.sort(Comparator.reverseOrder());

        numbersArrayList.forEach(number ->{
            System.out.println(number*2);
        });

        System.out.println(numbersArrayList.toString());
        //System.out.println(numbersArrayList.get(2)); //index position
        System.out.println(numbersArrayList.contains(Integer.valueOf(10)));
        System.out.println(numbersArrayList.isEmpty());
        System.out.println("After: " +numbersArrayList.toString());

    }
}

