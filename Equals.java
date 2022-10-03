import java.util.Scanner;

public class Equals{
  public static void main(String[] args){

   Scanner in = new Scanner(System.in);
   
   String name_1 = "", name_2 = "";
   
   System.out.print("Write the first name, please: ");
   name_1 = in.nextLine();

   System.out.print("Write the second name, please: ");
   name_2 = in.nextLine();
   
   if(name_1.equals(name_2)){   //if(name_1.equalsIgnoreCase(name_2)){ if you want that your program doesn't care the text
    System.out.println("Names are the same");
   } else {
    System.out.println("Names are the differents");
   }
 }
}

