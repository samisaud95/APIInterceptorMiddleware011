package com.example.APIInterceptorMiddleware1.Controllers;

import com.example.APIInterceptorMiddleware1.Services.LegacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {
    @Autowired
    public LegacyService legacyService;
    @GetMapping
    public ResponseEntity<String> getOldCode(){
        return ResponseEntity.ok().body(legacyService.getThisIsJustOldCode());
    }
}
