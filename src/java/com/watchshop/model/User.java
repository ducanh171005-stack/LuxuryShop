/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.watchshop.model;

/**
 *
 * @author ngocd
 */
public class User {
  
    private int id;
    private String user;
    private String pass;
    private int Client;
    private int Admin;

    public User(int id, String user, String pass, int Client, int Admin) {
        this.id = id;
        this.user = user;
        this.pass = pass;
        this.Client = Client;
        this.Admin = Admin;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getClient() {
        return Client;
    }

    public void setClient(int Client) {
        this.Client = Client;
    }

    public int getAdmin() {
        return Admin;
    }

    public void setAdmin(int Admin) {
        this.Admin = Admin;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", user=" + user + ", pass=" + pass + ", Client=" + Client + ", Admin=" + Admin + '}';
    }
}


