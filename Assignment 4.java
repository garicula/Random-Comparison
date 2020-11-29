// Garrick Morley
// ISYS 216 001, Fall 2019
// Dr. Kinuthia
// Assignment Four Source

////////////////////////////////////////////////////////////////////
//This program gets user and random numbers and compares the total//
////////////////////////////////////////////////////////////////////

package morleygassignmentfour;

//import necessary items
import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class MorleyGAssignmentFour {
   
    //main class
    public static void main(String[] args) throws IOException {
    
    //declare variables for user output file
    int num = 1;
    int enters = 0;
    
    //make user input file
    PrintWriter outputFile = new PrintWriter("userFile.txt");
    
    //get numbers from the user
    while (num >= 1 && num <= 1000){
        
        //use scanner to collect numbers
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 1000: ");
            num = keyboard.nextInt();  
        
        //make sure number is within acceptable range    
        if (num >= 1 && num <= 1000){    
            outputFile.println(num);
            enters++;}
        else if (num < 1){
            System.out.println("you have exited the file");
        }
        else if (num > 1000){
            System.out.println("you have exited the file");
        }
               
    } 
    //close user numbers file
    outputFile.close();
    //System.out.println("User data has been written");
    
    //make pc random output file
    PrintWriter randomFile = new PrintWriter("pcFile.txt");
    
    //declare integers for random part
    int grow = 0;
    int rand = 0;
    
    //get random numbers from PC
    while (grow < enters){
        grow++;
        Random numbers = new Random();
            rand = numbers.nextInt(1001);
            randomFile.println(rand);}
    
    //close random numbers file    
    randomFile.close();
    //System.out.println("Random data has been written");
    
    //open user file for reading
    File myFile = new File("userFile.txt");
    Scanner inputFile = new Scanner(myFile);
    
    //declare variables for user sum
    int rise = 0;
    int sum = 0;
    
    //open and get sum of user entered numbers
    while (rise < enters){
        rise++;
        String line = inputFile.nextLine();
        int nums = Integer.parseInt(line);
        sum = sum + nums;
        }
       
    //open random file for reading
    File myFile2 = new File("pcFile.txt");
    Scanner inputFile2 = new Scanner(myFile2);
        
    //declare variables for random sum
    int rise2 = 0;
    int sum2 = 0;
    
    //open and get sum of random numbers
    while (rise2 < enters){
        rise2++;
        String line = inputFile2.nextLine();
        int nums = Integer.parseInt(line);
        sum2 = sum2 + nums;
        }
    
    //print the total of user entered numbers
    System.out.println("Total User Generated Amount\n" + sum);
    
    //print the total of computer generated numbers
    System.out.println("Total Computer Generated Amount\n" + sum2);
    
    //determine whether user or computer had more sales and print result
    if (sum > sum2){
        System.out.println("The user had more total sales than the computer.");}
    else if (sum < sum2){
        System.out.println("The computer had more total sales than the user.");}
    else{
        System.out.println("The user and computer tied for total sales.");}   
    }    
}

