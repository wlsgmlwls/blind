package com.jsframe.blind.service;

import com.jsframe.blind.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
@Log
@RequiredArgsConstructor

public class CommentService {

    @Autowired
    private CommentRepository cRepo;

    private ModelAndView mv;

    //댓글 작성
@Transactional
    public Long inser
}
