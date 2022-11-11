package com.jsframe.blind.service;

import com.jsframe.blind.entity.Board;
import com.jsframe.blind.entity.BoardFiles;
import com.jsframe.blind.repository.BoardFileRepository;
import com.jsframe.blind.repository.BoardRepository;
import com.jsframe.blind.util.PagingUtil;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.awt.print.Pageable;
import java.util.List;

@Service
@Log
public class BoardService {
    @Autowired
    private BoardRepository bRepo;
    @Autowired
    private BoardFileRepository bfRepo;

    private ModelAndView mv;

    public ModelAndView getBoardList(Integer pageNum, HttpSession session) {
        log.info("getBoardList()");
        mv = new ModelAndView();

        if (pageNum == null){
            pageNum = 1;
        }

        int listCnt = 10;

        Pageable pb = (Pageable) PageRequest.of((pageNum - 1), listCnt,
                Sort.Direction.DESC, "bNo");

        Page<Board> result = bRepo.findByBnoGreaterThan(0L, pb);
        List<Board> bList = result.getContent();
        int totalPage = result.getTotalPages();

        String paging = getPaging(pageNum, totalPage);

        mv.addObject("bList", bList);
        mv.addObject("paging", paging);

        session.setAttribute("pageNum", pageNum);

        return mv;
    }
    // 페이징 처리 메소드
    private String getPaging(Integer pageNum, int totalPage) {
        String pageHtml = null;
        int pageCnt = 2;
        String listName = "?";

        PagingUtil paging = new PagingUtil(totalPage, pageNum, pageCnt, listName);

        pageHtml = paging.makePaging();

        return pageHtml;
    }

    // 게시글과 목록을 담는 메소드
    public ModelAndView getBoard(long bNO){
        log.info("getBoard()");
        mv = new ModelAndView();

        Board board = bRepo.findById(bNO).get();
        mv.addObject("board", board);

        List<BoardFiles> bfList = bfRepo.findByBfid(board);
        mv.addObject("bfList", bfList);

        return mv;
    }
} // class end
