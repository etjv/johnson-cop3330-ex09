/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Edmund Johnson V
 */

/*
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.
Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] arg){
        int length = getLength();
        int width = getWidth();
        System.out.println(output(length, width));
    }

    private static Integer getLength(){
        System.out.print("Enter the length of the room: ");
        String x = in.nextLine();
        return Integer.parseInt(x.replace(" ", ""));
    }

    private static Integer getWidth(){
        System.out.print("Enter the width of the room: ");
        String x = in.nextLine();
        return Integer.parseInt(x.replace(" ", ""));
    }

    private static String output(int l, int w){
        DecimalFormat d = new DecimalFormat("#");
        float x = (l * w);
        float g = x / 350;
        return "You will need to purchase " + (int)Math.ceil(g) + " gallons of paint to cover " + (int)x + " square feet.";
    }
}
