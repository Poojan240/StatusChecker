package com.example.statuschecker;

public class StatusChecker {


    private boolean isLegit;
    //123456789

    public boolean isLegit() {
        return isLegit;
    }

    public void setLegit(boolean legit) {
        isLegit = legit;
    }

    public String getStatus() {
        return "in_progress";
    }
}
