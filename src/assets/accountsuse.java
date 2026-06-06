package assets;

public class accountsuse extends Accounts {
    public accountsuse(String first, String last, String DOB, String username, String password, int attempts, String type) {
        super(first, last, DOB, username, password, attempts, type);
        setFirst(first);
        setLast(last);
        setUsername(username);
        setDOB(DOB);
        setPassword(password);
        setAttempts(attempts);
        setType(username);
    }
}
