// Program Name      StringPlay.java
//Course:             CSE1301(java) Section 002         
//Student Name:      Juan Aguirre
//Assignment#        Lab2
//Due Date:          08/28/2014
// Purpose: Play with String objects

public class StringPlay
{
   public static void main (String[] args)
   {
    
     
      String college = new String ("PoDunk College");
   
      String town = new String("Anytown USA"); // part (a)
   
      int stringLength;
      String change1, change2, change3; 
   
      stringLength = college.length();
      
      System.out.println (college + " contains " + stringLength + " characters.");
   
      change1 = college.toUpperCase(); // part (c)
      
      System.out.println ("Change1 is "  + change1);
   
      change2 = change1.replace('O','*'); // part (d)
   
      System.out.println ("Change 2 is " + change2);
   
      change3 = college.concat(" ").concat(town); // part (e)
      
      System.out.println ("The final string is " + change3);
      System.out.println("This program written by juan aguirre");
   }
}
