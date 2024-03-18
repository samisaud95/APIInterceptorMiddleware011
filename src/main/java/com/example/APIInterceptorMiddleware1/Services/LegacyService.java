package com.example.APIInterceptorMiddleware1.Services;

import org.springframework.stereotype.Service;

@Service
public class LegacyService {
    public String getThisIsJustOldCode(){
        return "This is Just Old Code" + getThisIsJustOldCode();

    }
}
