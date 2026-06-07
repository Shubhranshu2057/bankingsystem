package controllers;

import entity.accountsuse;
import entity.cardacces;

public class cardSystem {
   public void card(cardacces[] cardb, accountsuse[] accountdb,int currentaccount){
       for(int i=0;i<cardb.length;i++){
           if(cardb[i] !=null && cardb[i].getAccountno()==accountdb[currentaccount].getAccountno()){
               System.out.println("Card number:"+cardb[i].getCardno());
               System.out.println("Card Cvv:"+cardb[i].getCardcvv());
               System.out.println("Card expiry:"+cardb[i].getCardexpire());
               System.out.println("Card Status:"+cardb[i].getActive());
           }
       }
}
}
