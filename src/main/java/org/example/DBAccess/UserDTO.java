package org.example.DBAccess;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserDTO {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "userid")
    private int userid;

    @Column (name = "name")
    private String name;

    @Column (name = "sureName")
    private String sureName;

    public UserDTO() {

    }

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
