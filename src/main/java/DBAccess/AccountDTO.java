package DBAccess;

public class AccountDTO {

    private int accountId;
    private int account;
    private int userid;

    public AccountDTO(int accountId, int account, int userid) {
        this.accountId = accountId;
        this.account = account;
        this.userid = userid;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
