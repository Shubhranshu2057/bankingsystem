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
            System.out.println("Enter DateOfBirth Fromate DD/MM/YYYY:");
            String dob = sc.next();
            System.out.println("Enter UserName:");
            String userName = sc.next();
            System.out.println("Enter Your PassWord:");
            String Password = sc.next();
            System.out.println("Thanks Created! Now You can Use Our Servieces!");
           break;

           // Help Center
            case 3:
              int inpu=0;
              String helpmessage = """
               -------Help Center------
               1)Forget Password
               2)Forget Username
               0)Exit
                      """;
                System.out.println(helpmessage);
                System.out.println("Enter Your Option:");
                inpu = sc.nextInt();
              while(inpu>0){
                  if(inpu==1){
                      System.out.println("Enter Your Username:");
                      String userforget = sc.next();
                      System.out.println("Enter Your DOB");
                      String userdob = sc.next();
                      System.out.println("Enter Your New Password:");
                      String newpassword = sc.next();
                      System.out.println("Your Password Has Benn Succesfully Updated!");
                      inpu =0;
                      break;
                  }
                  else if(inpu==2){
                      String uname = "demoxyz";
                      System.out.println("Enter Your First Name");
                      String userfirst = sc.next();
                      System.out.println("Enter Your Last Name:");
                      String userLast = sc.next();
                      System.out.println("Enter Your DOB:");
                      String userdob = sc.next();
                      System.out.println("Your Username is:"+uname);
                      inpu =0;
                      break;
                  }
                  else{
                      System.out.println("Enter Valid Options");
                      break;
                  }
              }
            break;
            default:
        }
       }

    }
}
