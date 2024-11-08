import java.util.Scanner;
//globally declared input method
static Scanner input = new Scanner(System.in);

//globally declared integers
static int day1CalConsumed, day1CalBurned, day2CalConsumed, day2CalBurned,
day3CalConsumed, day3CalBurned, day4CalConsumed, day4CalBurned,
day5CalConsumed, day5CalBurned, day6CalConsumed, day6CalBurned,
day7CalConsumed, day7CalBurned;

//output daily questions and ask for user input
public static void getUserInput() {
    //get user input

    //Day 1
    System.out.println("Enter calories consumed for day #1:");
    day1CalConsumed = input.nextString();

    System.out.println("Enter calories burned for day #1:");
    day1CalBurned = input.nextString();

    //Day 2
    System.out.println("Enter calories consumed for day #2:");
    day2CalConsumed = input.nextString();

    System.out.println("Enter calories burned for day #2:");
    day2CalBurned = input.nextString();

    //Day 3
    System.out.println("Enter calories consumed for day #3:");
    day3CalConsumed = input.nextString();

    System.out.println("Enter calories burned for day #3:");
    day3CalBurned = input.nextString();


    //Day 4
    System.out.println("Enter calories consumed for day #4:");
    day4CalConsumed = input.nextString();

    System.out.println("Enter calories burned for day #4:");
    day4CalBurned = input.nextString();

    //Day 5
    System.out.println("Enter calories consumed for day #5:");
    day5CalConsumed = input.nextString();

    System.out.println("Enter calories burned for day #5:");
    day5CalBurned = input.nextString();

    //Day 6
    System.out.println("Enter calories consumed for day #6:");
    day6CalConsumed = input.nextString();
    
    System.out.println("Enter calories burned for day #6:");
    day6CalBurned = input.nextString();

    //Day 7
    System.out.println("Enter calories consumed for day #7:");
    day7CalConsumed = input.nextString();

    System.out.println("Enter calories burned for day #7:");
    day7CalBurned = input.nextString();

}

//method to calculate total amount of calories burned for the week
public static double calculateCalories() {
    //formula to calculate calories
}

//display calories calculated for the week to output
public static void displayCalories() {
    //print calculated calories to output
}

//Calories Calclulator class
public class CalorieCalculator {

    //ask for userinput for the two daily questions
    public static void getUserInput() {
         
    }

    //function main
    public static void main(String[] args) {
        int count;
        double calories;

        getUserInput();

        calculateCalories();

        displayCalories();
    }
}