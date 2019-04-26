// This program is responsible for linear equations

package first.first.linear;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
    float x, y;
    Scanner input = new Scanner(System.in);
    System.out.println("You are going to solve the linear equation:");
    System.out.println("ax + b = 0");
    System.out.println("Please enter <a>");
    x = input.nextFloat();
    while (x == 0) {
        System.out.println("a - cannot be equal to zero");
        System.out.println("Please enter a different number");
        x = input.nextFloat();
    }

    System.out.println("Please enter <b>");
    y = input.nextFloat();
    Integer temp_prec;
    String prec;
    System.out.println("How accurate the answer should be?");
    System.out.println("Please indicate number of digits after comma:");
    temp_prec = input.nextInt();
    prec = temp_prec.toString();
    String acc = "%." + prec + "f";
    float result = solve_method(x,y);
    System.out.println("x equals:");
    System.out.printf(acc,result);


    }

    public static float solve_method (float a, float b) {
    float result = (0 - b)/a;
    return  result;
    }
}
