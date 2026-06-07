package services;

import entity.accountsuse;

import java.util.Scanner;

public class changeucode {
    public void changeucode(accountsuse[] accountdb,int currentaccount,String code){
        Scanner sc = new Scanner(System.in);
        System.out.println("Y to change Ucode / N to cancel");
        char chosise = sc.next().charAt(0);
        if(chosise=='Y'||chosise=='y'){
            accountdb[currentaccount].setUcode(code);
            System.out.println("Your updated Ucode is:"+code);

        }

    }
}
