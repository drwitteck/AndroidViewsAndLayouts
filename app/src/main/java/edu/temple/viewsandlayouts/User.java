package edu.temple.viewsandlayouts;

public class User {
    String name, email, telephone, role;

    public User(String name, String email, String telephone, String role) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.role = role;
    }

    public String identifyUser(){
        return "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + telephone + "\n" +
                "Role: " + role;
    }
}
