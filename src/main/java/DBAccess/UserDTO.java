package DBAccess;

public class UserDTO {

    private int userid;
    private String name;
    private String sureName;

    public UserDTO(int id, String name, String sureName) {
        this.userid = id;
        this.name = name;
        this.sureName = sureName;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    @Override
    public String toString() {
        return "Userid : " + userid + ", name : " + name + ", sureName : " + sureName;
    }
}
