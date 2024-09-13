package com.spring.di;

public class User implements InterfaceUser{

    private  Interfaceperson person;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    private String team;
    public void setPerson(Interfaceperson person) {
        this.person = person;
    }

    public void start(){

        System.out.println("I am user");
    }

    public void getPerson(){
        this.person.begin();
    }
}
