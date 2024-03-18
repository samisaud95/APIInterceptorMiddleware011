package com.example.APIInterceptorMiddleware1.Services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BasicService {
    public String getDateTime() {
        return "Current DateTime:" + LocalDateTime.now();
    }
}
