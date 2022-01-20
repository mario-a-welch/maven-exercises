import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;

        //Grants user the ability to input
        System.out.println("Enter Something: ");
        userInput = sc.nextLine();

        //Prints userInput to console
        System.out.println("You entered: " + userInput);

        //Checks if userInput is number or not
        if(StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is a number.");
        } else{
            System.out.println(userInput + " is not a number.");
        }

        //Swaps case of userInput by using StringUtils.swapCase()
        System.out.println("Flipped case: " + StringUtils.swapCase(userInput));

        //Reverses userInput by using StringUtils.reverse()
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }
}
