import assets.Accounts;
import assets.accountsuse;

import java.util.Scanner;

public class start {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int size = 500;
        int accountCount =0;
        accountsuse[] accountdb = new accountsuse[size];
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

               // login data entery
          System.out.println();
          System.out.println("Enter Your Username:");
          String username = sc.next();
          System.out.println("Enter Your Password:");
          String password = sc.next();
         for(int i=0;i<accountCount;i++){
             String usernamedb = accountdb[i].getUsername();
             String userpassdb = accountdb[i].getPassword();

             if(usernamedb.equals(username)&&userpassdb.equals(password)){
                 if(accountdb[i].getAttempts()>=3){
                     System.out.println("Account Blocked Retry After 24 Hours Or contact support!");
                     break;
                 }
              System.out.println("SuccessFull Logging!");
             }

             // invalid password with 3 times blocked
             else if(usernamedb.equals(username)){
                 accountdb[i].setAttempts(accountdb[i].getAttempts()+1);
                 if(accountdb[i].getAttempts()>=3){
                     System.out.println("Account Blocked Retry After 24 Hours Or contact support!");
                     break;
                 }
                 System.out.println("Incoorect Password!");
                 break;
             }

             // Username Invalid
             else {
                 System.out.println("UserName Invalid!");
                 break;
             }
         }
            break;

            // Account Creation
            case 2:
            boolean isuserexist =false;
            System.out.println("Enter First Name:");
            String FirstName = sc.next();
            System.out.println("Enter Last Name:");
            String LastName = sc.next();
            System.out.println("Enter DateOfBirth Fromate DD/MM/YYYY:");
            String dob = sc.next();
            System.out.println("Enter UserName:");
            String userName = sc.next();

            // check For user alrady exists
                for(int i=0;i<accountCount;i++) {
                    String userdb = accountdb[i].getUsername();
                    if (userdb.equals(userName)) {
                        System.out.println("Username Already Exists Please Set Different name");
                        isuserexist =true;
                        break;
                    }
                }
                if(isuserexist){
                    break;
                }
            System.out.println("Enter Your PassWord:");
            String Password = sc.next();
            accountdb[accountCount] = new accountsuse(FirstName,LastName,dob,userName,Password,0,"user");
            accountCount++;
            System.out.println("Thanks Created! Now You can Use Our Servieces!");
           break;

           // Help Center
            case 3:
              int inpu=0;
              String helpmessage = """
               -------Help Center------
               1)Forget Password
               2)Forget Username
               3)Account Blocked
               0)Exit
                      """;
                System.out.println(helpmessage);
                System.out.println("Enter Your Option:");
                inpu = sc.nextInt();
              while(inpu>0){

                  // Forget Password Logic
                  if(inpu==1){
                     Boolean session =false;
                      System.out.println("Enter Your Username:");
                      String userforget = sc.next();
                      System.out.println("Enter Your DOB Formate: DD/MM/YYYY");
                      String userdob = sc.next();


                      //Account Details Checker
                      for(int i=0;i<accountCount;i++){
                          //Check for coorect info and acccount not be blocked
                          if(accountdb[i].getUsername().equals(userforget)&&accountdb[i].getDOB().equals(userdob)&&accountdb[i].getAttempts()<3){
                              System.out.println("Enter Your New Password:");
                              String newpassword = sc.next();
                              accountdb[i].setPassword(newpassword);
                              session =true;
                              break;
                          } // Account Blocked
                          else if(accountdb[i].getUsername().equals(userforget)&&accountdb[i].getAttempts()>=3){
                              System.out.println("Sorry Your Account Is Blocked First Unblock It !");
                              session =false;
                              break;
                          } //Account Date of birth invalid
                          else if(accountdb[i].getUsername().equals(userforget)){
                              System.out.println("Invalid DateOfBirth!");
                              session = false;
                              break;
                          }// No user Found Or Invalid username
                          else{
                              System.out.println("Invalid Username!");
                              session  =false;
                              break;
                          }
                      } // Break Session immediately For Wrong infos
                      if(!session){
                          break;
                      }
                      System.out.println("Your Password Has Benn Succesfully Updated!");
                      inpu =0;
                      break;
                  }
                  // Forget Account Username
                  else if(inpu==2){
                      System.out.println("Enter Your First Name");
                      String userfirst = sc.next();
                      System.out.println("Enter Your Last Name:");
                      String userLast = sc.next();
                      System.out.println("Enter Your DOB:");
                      String userdob = sc.next();
                      System.out.println("Your Username is:");
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
