import java.util.Scanner;

public class start {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String Messages = """
        --------Welcome TO Smart Banking Management System------
        1) Login Account
        2) Create Account
        3) Help
          """;

        int choise = 9;
       while(choise>0){
           System.out.println(Messages);
           System.out.println("Enter Your Option:");
           choise = sc.nextInt();
        switch (choise){
            //Account login
           case 1:
          System.out.println();
          System.out.println("Enter Your Username:");
          String username = sc.next();
          System.out.println("Enter Your Password:");
          String password = sc.next();
            break;
            // Account Creation
            case 2:
            System.out.println("Enter First Name:");
            String FirstName = sc.next();
            System.out.println("Enter Last Name:");
            String LastName = sc.next();
            System.out.println("Enter UserName:");
            String userName = sc.next();
            System.out.println("Enter Your PassWord:");
            String Password = sc.next();
            System.out.println("Thanks Created! Now You can Use Our Servieces!");
           break;
            case 3:
            break;
            default:



        }
       }

    }
}
