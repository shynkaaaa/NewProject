import java.util.*;
public class TripPlanner {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        greeting();
        travelTimeBudget();
        timeDifference();
        countryArea();
        nextDestination();
    }
    public static void greeting() {
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name: ");
        String name = sc.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you traveling to? ");
        String place = sc.nextLine();
        System.out.println("Great! " + place + " sounds like a great trip");
    }

    public static void travelTimeBudget() {
        System.out.print("How many days are you going to spend traveling? ");
        int days = sc.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip: ");
        double money = sc.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = sc.next();
        System.out.print("How many " + currency + " are there in 1 USD? ");
        double value = sc.nextDouble();
        System.out.println("If you are traveling for " + days + " days that is same as " + (days * 24) + " hours or " +
                (days * 24 * 60) + " minutes or " + (days * 24 * 60 * 60) + " seconds.");
        double moneyPerDay = money / days;
        moneyPerDay *= 100;
        moneyPerDay = (int) moneyPerDay;
        moneyPerDay /= 100.0;
        System.out.println("If you are going to spend $" + (int) money + " USD than means per day you can spend up to $" +
                moneyPerDay + " USD");
        double totalBudget = value * money;
        totalBudget *= 100;
        totalBudget = (int) totalBudget;
        totalBudget /= 100.0;
        double dailyTotalBudget = totalBudget / days;
        dailyTotalBudget *= 100;
        dailyTotalBudget = (int) dailyTotalBudget;
        dailyTotalBudget /= 100;
        System.out.println("Your total budget in " + currency + " is " + totalBudget + " " + currency +
                ", which per day is " + dailyTotalBudget + " " + currency);
    }
    public static void timeDifference() {
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int diff = sc.nextInt();
        System.out.println("That means that when it is midnight at home it will be " + ((24 + diff) % 24) +
                ":00 in your travel destination and when it's noon at home it will be " + ((12 + diff) % 24) + ":00");
    }
    public static void countryArea() {
        System.out.print("What is square area of your destination country in km2? ");
        double area = sc.nextDouble();
        area *= 0.38610215854245;
        area *= 100;
        area = (int)area;
        area /= 100.0;
        System.out.println("In miles2 that is " + area);
    }
    public static void nextDestination() {
        System.out.print("How many places you traveled to : ");
        int number = sc.nextInt();
        String [] countries = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter the name: ");
            countries[i] = sc.next();
        }
        System.out.println("Next place you want to travel to : ");
        String[] places = {"Italy", "England", "Netherlands", "Germany", "Australia"};
        for (int i = 0; i < places.length; i++) {
            System.out.println(i + ": " + places[i]);
        }
        System.out.print("Thank you, Your next location is : " + places[sc.nextInt() - 1]);
    }
}