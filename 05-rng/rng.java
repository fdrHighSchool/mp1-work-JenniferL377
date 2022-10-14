/**
 * Write a description of class rng here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.Random;

public class rng
{       
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Pick a game mode: Easy/Medium/Hard");
        String mode = input.nextLine();
        
        if(mode.equals("Easy")) {
            System.out.println("Easy Mode");
            System.out.println("I'm thinking of a number between 1 and 10");
        }
        else if (mode.equals("Medium")) {
            System.out.println("Medium Mode");
            System.out.println("I'm thinking of a number between 1 and 50");
        }
        else if(mode.equals("Hard")) {
            System.out.println("Hard Mode");
            System.out.println("I'm thinking of a number between 1 and 100");
        }
        
        System.out.println("(including both). Can you guess what it is?");
        
        System.out.println("Type a number: ");
        int guess = input.nextInt();
        
        int maximum;
        if (mode.equals("Easy")) {
                maximum = 10;
            }
            else if (mode.equals("Medium")) {
                maximum = 50;
            }
            else if (mode.equals("Hard")) {
                maximum = 100;
            }
        int number = random.nextInt(maximum) + 1;
        System.out.println("Your guess was: "+guess);
        System.out.println("The number I was thinking of is: "+number);
        System.out.println("You were off by "+Math.abs(guess-number));
        } //end main method
    } //end class