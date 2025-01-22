package com.maxicorrea.java_spring_not_found_handler.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @GetMapping("/")
    public String findUsers() {
        return "All User";
    }

    @GetMapping("/err")
    public String throwError() throws Exception{
        throw new Exception("Error");
    }
    
}
