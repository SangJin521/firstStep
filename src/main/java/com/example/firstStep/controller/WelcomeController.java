package com.example.firstStep.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    // @RequestParam 사용 예제
    @GetMapping("/welcome")
    public Map<String, String> welcome(@RequestParam String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "welcome, " + name + "!");
        return response;
    }

    // @PathVariable 사용 예제
    @GetMapping("/user/{id}")
    public Map<String, Object> getUserById(@PathVariable int id) {
        // 임의로 사용자 데이터를 생성
        Map<String, Object> user = new HashMap<>();
        user.put("id", id);
        user.put("name", id == 1 ? "Alice" : "Unknown");
        user.put("email", id == 1 ? "alice@example.com" : "unknown@example.com");
        return user;
    }

    // POST 요청으로 JSON 데이터 받기
    @PostMapping("/users")
    public Map<String, Object> createUser(@RequestBody Map<String, Object> user) {
        // 받은 데이터를 그대로 반환 (실제 서비스에서는 데이터베이스에 저장)
        user.put("status", "User created successfully");
        return user;
    }
}
