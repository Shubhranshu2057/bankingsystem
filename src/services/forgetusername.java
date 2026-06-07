package services;

import entity.accountsuse;

import java.util.Scanner;

public class forgetusername {
    public void forget(int accountCount, accountsuse[] accountdb){
       Scanner sc = new Scanner(System.in);
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
               return;
            }else if(dobs&&firstname){
                System.out.println("Your Last Name Incorrect!");
                return;
            }
            else if(dobs&&lastname){
                System.out.println("Your First name is Inccorecct!");
                return;
            }
           return;
        }

        return;
    }
}
