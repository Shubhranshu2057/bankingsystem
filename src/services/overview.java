package services;

public class overview {
    public void show(String hname,int accountno,float balance){
        System.out.println("------Account Overview----");
        System.out.println("Account Holder Name:"+hname);
        System.out.println("Account Number:"+accountno);
        System.out.println("Account Balance: ₹"+balance);
        System.out.println("Account Type:"+"User");
        System.out.println(" ");
    }
}
