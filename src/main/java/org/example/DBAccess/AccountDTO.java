package org.example.DBAccess;

import javax.persistence.*;


@Entity
@Table(name = "account")
public class AccountDTO {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "accountId")
    private int accountId;

    @Column (name = "account")
    private int account;

    @Column (name = "userid")
    private int userid;

    public AccountDTO() {

    }

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
