package com.winbackendfinal.winbackendfinal.configurations.utils;

import lombok.Data;

@Data
public class CustomPrincipal {
    String uid;

    public String getUid() { return uid; }

    public void setUid(String uid) { this.uid = uid; }
}
