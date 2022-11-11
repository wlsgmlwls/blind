package com.jsframe.blind.controller;

import com.jsframe.blind.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

public class CommentController {

    ModelAndView mv;

    @Autowired
    private CommentService cServ;


}
