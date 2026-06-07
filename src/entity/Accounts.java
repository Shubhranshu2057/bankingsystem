package entity;

public class Accounts {
    private String First;
    private String Last;
    private String DOB;
    private String username;
    private String password;
    private int attempts;
    private String type;
    private int accountno;
    private String hname;
    private float balance;
    private String ucode;
    private boolean bill;
    private int Transactions;

    public int getTransactions() {
        return Transactions;
    }

    public void setTransactions(int transactions) {
        Transactions = transactions;
    }

    public String getFirst() {
        return First;
    }

    public void setFirst(String first) {
        First = first;
    }

    public String getLast() {
        return Last;
    }

    public void setLast(String last) {
        Last = last;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getUcode() {
        return ucode;
    }

    public void setUcode(String ucode) {
        this.ucode = ucode;
    }

    public boolean isBill() {
        return bill;
    }

    public void setBill(boolean bill) {
        this.bill = bill;
    }

    public Accounts(String first, String last, String DOB, String username, String password, int attempts, String type, String ucode, int accountno, String hname, float balance, boolean bill,int transactions) {
        First = first;
        Last = last;
        this.DOB = DOB;
        this.username = username;
        this.password = password;
        this.attempts = attempts;
        this.type = type;
        this.ucode = ucode;
        this.accountno = accountno;
        this.hname = hname;
        this.balance = balance;
        this.bill = bill;
        this.Transactions=transactions;

    }
}
