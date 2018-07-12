// Program Name:   RightTriangle.java
//Course Name:    CSE1301(java) Section 002
//Student Name:   Juan Aguirre
// Assignment:   Lab2
// Due Date:     8/28/14         
// Purpose:Compute the length of the hypotenuse of a right triangle,given the lengths of the sides.With Forumla A^2 +B^2=C^2,with then taking the square root of C. 

import java.util.Scanner;
//import java.lang 

public class RightTriangle
{
   public static void main (String[] args)
   {
      double side1, side2;  // lengths of the sides of a right triangle
      double hypotenuse;    // length of the hypotenuse
   
      Scanner scan = new Scanner(System.in);
   
      // Get the lengths of the sides as input
      System.out.println ("Please enter the lengths of the two sides of " +
                          "a right triangle (separate by a blank space): ");
      side1 = scan.nextDouble();
      side2 = scan.nextDouble();
      
      // Compute the length of the hypotenuse      
      // hypotenuse =Math.pow(side1, 2)+ Math.pow(side2,2);
   //       hypotenuse = Math.sqrt(hypotenuse);
      hypotenuse = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
      
      
      // Print the result
      System.out.println ("Length of the hypotenuse: " + hypotenuse);
      
      System.out.println("This program written by juan aguirre");
   
   }
}
