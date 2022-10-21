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
    
    System.out.println("How long would you like the password to be?");
    
    generatePassword(8);
    
    s.close();
  } // end main method
  
  /*
   * Name: generatePassword
   * Purpose: generate a random password
   * Input: length of password (int)
   * Return: the password (String)
   */
  public static String generatePassword(int length) {
      String password = "";
      //loop 'length' times
      for(int i = 0; i < length; i++) {
      //generate a random number
      //65-90 cap. letters
      //97-122 lower. letters
      //33-47 special char.
      
      int max = 90;
      int min = 65;
      int rand = (int)(Math.random()*(max-min+1)+min);
      
      //convert the random int to char, ex: c  =(char)i;
      char c = (char)rand;
      
      //add the char to password
      password += c; 
      System.out.println(password);
    }
      return password;
  } //end generatePassword method
  
  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method
}// end class
