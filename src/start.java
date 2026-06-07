import controllers.createAccount;
import controllers.home;
import controllers.login;
import entity.accountsuse;

import java.util.Random;
import java.util.Scanner;

public class start {
    public static String ucodegenrator(){
        Random random = new Random();
        String code="";
        for(int i=0;i<3;i++){
            code+= (char) ('A'+random.nextInt(26));
        }
        int number = random.nextInt(1000);
        String codes= code+String.format("%03d", number);
        return codes;
    }
    public static int accgen(){
        int a = (int)(Math.random()*90000)+10000;
        System.out.println(a);
        return a;
    }


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
              login login = new login();
              login.logins(accountCount,accountdb);
               // login data entery
            break;

            // Account Creation
            case 2:
             createAccount acc = new createAccount();
             if(acc.create(accountCount,accountdb,ucodegenrator(),accgen())){
                 accountCount++;
             }else {
                 break;
             }

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
                      Boolean session =false;
                      boolean firstname = true;
                      boolean lastname =true;
                      boolean dobs = true;
                      System.out.println("Enter Your First Name");
                      String userfirst = sc.next();
                      System.out.println("Enter Your Last Name:");
                      String userLast = sc.next();
                      System.out.println("Enter Your DOB: Fomate DD/MM/YYYY");
                      String userdob = sc.next();

                      for(int i=0;i<accountCount;i++){
                          if(accountdb[i].getFirst().equals(userfirst)){
                              firstname= true;
                              if(accountdb[i].getLast().equals(userLast)){
                                  lastname =true;
                                  if(accountdb[i].getDOB().equals(userdob)){
                                      dobs=true;
                                      System.out.println("Your Username is :"+accountdb[i].getUsername());
                                      session =true;
                                  }
                              }
                          }
                      }
                      if(!session){
                          if(firstname&&lastname){
                              System.out.println("Your Dob is Missmatched!");
                              break;
                          }else if(dobs&&firstname){
                              System.out.println("Your Last Name Incorrect!");
                              break;
                          }
                          else if(dobs&&lastname){
                              System.out.println("Your First name is Inccorecct!");
                              break;
                          }
                          break;
                      }

                      inpu =0;
                      break;
                  }

                  // Account UnblockER Using Ucode
                  else if(inpu==3){
                      System.out.println("Enter your UserName:");
                      String ublock = sc.next();
                      System.out.println("Enter Your Password:");
                      String upassword = sc.next();
                      System.out.println("Enter Verify Token Which USed While Creating Account!:");
                      String ucode = sc.next();
                      String tempnew = ucodegenrator();
                      //U code logic
                      for(int i=0;i<accountCount;i++){

                          // Uc Code checker with code auth successful
                          if(accountdb[i].getUsername().equals(ublock)&&accountdb[i].getPassword().equals(upassword)&&accountdb[i].getUcode().equals(ucode)&&accountdb[i].getAttempts()>=3){
                              accountdb[i].setUcode(tempnew);
                              accountdb[i].setAttempts(0);
                              System.out.println("Your Account Has been Successful Unblocked!");
                              System.out.println("Note! New Ucode:"+tempnew);

                              break;
                          }
                          //UC code  invalid
                          else if(accountdb[i].getUsername().equals(ublock)&&accountdb[i].getPassword().equals(upassword)){
                              System.out.println("Your Ucode is Invalid Please Contact Admin!");
                              break;
                          }
                          // UC code Account password Invalid
                          else if(accountdb[i].getUsername().equals(ublock)){
                              System.out.println("Your Password is Invalid");
                              break;
                          }
                          // UC code Account username Invalid
                          else {
                              System.out.println("Invalid Username");
                              break;
                          }

                      }
                      inpu=0;
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
