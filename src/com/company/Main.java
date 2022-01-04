// You've started on the right path but maybe understand some of Julies code in order to get to grips with file handling as the library systems
//and how to do it is all covered under Julies file handling and delimiters code
//Make sure all errors are cleared :)
package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Let's register your book");
        getBookDetails();
    }

    public static String getBookDetails() {
        String booktitle = getInput("Enter booktitle");
        int ISBN = Integer.parseInt(getInput("Enter your ISBN"));
        String author = getInput("Enter the author name <3333");
        String genre = getInput("Enter the genre <33333");

        return (booktitle + "%" + ISBN + "%" + author + "%" + genre + "&");

    }

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();

    }
}


// SO BASICALLY I NEARLY FINISHED THE RETURN VALUE