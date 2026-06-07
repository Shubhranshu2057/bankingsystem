package controllers;

import entity.accountsuse;
import entity.cardacces;

import java.util.Scanner;

public class cardblock {
    public void cardblock(cardacces[] carddb, int currentaccount, accountsuse[] accountdb){
      Scanner sc =new Scanner(System.in);
      //check card is avilable or not
        for(int i=0;i<carddb.length;i++){
            if(carddb[i]!=null&&carddb[i].getAccountno()==accountdb[currentaccount].getAccountno()){
             //check status of card
                if(carddb[i].getActive()==true){
                    System.out.println("Do you want to block your card No :"+carddb[i].getCardno());
                    System.out.println("Y to Block/N to Cancel");
                    char choise = sc.next().charAt(0);
                    if(choise=='Y'||choise=='y'){
                    //Block the card
                        carddb[i].setActive(false);
                        System.out.println("Successful Blocked");
                    }else {
                        return;
                    }
                }
                //trigger if already blocked
                else {
                    System.out.println("Your Card is Already Blocked!");
                    return;
                }
                return;
            }
        }


    }
}
