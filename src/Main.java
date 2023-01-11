import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<Student>();
        System.out.println("Welcome to the Eatrium, please input your full name (first name + last name)");
        String userName = scanner.nextLine();
        if (userName == null || userName.equals("")){
            while (userName == null || userName.equals("")) {
                System.out.println("Cannot leave this empty. Please input your full name.");
                userName = scanner.nextLine();
            }
        }
        Student thisStudent = new Student(userName);
        studentList.add(thisStudent);
        System.out.println("Hello " + userName);
        String userAction = "";
        while (!userAction.equalsIgnoreCase("exit")){
            System.out.println("Input 1 to check past orders and input 2 to make a new order. Input 'exit' at any time to leave");
            userAction = scanner.nextLine();
            if (userAction.equalsIgnoreCase("1")) {
                System.out.println("Your orders are as follows: \n" + thisStudent.getOrder());
            }
            else if (userAction.equalsIgnoreCase("2")) {
                System.out.println("Would you like breakfast, lunch, or snack?");
                String mealChoice = scanner.nextLine();
                while(!(mealChoice.equalsIgnoreCase("breakfast")||mealChoice.equalsIgnoreCase("lunch")||mealChoice.equalsIgnoreCase("snack"))){
                    System.out.println("Error: Your input does not exist - Would you like breakfast, lunch, or snack?");
                }
                if (mealChoice.equalsIgnoreCase("breakfast")){
                    System.out.println("What breakfast option would you like");
                    String breakfastName = scanner.nextLine();
                    if (breakfastName == null){
                        System.out.println("You cannot leave that empty");
                        breakfastName = scanner.nextLine();
                    }
                    else {
                        Breakfast breakfastItem = new Breakfast(breakfastName);
                        thisStudent.breakfastItems.add(breakfastItem);
                        System.out.println("Success");
                    }
                }
                else if (mealChoice.equalsIgnoreCase("lunch")){
                    System.out.println("What lunch option would you like");
                    String lunchName = scanner.nextLine();
                    if (lunchName == null){
                        System.out.println("You cannot leave that empty");
                        lunchName = scanner.nextLine();
                    }
                    else {
                        Lunch lunchItem = new Lunch(lunchName);
                        thisStudent.lunchItems.add(lunchItem);
                        System.out.println("Success");
                    }
                }
                else if (mealChoice.equalsIgnoreCase("snack")){
                    System.out.println("What snack option would you like");
                    String snackName = scanner.nextLine();
                    if (snackName == null){
                        System.out.println("You cannot leave that empty");
                        snackName = scanner.nextLine();
                    }
                    else {
                        Snack snackItem = new Snack(snackName);
                        thisStudent.snackItems.add(snackItem);
                        System.out.println("Success");
                    }
                }
            }
        }
    }
}
