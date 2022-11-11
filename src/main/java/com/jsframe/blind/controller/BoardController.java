package com.jsframe.blind.controller;

import com.jsframe.blind.service.BoardService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@Log
public class BoardController {
    ModelAndView mv;
    @Autowired
    private BoardService bSev;

    @GetMapping("/")
    public ModelAndView getList(Integer pageNum, HttpSession session){
        log.info("getList()");
        mv = bSev.getBoardList(pageNum, session);

        return mv;
    }
}
