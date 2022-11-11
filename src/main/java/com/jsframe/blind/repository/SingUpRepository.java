package com.jsframe.blind.repository;


import com.jsframe.blind.entity.Member;
import com.jsframe.blind.service.MemberService;
import org.springframework.data.repository.CrudRepository;

public interface SingUpRepository extends CrudRepository<Member, String> {

    void insertMember(MemberService member);
}

