import java.util.Scanner;

public class home {
    public void sar(String User,String hname,int accountno,float balance) {
        Scanner sc = new Scanner(System.in);
        String Messgae =
                """
                        -----Welcome To HomePage """ + " " + "XYZ" + "--- \n" +
                        """
                                1) Account Overview (Details about Account Holder)
                                2) Quick Actions (Transfer Money,Recive Money,Pay Bills)
                                3) Recent TRansactions (Get 5 Most recent transactions)
                                4) Card Section (Debit/Credit Card Info)
                                5) Security (Password, Code Login)
                                6) Logout  
                                """;
        System.out.println(Messgae);
        int choise = 1;
        while (choise > 0) {
            System.out.println("Enter Your Option:");
            choise = sc.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Account Holder Name:"+hname);
                    System.out.println("Account Number:"+accountno);
                    System.out.println("Account Balance:"+balance);
                    System.out.println("Account Type:"+"User");
                    break;
                case 2:
                    int inpu = 0;
                    String message = """
                            -----Quick Actions-----        
                              1)Transfer Money
                              2)Receive Money
                              3)Pay Bills      
                            """;
                    System.out.println("Enter the Option:");
                    inpu = sc.nextInt();
                    if (inpu == 1) {
                        System.out.println();
                    } else if (inpu == 2) {

                    } else if (inpu == 3) {

                    } else if (inpu == 0) {
                        break;
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    choise =0;
                    break;
            }
        }
    }
}
