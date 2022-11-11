package com.jsframe.blind.controller;


import com.jsframe.blind.service.MemberService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log
public class MemberController {
    @Autowired
    private MemberService mServ;
    @GetMapping("/")
    public String home(){
        log.info("home()");
        return "home";
}
@GetMapping("register")
    public String register(){
        log.info("register()");
        return "register";
}





}
