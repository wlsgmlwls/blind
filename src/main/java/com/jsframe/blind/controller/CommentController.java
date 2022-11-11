package com.jsframe.blind.controller;

import com.jsframe.blind.entity.Comment;
import com.jsframe.blind.service.CommentService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.persistence.Column;
import javax.servlet.http.HttpSession;

@Controller
@Log
public class CommentController {

    ModelAndView mv;

    @Autowired
    private CommentService cServ;

@PostMapping ("cWriteProc")
    public String  cWriteProc(Comment comment, HttpSession session, RedirectAttributes rttr){
    log.info("cWriteProc()");
    String view = cServ.commentSave(comment,session,rttr);

    return view;
}
}
