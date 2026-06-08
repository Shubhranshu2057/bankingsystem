package entity;

import java.util.Date;

public class recenttransactions {
    private int  trxid;
    private int accountno;
    private String paymenttype;
    private float amount;
    private Date date;

    public int getTrxid() {
        return trxid;
    }

    public void setTrxid(int trxid) {
        this.trxid = trxid;
    }

    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public recenttransactions(int trxid, int accountno, String paymenttype, float amount, Date date) {
        this.trxid = trxid;
        this.accountno = accountno;
        this.paymenttype = paymenttype;
        this.amount = amount;
        this.date = date;
    }
}
