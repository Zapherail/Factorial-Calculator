package chat4_assign4.pkg2_sharprobert;
import java.util.Scanner;
/**
 * Robert Sharp
 * Programming 1
 * Feb 11th 2023
 * Professor Mitchell Frogge
 */
public class Chat4_Assign42_SharpRobert {

  
    public static void main(String[] args) {
        System.out.println("Welcome to the Factorial Calculator"); //Printing Header
        System.out.println(""); //Making a space
        Scanner sc = new Scanner(System.in); //Bringing in scanner
       
        String choice = "y"; //Creating the choic for continuing the loop
        while (choice.equalsIgnoreCase("Y")){ //creating the loop
            System.out.print("Enter an integer that's greater than 0 and less than 100: ");
            String userInput = sc.nextLine(); //Getting Input from user
            int userNum = Integer.parseInt(userInput); //Making that input to a num
            long fact = 1; //Making the factorial 
            for (int sum = 1; sum <= userNum; sum++){
                fact *= sum;               
            }
            System.out.println("The factorial of " + userNum + " " + "is" + " " + fact + ".");
         System.out.print("Continue? (y/n): ");
         choice = sc.nextLine();
        }     
    }
    
}
