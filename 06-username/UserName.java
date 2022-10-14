import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
    
    // get String input from user
    System.out.print("Are you a student or a teacher?");
    String choice = s.nextLine();
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter your favorite number: ");
    String favnumber = s.nextLine();
    
    // test output
    if(choice.equalsIgnoreCase("Student")) {
        System.out.print((firstName+initialize(lastName)+favnumber+"@nycstudents.net").toLowerCase());
    }
    else if (choice.equalsIgnoreCase("Teacher")) {
        System.out.print((initialize(firstName)+lastName+favnumber+"@schools.nyc.gov").toLowerCase());
    }
    else {
        System.out.print("Please enter 'Student' or 'Teacher'");
    }
    s.close();
  } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method

} // end class
