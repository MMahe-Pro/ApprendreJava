// |||Parsing, reading inputs and exceptions|||

package parseAndConsole;

// To use Scanner object, we have to import it
import java.util.Scanner;

public class Main {
	//////////////////////////////////////////
    public static void main(String[] args) {

        int currentYear = 2022;
        
        // Display of our methods
        
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }
    //////////////////////////////////////////
    
    public static String getInputFromConsole(int currentYear) {
    	
    	// Asking for user's name ...
        String name = System.console().readLine("Hi, What's your Name? ");
        // ... displaying it.
        System.out.println("Hi " + name + ", Thanks for taking the course!");
        
        // Asking for user's birth year ...
        String dateOfBirth = System.console().readLine("What year were you born? ");
        // ... parsing it ...
        int age = currentYear - Integer.parseInt(dateOfBirth);
        
        // ... and returning it.
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
    	// Creating new Scanner object instance named "scanner"
        Scanner scanner = new Scanner(System.in);

        // Asking for user's name ...
//        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi, What's your Name? ");
        // ... using nextLine method on scanner (our instance of Scanner)
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");

//        String dateOfBirth = System.console().readLine("What year were you born? ");
        System.out.println("What year were you born? ");
        
        boolean validDOB = false;
        int age = 0;
        
        // While year given is not valid, we repeat the process :
        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + (currentYear));
            // To avoid the use of incorrect characters, we use a try ... catch :
            try {
                age = checkData(currentYear, scanner.nextLine());
                // Use of a ternary expression :
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!!! Try again.");
            }
        } while (!validDOB);

        return "So you are " + age + " years old";
    }
    
    // Method to check if year given is valid
    public static int checkData(int currentYear, String dateOfBirth) {

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }
}


