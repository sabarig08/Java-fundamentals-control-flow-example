import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // 2. Check if the number is positive, negative, or zero using if-else
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // 3. Print the day of the week based on the number using switch-case
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid day of the week.");
        }

        // 4. Print the numbers from 1 to the user's number using while loop
        int i = 1;
        System.out.println("Numbers from 1 to " + number + ":");
        while (i <= number) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // 5. Print the numbers down from the user's number using while loop
        System.out.println("Numbers down from " + number + ":");
        while (number > 0) {
            System.out.print(number + " ");
            number--;
        }
        System.out.println();

        // 6. Print the numbers from 1 to 3, demonstrating that the block executes at least once using do-while loop
        int j = 1;
        System.out.println("Numbers from 1 to 3 using do-while loop:");
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 3);

        scanner.close();
    }
}
