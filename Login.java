import java.util.Scanner;

public class Login{
  public static void main(String[] args){

   Scanner in = new Scanner(System.in);
   
   String user = "", password = "";
   
   System.out.print("Write your user name: ");
   user = in.nextLine();

   System.out.print("Write your password: ");
   password = in.nextLine();
   
   if(user.equals("earr") && password.equals("123456")){
    System.out.println("Successful login");
   } else {
    System.out.println("Wrong User name or Password, please check");
   }
 }
}

