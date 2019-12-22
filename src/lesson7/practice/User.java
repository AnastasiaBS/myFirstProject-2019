package lesson7.practice;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private String surname;
    private Date dateRegister;
    private String pathToAvatar;

    public User() {
    }

    public User(int id, String name, String surname, Date dateRegister, String pathToAvatar) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateRegister = dateRegister;
        this.pathToAvatar = pathToAvatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    public String getPathToAvatar() {
        return pathToAvatar;
    }

    public void setPathToAvatar(String pathToAvatar) {
        this.pathToAvatar = pathToAvatar;
    }
    public void printUser () {
        System.out.printf("Пользователь: %s %s", name, surname);
        System.out.println();

    }
}
