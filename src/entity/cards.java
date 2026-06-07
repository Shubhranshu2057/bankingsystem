package entity;

public class cards {
    private long cardno;
    private int cardexpire;
    private int cardcvv;
    private int pin;
    private int accountno;
    private Boolean active;

    public long getCardno() {
        return cardno;
    }

    public void setCardno(long cardno) {
        this.cardno = cardno;
    }

    public int getCardexpire() {
        return cardexpire;
    }

    public void setCardexpire(int cardexpire) {
        this.cardexpire = cardexpire;
    }

    public int getCardcvv() {
        return cardcvv;
    }

    public void setCardcvv(int cardcvv) {
        this.cardcvv = cardcvv;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public cards(long cardno, int cardexpire, int cardcvv, int pin, int accountno, Boolean active) {
        this.cardno = cardno;
        this.cardexpire = cardexpire;
        this.cardcvv = cardcvv;
        this.pin = pin;
        this.accountno = accountno;
        this.active = active;
    }
}
