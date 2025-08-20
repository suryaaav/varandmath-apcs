class Main {
  public static void main(String[] args) {

    //Use the // to create single line comments to either add info or to take out code for debugging
    
    

    //We will be using System.out.println and System.out.print throughout the year. Try using both below to see what the difference is!



    //ANSWER: System.out.println("hi");


    //Throughout the year this year we will need to store information. For that we will be using VARIABLES!

    //Java is an Object-Oriented programming language. All variables we use this year will either be OBJECTS or PRIMITIVES

    //There are 8 primitives in Java: int, byte, short, long, float, double, boolean, char

    //For AP we need to know: int, double, boolean

    //List examples of the types below and give definition
    //int (integer): 4, 5, 9
    //double: 4.5, 6.7, 8.4
    //boolean: true, false

    //For now we are just going to work with primitive

    //Create 3 variables of each of the above types (USE GOOD CODING PRACTICE WHEN CREATING THE VARIABLES
//int age = 14;
//double mass = 45.6;
//boolean isAdult = false;





    //MATH TIME!

    //What are the math operators that we can use?
    //+ - * / %

    //Try doing some math operations with numbers. How can we check to see if the math worked?

    //Create codes that will print the following:

    //Odd integers from 1 to 100, inclusive of both

for (int num = 1; num <= 100; num += 2){
    System.out.println(num);
  }


    //All multiples of 3 from 1 to 100

for (int num1 = 3; num1 <= 100; num1 +=3){
  System.out.println(num1);
}


    //Starting at 1000, print on the same line (with a - [hypthen] between each) all of the numbers that end in 0 going down to 0

  for(int i =1000; i>=0; i -=10){
    System.out.print(i);
    if (i>0){
      System.out.print("-");
    }
  }

  }
}
