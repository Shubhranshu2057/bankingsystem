package entity;

public class cardacces extends cards{
    public cardacces(long cardno, int cardexpire, int cardcvv, int pin, int accountno, Boolean active) {
        super(cardno, cardexpire, cardcvv, pin, accountno, active);
        setCardno(cardno);
        setCardcvv(cardcvv);
        setCardexpire(cardexpire);
        setAccountno(accountno);
        setPin(pin);
        setActive(active);
    }
}
