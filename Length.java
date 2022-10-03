import java.util.Scanner;
public class Length {
  public static void main(String[] args){

   Scanner in = new Scanner(System.in);

   String original_String = "", subtraction_String = "";
   int num_characters = 0, from = 0, until = 0;

   System.out.print("Enter a string of characters: ");
   original_String = in.nextLine();

   num_characters = original_String.length();
   
   System.out.println("Characters string: " + original_String + " has " +  num_characters + " characters.");

   System.out.print("What character do you want to get the new string from (index)?");
   from = in.nextInt();

   System.out.print("Until what character do you want to get the new string (index)?");
   until = in.nextInt();

   subtraction_String = original_String.substring(from, until);
   System.out.println("The new string is: " + subtraction_String);

 }
}

