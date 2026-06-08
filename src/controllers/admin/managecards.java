package controllers.admin;

import entity.cardacces;
import services.admin.ActivateCard;
import services.admin.BlockedCard;

import java.util.Scanner;

public class managecards {
    public void cards(cardacces[] cardb){
        Scanner sc =new Scanner(System.in);
        int choise = 1;
        String message = """
                -----Manage Cards tool-----
                1)Activate Card
                2)Deactivate Card
                3)Allot New Card
                4)Card check details
                0)Exit
                """;
        System.out.println(message);
        System.out.println("Enter your Choose:");
        choise = sc.nextInt();

        switch(choise){
            case 1:
                ActivateCard activatecard = new ActivateCard();
                activatecard.activateCard(cardb);
                break;
            case 2:
                BlockedCard card = new BlockedCard();
                card.blockedcard(cardb);
                break;
            case 3:

        }



    }

}
