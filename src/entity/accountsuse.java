package entity;

public class accountsuse extends Accounts {
    public accountsuse(String first, String last, String DOB, String username, String password, int attempts, String type,String ucode,int accountno,String hname,float balance,boolean bill,int transactions,int card,String status) {
        super(first, last, DOB, username, password, attempts, type ,ucode,accountno,hname,balance,bill,transactions,card,status);
        setFirst(first);
        setLast(last);
        setUsername(username);
        setDOB(DOB);
        setPassword(password);
        setAttempts(attempts);
        setType(type);
        setUcode(ucode);
        setBalance(balance);
        setHname(hname);
        setAccountno(accountno);
        setBill(bill);
        setTransactions(transactions);
        setCard(card);
        setStatus(status);

    }
}
