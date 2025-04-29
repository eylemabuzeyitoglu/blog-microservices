package com.blogapp.commonsecurity.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "auth-service", url = "http://localhost:8085/api/auth")
public interface AuthServiceClient {

    @GetMapping("/validate")
    ResponseEntity<Boolean> validateToken(@RequestHeader("Authorization") String token);
}

