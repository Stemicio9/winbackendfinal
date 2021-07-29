package com.winbackendfinal.winbackendfinal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

    @Id
    private String uid;

    private String username;

    private String email;

    private String role;

    private String firebasetoken;

    public String getUid() {
        return uid;
    }

    public String getEmail() {
        return email;
    }

    public String getFirebasetoken() {
        return firebasetoken;
    }

    public String getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirebasetoken(String firebasetoken) {
        this.firebasetoken = firebasetoken;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
