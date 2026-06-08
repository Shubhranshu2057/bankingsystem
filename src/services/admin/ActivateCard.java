package services.admin;

import entity.cardacces;

import java.util.Scanner;

public class ActivateCard {
    public void activateCard(cardacces[] cardb){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter card Number:");
        int cardnumber = sc.nextInt();
        for(int i=0;i< cardb.length;i++){
            if(cardb[i]!=null&&cardb[i].getCardno()==cardnumber){
                if(cardb[i].getActive()==true){
                    System.out.println("Your Card is already activated!");
                    return;
                }
                cardb[i].setActive(true);
                System.out.println("Your card has been Activated!");
                return;
            }
        }
        System.out.println("No matching Card Found!");
    }
}
