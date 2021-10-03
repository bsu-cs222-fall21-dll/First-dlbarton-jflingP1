package edu.bsu.View;

import java.util.Scanner;

public class UserInput {
    public String gainUserInput(){
        String userInput;
        try{
            Scanner requestSearch = new Scanner(System.in);
            System.out.println("Enter Article Name:");
            userInput = requestSearch.nextLine();
        }   catch (Exception EmptySearchException) {
                userInput = "";
        }
        if (userInput.equals("")) {
            System.err.println("Please input Article Name");
            System.exit(1);
        }
        return userInput;
    }
}
