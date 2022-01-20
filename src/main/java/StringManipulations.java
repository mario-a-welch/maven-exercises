import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;

        System.out.println("Enter Something: ");
        userInput = sc.nextLine();

        System.out.println("You entered: " + userInput);
        if(StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is a number.");
        } else{
            System.out.println(userInput + " is not a number.");
        }
        System.out.println("Flipped case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }
}
