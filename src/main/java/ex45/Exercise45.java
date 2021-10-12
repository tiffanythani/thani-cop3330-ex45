/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Tiffany Thani
 */
package ex45;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise45 {
    public static void main(String[] args) throws IOException {
        // makes sure that the path is passed to the file as a parameter

        File file = new File("C:\\Users\\tiffany\\Desktop\\exercise45_input.txt");
        Scanner scan = new Scanner(file);

        // prompts input from user via console

        Scanner s = new Scanner(System.in);
        //asks user for the name of output file

        System.out.print("\nEnter the name of Output File : ");

        String outputfile = s.next();

        // creates a filewriter object so you can write into a file


        FileWriter writer = new FileWriter("C:\\Users\\tiffany\\Desktop\\" + outputfile);




        try {

            // using while loop read file

            while (scan.hasNext()) {

                // reads the whole line

                String user = scan.nextLine();

                // replaces the word utilize with use

                user = user.replaceAll("utilize", "use");

                // writes into outputfile

                writer.write(user);

                writer.write("\n");


            }
        } finally {
            scan.close();
        }


        writer.close();

        System.out.println("\nSuccessfully Modified!!");

    }
}
