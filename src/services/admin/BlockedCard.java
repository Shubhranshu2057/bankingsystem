package services.admin;

import entity.cardacces;

import java.util.Scanner;

public class BlockedCard {
    public void blockedcard(cardacces[] cardb) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Card No:");
        int cardnumber = sc.nextInt();
        for(int i=0;i<cardb.length;i++){
            if(cardb[i]!=null&&cardb[i].getCardno()==cardnumber){
                if(cardb[i].getActive()==false){
                    System.out.println("Your card is already blocked!");
                    return;
                }
                cardb[i].setActive(false);
                System.out.println("Your Card has been Blocked!");
                return;
            }
        }
        System.out.println("No card Found!");
    }
}
