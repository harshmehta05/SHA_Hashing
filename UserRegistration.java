import java.util.*;
public class UserRegistration
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter username");
    String username = sc.next();
    System.out.println("Enter password");
    String password = sc.next();
    if (password.length() < 5){
      System.out.println("Invalid Password!");
    }
  }
}
