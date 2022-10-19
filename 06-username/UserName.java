import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter your favorite number: ");
    String favnumber = s.nextLine();
    System.out.print(" Are you a teacher or student? : ");
    String school = s.nextLine();
    
    if (school.equalsIgnoreCase( "student")){
        System.out.println("Your email is " + firstName + getInitial(lastName) + favnumber + "@nycstudents.net");
    }//end if
    else {
        System.out.println("Your email is "+ getInitial(firstName) + lastName + favnumber + "@schools.nyc.gov");
    } // end else
    s.close();
  } // end main method

  /*
   * Name: getInitial
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String getInitial(String n) {
    return n.substring(0, 1);
  } // end initialize method

} // end class
