package controllers;

import entity.accountsuse;
import entity.cardacces;

public class cardSystem {
   public void card(cardacces[] cardb, accountsuse[] accountdb,int currentaccount){
       // check is card avilable
       for(int i=0;i<cardb.length;i++){
           if(cardb[i] !=null && cardb[i].getAccountno()==accountdb[currentaccount].getAccountno()){
            //check is card active or not
               if(cardb[i].getActive()==true){
                   System.out.println("Card number:"+cardb[i].getCardno());
                   System.out.println("Card Cvv:"+cardb[i].getCardcvv());
                   System.out.println("Card expiry:"+cardb[i].getCardexpire());
                   System.out.println("Card Status:"+cardb[i].getActive());
                   return;
               }
               //if blocked throw error
               else {
                   System.out.println("Your Card is Blocked Get new By Help Center!");
                   return;
               }

           }
       }
}
}
