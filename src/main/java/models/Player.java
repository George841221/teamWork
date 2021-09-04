package models;

import java.sql.Timestamp;

public class Player {

    private String name;
    private String email;
    private Timestamp regDate;



    public Player() {
    }

    public Player(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                name + "," +
                email;
    }

}
