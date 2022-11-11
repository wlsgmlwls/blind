package com.jsframe.blind.controller;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log
public class BoardController {

  @GetMapping("/")
  public String main(){
    log.info("main()");
    return "main";
  }

}
