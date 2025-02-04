/***************************************************************************************
 * Title: Towers of Hanoi Source Code
 * Author: Liang, Y. Daniel
 * The following code is modified as per the assignment instructions
 * Name: Juliana Serrano
 * Date: 01/xx/2024
 * Assignment: Lab 1 - Recursion - Program 1
 * Description: [blank]
***************************************************************************************/
import java.util.Scanner; 

public class TowersOfHanoi {
  public static int moves = 0;
  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of disks: ");
    int n = input.nextInt();

    // Find the solution recursively
    System.out.println("The moves are:");
    moveDisks(n, 'A', 'B', 'C');
    System.out.print("Total Number of Moves: ");
    System.out.println(moves + 1);
  }

  /** The method for finding the solution to move n disks
      from fromTower to toTower with auxTower */
  public static void moveDisks(int n, char fromTower,
      char toTower, char auxTower) {
    if (n == 1) { // Stopping condition
      System.out.println("Move disk " + n + " from " +
        fromTower + " to " + toTower);
    }
    else {
      moves++;
      moveDisks(n - 1, fromTower, auxTower, toTower);
      System.out.println("Move disk " + n + " from " +
        fromTower + " to " + toTower);
      moves++;
      moveDisks(n - 1, auxTower, toTower, fromTower);
    }
  }
}
