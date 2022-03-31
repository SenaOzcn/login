import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      String userName, password, newUserName, newPassword;
      int select;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter your username: ");
      userName = input.nextLine();

      System.out.print("Enter your password: ");
      password = input.nextLine();

      if (userName.equals("username") && password.equals("password")) {
          System.out.println("You are logged in!");
      } else {
          System.out.println("Your username or password is incorrect.");
          System.out.println("Ops something went wrong! Change your username or password.");
          System.out.println("1-Username\n2-Password");
          select = input.nextInt();
          if (select == 1) {
            System.out.println("Enter your new username: ");
            input.nextLine();
            newUserName = input.nextLine();
            if (newUserName.equals("username")) {
                System.out.println("Your new username cannot be the same as the old username.");
            }
            else {
                System.out.println("Your username has been changed.");
            }
          }
          else if (select == 2) {
              System.out.println("Enter your new password: ");
              input.nextLine();
              newPassword = input.nextLine();
              if (newPassword.equals("password")) {
                  System.out.println("Your new password cannot be the same as the old password.");
              } else {
                  System.out.println("Your password has been changed.");
              }
          }
      }
    }
}
