package com.example.statuschecker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    
    private final StatusChecker statusChecker;
    
    public StatusController() {
        this.statusChecker = new StatusChecker();
    }
    
    @GetMapping("/status")
    public String getStatus() {
        return statusChecker.getStatus();
    }
}
