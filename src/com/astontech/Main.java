package com.astontech;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //notes:    Private Static Method for the lesson
	    LessonCalculatorLAB();
    }


    private static void LessonCalculatorLAB(){
        Scanner reader = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        try {
            int total = secondNumber/firstNumber;
            System.out.println("Result: " + total);
        }
        catch(ArithmeticException ex){
            System.out.println("Exception: Cannot divide by 0");
        }
        finally
        {
            System.out.println("Program has been completed regardless of exceptions");
        }
        String operatorInput = null;
        while(true){
            System.out.print("Enter a value between 0 and 9: ");
            String firstInput = reader.nextLine();
            firstNumber = Integer.parseInt(firstInput);
            if(firstNumber > 9 || firstNumber < 0) {
                System.out.println("INVALID");
            } else {
                break;
            }
        }
        while(true){
            System.out.print("Enter another value between 0 and 9: ");
            String secondInput = reader.nextLine();
            secondNumber = Integer.parseInt(secondInput);
            if(secondNumber > 9 || secondNumber < 0) {
                System.out.println("INVALID");
            } else {
                break;
            }
        }
        while(true){
            System.out.print("Enter an operator (+,-,/,*: ");
            operatorInput = reader.nextLine();
            if(!"+".equals(operatorInput) & !"-".equals(operatorInput) & !"/".equals(operatorInput) & !"*".equals(operatorInput)) {
                System.out.println("INVALID");
            } else {
                break;
            }
        }
         switch(operatorInput){
             case "+":
                 int calculationAdd = firstNumber + secondNumber;
                 System.out.println(firstNumber + " + " + secondNumber + " = " + calculationAdd);
                 break;
             case "-":
                 int calculationSub = firstNumber - secondNumber;
                 System.out.println(firstNumber + " - " + secondNumber + " = " + calculationSub);
                 break;
             case "/":
                 int calculationDiv = firstNumber / secondNumber;
                 System.out.println(firstNumber + " / " + secondNumber + " = " + calculationDiv);
                 break;
             case "*":
                 int calculationMul = firstNumber * secondNumber;
                 System.out.println(firstNumber + " * " + secondNumber + " = " + calculationMul);
                 break;
             default:
                 System.out.println("Thanks for playing!");
                 break;
         }
    }

    private static void LessonFizzBuzzLAB(){
        int i;
        for(i=1; i <= 100; i++) {
            if ((i%3) == 0 && (i%5) == 0) {
                System.out.println("FizzBuzz");
            } else if ((i%5) == 0) {
                System.out.println("Buzz");
            } else if ((i%3)==0) {
                System.out.println("Fizz");
            } else
                System.out.println(i);
        }
    }

    private static void LessonExceptions() {
        //todo: simple unhandled exception
//        String firstName = "Justin";
//        int x = Integer.parseInt(firstName);
//
//        System.out.print("Interger value: ");
//        System.out.println(x);

        //todo: try - catch block
//        String firstName = "Justin";
//        try {
//            int x = Integer.parseInt(firstName);
//
//            System.out.print("Integer value: ");
//            System.out.println(x);
//        } catch(NumberFormatException ex) {
//            System.out.println("Exception: Invalid Number");
//        }

        //todo: try - catch with multiple catch blocks
//        String firstName = null;
//        try {
//            int x = Integer.parseInt(firstName);
//
//            System.out.print("Integer Value: ");
//            System.out.println(x);
//        }
//        catch (NumberFormatException ex)
//        {
//            System.out.println("Exception: Number Format Error");
//        }
//        catch (IllegalArgumentException ex)
//        {
//            System.out.println("Exception: String was null or empty");
//        }
//        catch (Exception ex)
//        {
//            System.out.println("Exception: Generic Exception");
//        }


        //todo: try - catch with multiple catch and finally block
//        String firstName = null;
//        try {
//            int x = Integer.parseInt(firstName);
//
//            System.out.print("Integer Value: ");
//            System.out.println(x);
//        }
//        catch (IllegalArgumentException ex)
//        {
//            System.out.println("Exception: String was null or empty");
//        }
//        catch (NullPointerException ex)
//        {
//            System.out.println("Exception: Null Pointer");
//        }
//        catch (Exception ex)
//        {
//            System.out.println("Exception: Generic Exception");
//        }
//        finally
//        {
//            System.out.println("Program has been completed regardless of exceptions");
//        }

        //todo: exception object
//        String firstName = null;
//        try {
//            int x = Integer.parseInt(firstName);
//
//            System.out.print("Integer Value: ");
//            System.out.println(x);
//        }
//        catch (IllegalArgumentException ex)
//        {
//            System.out.println("Exception: " + ex.toString());
//        }
//        catch (NullPointerException ex)
//        {
//            System.out.println("Exception: " + ex.toString());
//        }
//        catch (Exception ex)
//        {
//            System.out.println("Exception: " + ex.toString());
//        }
//        finally
//        {
//            System.out.println("Program has been completed regardless of exceptions");
//        }

        //todo: Throwing an Exception
//        String firstName = null;
//        try {
//            int x = Integer.parseInt(firstName);
//
//            System.out.print("Integer value: ");
//            System.out.println(x);
//        }
//        catch (Exception ex)
//        {
//            throw new Exception("A custom exception from LessonExceptions method.", ex);
//        }


    }

    private static void LessonFlowControl(){
        //notes:    if/else
        String name = "justin";
        //if(name == "justin")
        //OR if working with strings
        if(name.equals("dan")) {
            System.out.println("Correct First Name");
            System.out.println("Correct First Name");
        }
        else {
            System.out.println("Incorrect First Name");
            if(name.length() > 10) {
                System.out.println("Very long first name");
            }
            else if(name.length() > 5) {
                System.out.println("long first name");
            } else {
                System.out.println("Short first name");
            }
        }

        //notes:    CASE-SWITCH
        switch(name)
        {
            case "justin":
                System.out.println("cool first name");
                break;
            case "dan":
            case "danny":
            case "daniel":
                System.out.println("first name is dan, danny, or daniel");
                break;

            default:
                System.out.println("some other first name");
                break;
        }


    }

    private static void LessonOperators(){
        //notes:    plus/minus
        int val = 10;
        System.out.println(val + 10);
        System.out.println(val - 10);

        //notes:    modulus (%) - the remainder
        int modVal = 10 % 3; //the remainder of 10/3 which is 1
        System.out.println(modVal);

        //notes:    increment (++) / decrement (--)
        System.out.println("increment after: ");
        System.out.println(val++);  //10
        System.out.println(val++);  //11
        System.out.println(val++);  //12
        System.out.println(val);    //val=13;

        val = 10;
        System.out.println("increment before: ");
        System.out.println(++val);  //11
        System.out.println(++val);  //12
        System.out.println(++val);  //13
        System.out.println(val);    //val=13;

        val = 10;
        System.out.println("decrement after: ");
        System.out.println(val--);  //10
        System.out.println(val--);  //9
        System.out.println(val--);  //8
        System.out.println(val);    //7;

        val = 10;
        System.out.println("increment before: ");
        System.out.println(--val);  //9
        System.out.println(--val);  //8
        System.out.println(--val);  //7
        System.out.println(val);    //7

        //notes:    conditional (==) / logical not equal (!=)
        val = 10;
        int anotherVal = 20;

        if(val != anotherVal)
            System.out.println("Not Equals");
        else
            System.out.println("Equals");

        //notes:    logical AND (&&) / logical OR (||)
        //Using one & causes both parameters to be checked.
        if(val == 10 && anotherVal == 10)
            System.out.println("Is True");
        else
            System.out.println("Not true");

        //notes:    negation (!)
        boolean boolVar = true;
        if(!boolVar)
            System.out.println("Is True");
        else
            System.out.println("Not true");




    }

    private static void LessonFundamentalsLAB(){
        //   What is a variable?
        //   Variable is an item that has a value that can be changed depending on how its used.
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a value between 1 and 10: ");
        String input = reader.nextLine();
        int intInput = Integer.parseInt(input);
        double total = intInput + 1.75;
        System.out.println("Your Number (" + input + ") + 1.75 is: " + total);

        System.out.println(" ");

        //8 data types
        byte byteValue = 0;
        short shortValue = 0;
        int intValue = 0;
        long longValue = 0;
        float floatValue = 0;
        double  doubleValue = 0.0;
        boolean booleanValue = false;
        char charValue = 'J';

        System.out.println("8 Data Types and their Defaults");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("boolean: " + booleanValue);
        System.out.println("default not really applicable");

        System.out.println(" ");

        System.out.println("8 Data Types and their Min/Max");
        System.out.println("Byte Datatype values");
        System.out.println("Min = " + Byte.MIN_VALUE);
        System.out.println("Max = " + Byte.MAX_VALUE);

        System.out.println("Short Datatype values");
        System.out.println("Min = " + Short.MIN_VALUE);
        System.out.println("Max = " + Short.MAX_VALUE);

        System.out.println("Integer Datatype values");
        System.out.println("Min = " + Integer.MIN_VALUE);
        System.out.println("Max = " + Integer.MAX_VALUE);

        System.out.println("Long Datatype values");
        System.out.println("Min = " + Long.MIN_VALUE);
        System.out.println("Max = " + Long.MAX_VALUE);

        System.out.println("Float Datatype values");
        System.out.println("Min = " + Float.MIN_VALUE);
        System.out.println("Max = " + Float.MAX_VALUE);

        System.out.println("Integer Datatype values");
        System.out.println("Min = " + Double.MIN_VALUE);
        System.out.println("Max = " + Double.MAX_VALUE);

        System.out.println("Boolean Datatype values are just true and false");

        System.out.println("Char Datatype values are all single letter unicode");

        System.out.println(" ");

        //Strings are not part of the eight primitive data types, why not?  
        /*
        Strings are not a primitive data type because they are immutable or in other words, unable to change once declared.
        They also follow a different set of rules in which they can abide by where primitive data types do not.
        Using a primitive data type in a loop would be more efficient to use than an array of data types, in some cases.
         */

        // Which of the data types is a String actually composed of?
        /*
         A string is an array of the primitive data type Char. Its a string of Char values that can be accessed like an array.
         */

        // Prove this in your code.

        //Allowed to use multiple LETTERS and NUMBERS within the value of the variable.
        System.out.print("Enter some characters with no decimal points or commas: ");
        String inputValue = reader.nextLine();
        System.out.print("Choose a character that was used in the previous string: ");
        String searchValue = reader.nextLine();
        int indexOf = inputValue.indexOf(searchValue);
        System.out.println("The index of the single value for the first time it shows up(that is in an array) is: " + indexOf);

        System.out.println(" ");
        //Create a List, populate it with values and then iterate thru those values outputting them to the console.  
        List<String> theCollectionName = new ArrayList<String>();
            theCollectionName.add("Food");
            theCollectionName.add("Stuff");
            theCollectionName.add("Minecraft");
            theCollectionName.add("Computer");

            for (String singleValue : theCollectionName){
                System.out.println(singleValue);
            }

        System.out.println(" ");

        // Why can you not create a List of 'char' or 'int'?
        /*
          When creating a collection or a list, you can use only Reference data types like String and Integer or a custom type.
          This allows the values placed inside the collection not to be tied to any positioned static number. Rather a reference to the String, Integer, or Custom.
          If you were to add specific primitive data types like just int, while creating the list, you would be limited to just that many
          index numbers; It is a not a dynamic collection anymore. That is the main difference between an array and collection/list.
         */


        //Create variables of appropriate data types, to store information regarding a lottery ticket
        // (i.e. GameName, WinningNumbers, Jackpot, DrawingDate, etc..).
        // Populate these variables and output them to the console.

        String gameName = "Powerball";
        String gameCost = "$2.00";
        String drawingDate = "1/12/2020";
        int jackpot = 296000000;
        byte powerballNumber = 3;
        List<Byte> drawingsCollection = new ArrayList<Byte>();
            drawingsCollection.add((byte) 3);
            drawingsCollection.add((byte) 21);
            drawingsCollection.add((byte) 23);
            drawingsCollection.add((byte) 31);
            drawingsCollection.add((byte) 59);
            drawingsCollection.add(powerballNumber);
        System.out.println("Game Name: " + gameName);
        System.out.println("Ticket Cost: " + gameCost);
        System.out.println("Drawing Date: " + drawingDate);
        System.out.println("Jackpot Amount: " + jackpot);
        for(byte singleBall : drawingsCollection){
            System.out.println("Ball Number: " + singleBall);
        }

    }

    private static void LessonLists(){
        //notes:    collections/lists
        List<String> myStringCollection = new ArrayList<String>();

        myStringCollection.add("1st String");
        myStringCollection.add("2nd String");
        myStringCollection.add("3rd String");
        myStringCollection.add("4th String");
        myStringCollection.add("5th String");

        System.out.println(myStringCollection);

        for(String singleString : myStringCollection){
            System.out.println(singleString);
        }

        List<Integer> myIntCollection = new ArrayList<Integer>();

        myIntCollection.add(10);
        myIntCollection.add(20);
        myIntCollection.add(30);
        myIntCollection.add(40);
        myIntCollection.add(50);

        System.out.println(myIntCollection);

        for(int singleInt : myIntCollection){
            System.out.println(singleInt);
        }

        //notes:    arrays

        String[] myStringArray = new String[5];

        myStringArray[0] = "1st";
        myStringArray[1] = "2nd";
        myStringArray[2] = "3rd";
        myStringArray[3] = "4th";
        myStringArray[4] = "5th";

        System.out.println(myStringArray);

        for(String singleString : myStringArray) {
            System.out.println(singleString);
        }

        myStringArray[5] = "6th";



    }

    private static void LessonStrings() {

        //notes:    strings have a value or not
        String firstString = "";
        //firstString = "something";
        firstString = null;

        if(firstString == null || firstString.isEmpty()){
            System.out.println("String is empty");
        }  else {
            System.out.println("String has a value");
        }

        //notes:    immutable - unable to be changed
        firstString = "another value";  //this creates a new string

        for(int x = 0; x <= 100; x++){
            firstString = "new value: " + Integer.toString(x);
            System.out.println(firstString);  //we are creating a new string for iteration.
            //VERY INEFFICIENT
        }

        //notes:    StringBuilder()
        StringBuilder myStringBuilder = new StringBuilder();

        for(int x = 0; x <= 100; x++) {
            myStringBuilder.append("new value with string builder: ")
                           .append(Integer.toString(x))
                           .append("\n");
        }
        System.out.println(myStringBuilder);


        //notes:    searching string (indexOf, lastIndexOf)
        String myName = "Justin";
        /*
        String can visualized as an array of characters.
         J   U   S   T   I   N
        [0] [1] [2] [3] [4] [5]

        note that the array is zero based. Starts at zero

        characters at index 2 is the letter "S"

        */

        int indexOf = myName.indexOf("s");
        System.out.print(indexOf);

        int lastIndexOf = myName.lastIndexOf("i");
        System.out.println(lastIndexOf);


        //notes:    enumerate a string
        String largeString = "This is a longer string than before";
        for(char c : largeString.toCharArray()){
            System.out.println(c);
        }

        //notes:    substring(beginning index) or substring(beginning index, end index)
        String partOfLargerString = largeString.substring(8, 16);
        System.out.println(partOfLargerString);
    }

    private static void LessonDataTypes() {
        //notes:    primative date types
        //          int (number)
        //          float (floating point .)
        //          double (larger number)
        //          boolean (true/false)
        //          char (character)

        //notes:    common data types
        boolean myBool = false;
        int myInt = 4;
        String myString = "some words";
        Date myDate = new Date();

        System.out.println(myBool);
        System.out.println(myInt);
        System.out.println(myString);
        System.out.println(myDate);

        //notes:    parsing or converting data types
        //notes:    convert a string to an int

        String numberString = "321";
        int intFromString = Integer.parseInt(numberString);

        System.out.println(intFromString);

        //notes:    int to string
        int i =312;
        String stringFromInt = Integer.toString(i);

        System.out.println(stringFromInt);

        //notes:    date to string
        String stringFromDate = myDate.toString();

        System.out.println(stringFromDate);

    }

    private static void LessonVariables(){


        //notes:    declaring multiple variable and setting value of variables
        String lastName = "Clem", firstName = "Justin";

        //notes:    output to the console
        System.out.println(firstName + " " + lastName);

        //notes: create a Scanner object
        Scanner reader = new Scanner(System.in);

        //notes: Prompt User
        System.out.print("Enter your name: ");

        //notes: read input from the user and store it in a variable
        String input = reader.nextLine();

        //notes: print the value back to the screen
        System.out.println("Hello " + input);
    }
}
