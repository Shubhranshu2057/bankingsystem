package services;

import entity.accountsuse;
import entity.cardacces;

public class accountdelete {
    public void deleteaccount(accountsuse[] accountdb, int currentaccount, cardacces[] cardb){

        for(int i=0;i<cardb.length;i++){
            if(cardb[i]!=null&&cardb[i].getAccountno()==accountdb[currentaccount].getAccountno()){
                cardb[i].setActive(false);
                accountdb[currentaccount].setStatus("disabled");
                System.out.println("Your Account Is deleted Successfully you can Logout!");
                return;
            }
        }



    }
}
