package com.example.statuschecker;

public class StatusChecker {


    private boolean isLegit;
    //i did at the top.

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
