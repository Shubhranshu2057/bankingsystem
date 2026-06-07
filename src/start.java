import controllers.createAccount;
import controllers.help;
import controllers.login;
import entity.accountsuse;
import entity.trxacces;
import services.recive;

import java.util.Random;
import java.util.Scanner;

public class start {

    // Uc Code genrator for account unblocker
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

    // accgen for genrates account numbers
    public static int accgen(){
        int a = (int)(Math.random()*90000)+10000;
        System.out.println(a);
        return a;
    }
    public static int trxidgen(){
        int a =(int)(Math.random()*90000)+20000;
        return a;

    }


    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int size = 500;
        int accountCount =0;
        accountsuse[] accountdb = new accountsuse[size];
        trxacces[] trxdb = new trxacces[size];
        int trxcount =0;
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

            //Login Functions
           case 1:
              login login = new login();
              int tempnew = trxidgen();
              System.out.println(tempnew);
              login.logins(accountCount,accountdb,trxcount,tempnew,trxdb);
            break;

            // Account create Function
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
              help help = new help();
              help.helpcenter(accountCount,accountdb,ucodegenrator());
            break;
            default:
        }
       }

    }
}
