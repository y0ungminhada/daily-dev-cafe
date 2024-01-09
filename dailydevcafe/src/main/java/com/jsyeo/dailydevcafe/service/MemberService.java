package com.jsyeo.dailydevcafe.service;

import com.jsyeo.dailydevcafe.domain.Member;
import com.jsyeo.dailydevcafe.dto.MemberDto;
import com.jsyeo.dailydevcafe.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Long join(MemberDto memberDto) {

        Member member = Member.createMember(memberDto);
        return memberRepository.save(member);
    }

    public Member findMemberByEmail(String email) {
        return memberRepository.findByEmail(email);
    }

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }
}
