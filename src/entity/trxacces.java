package entity;

import java.util.Date;

public class trxacces extends recenttransactions{
    public trxacces(int trxid, int accountno, String paymenttype, float amount, Date date) {
        super(trxid, accountno, paymenttype, amount, date);
        setTrxid(trxid);
        setAccountno(accountno);
        setPaymenttype(paymenttype);
        setAmount(amount);
        setDate(date);
    }
}
