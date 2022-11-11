package com.jsframe.blind.service;


import com.jsframe.blind.entity.Member;
import com.jsframe.blind.repository.SingUpRepository;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Service
@Log
public class MemberService {
private  SingUpRepository sRepo;

public String reMember(MemberService member, RedirectAttributes rttr){
    log.info("regMember()");
    String msg = null;
    String view = null;

    try{
        sRepo.insertMember(member);
        msg = "가입성공";
        view = "redirect:/";
    } catch (Exception e){
        e.printStackTrace();
        msg = "가입실패";
        view = "redirect:register";
    }
    rttr.addFlashAttribute("msg,msg");
    return view;
}


public class MemberService {
}
