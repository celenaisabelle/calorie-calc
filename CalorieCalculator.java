import java.util.Scanner;
//Calories Calclulator class
public class CalorieCalculator {

    //globally declared input method
    static Scanner input = new Scanner(System.in);

    //globally declared integers
    static int day1CalConsumed;
    static int day1CalBurned;
    static int day2CalConsumed;
    static int day2CalBurned;
    static int day3CalConsumed;
    static int day3CalBurned;
    static int day4CalConsumed;
    static int day4CalBurned;
    static int day5CalConsumed;
    static int day5CalBurned;
    static int day6CalConsumed;
    static int day6CalBurned;
    static int day7CalConsumed;
    static int day7CalBurned;

    static int totalCaloriesConsumed;
    static int totalCaloriesBurned;

    static double averageCaloriesConsumed;
    static double averageCaloriesBurned;
    static double netWeeklyPounds;

    //output daily questions and ask for user input
    public static void getUserInput() {

        //Day 1
        System.out.println("Enter calories consumed for day #1:");
        day1CalConsumed = input.nextInt();

        System.out.println("Enter calories burned for day #1:");
        day1CalBurned = input.nextInt();

        //Day 2
        System.out.println("Enter calories consumed for day #2:");
        day2CalConsumed = input.nextInt();

        System.out.println("Enter calories burned for day #2:");
        day2CalBurned = input.nextInt();

        //Day 3
        System.out.println("Enter calories consumed for day #3:");
        day3CalConsumed = input.nextInt();

        System.out.println("Enter calories burned for day #3:");
        day3CalBurned = input.nextInt();

        //Day 4
        System.out.println("Enter calories consumed for day #4:");
        day4CalConsumed = input.nextInt();

        System.out.println("Enter calories burned for day #4:");
        day4CalBurned = input.nextInt();

        //Day 5
        System.out.println("Enter calories consumed for day #5:");
        day5CalConsumed = input.nextInt();

        System.out.println("Enter calories burned for day #5:");
        day5CalBurned = input.nextInt();

        //Day 6
        System.out.println("Enter calories consumed for day #6:");
        day6CalConsumed = input.nextInt();
        
        System.out.println("Enter calories burned for day #6:");
        day6CalBurned = input.nextInt();

        //Day 7
        System.out.println("Enter calories consumed for day #7:");
        day7CalConsumed = input.nextInt();

        System.out.println("Enter calories burned for day #7:");
        day7CalBurned = input.nextInt();
    
    }

    //method to calculate total amount of calories burned & consumed by week
    public static void calculateCalories() {

        //sum of inputs for calories consumed
        totalCaloriesConsumed = day1CalConsumed + day2CalConsumed + day3CalConsumed + day4CalConsumed + day5CalConsumed + day6CalConsumed + day7CalConsumed;

        //sum of inputs for calories burned
        totalCaloriesBurned = day1CalBurned + day2CalBurned + day3CalBurned + day4CalBurned + day5CalBurned + day6CalBurned + day7CalBurned;

        //average calories consumed per day
        averageCaloriesConsumed = totalCaloriesConsumed / 7.0;

        //average calories burned per day
        averageCaloriesBurned = totalCaloriesBurned / 7.0;

        netWeeklyPounds = (double)(totalCaloriesBurned - totalCaloriesConsumed) / 3000.0;
    }

    //display calories calculated for the week to output
    public static void displayCalories() {
        //print calculated calorie calculation totals to output
        System.out.println("You consumed a total of " + totalCaloriesConsumed + " this week.");
        System.out.println("You burned a total of " + totalCaloriesBurned + " calories this week.");

        //print averages to output
        System.out.print("You consumed an average of ");
        System.out.printf("%,.2f", averageCaloriesConsumed);
        System.out.println(" calories a day.");

        System.out.print("You burned an average of ");
        System.out.printf("%,.2f", averageCaloriesBurned);
        System.out.println(" calories a day.");

        //print weekly gain/loss
        System.out.print("Your net weekly gain/loss were ");
        System.out.printf("%,.3f", netWeeklyPounds);
        System.out.println(" pounds.");

    }


    //function main
    public static void main(String[] args) {
        //calling created methods to run program
        getUserInput();

        calculateCalories();

        displayCalories();
    }
}