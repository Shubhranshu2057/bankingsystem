package assets;

public class Accounts {
    private String First;
    private String Last;
    private String DOB;
    private String username;
    private String password;
    private int attempts;
    private String type;

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

    public Accounts(String first, String last, String DOB, String username, String password, int attempts, String type) {
        First = first;
        Last = last;
        this.DOB = DOB;
        this.username = username;
        this.password = password;
        this.attempts = attempts;
        this.type = type;
    }
}
