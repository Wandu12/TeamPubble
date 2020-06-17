package com.pubble.conpub.controller;

import com.pubble.conpub.domain.Member;
import com.pubble.conpub.repository.MemberRepository;
import com.pubble.conpub.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    // 전체 회원 조회 메서드
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    // 특정 회원 조회 메서드
    public Member findOne(Long id) {
        return memberRepository.findOne(id);
    }


}
