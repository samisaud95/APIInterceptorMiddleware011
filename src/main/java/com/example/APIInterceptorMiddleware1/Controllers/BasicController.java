package com.example.APIInterceptorMiddleware1.Controllers;

import com.example.APIInterceptorMiddleware1.Services.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time")
public class BasicController {
    @Autowired
    public BasicService basicService;
    @GetMapping
    public ResponseEntity<String> getCurrentDateTime(){
        return ResponseEntity.ok().body(basicService.getDateTime());
    }
}
