package com.jsyeo.dailydevcafe.service;

import com.jsyeo.dailydevcafe.domain.Member;
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
    public Long join(Member member) {

        validate(member);
        return memberRepository.save(member);
    }

    public Member findMemberByEmail(String email) {
        return memberRepository.findByEmail(email);
    }

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    private static void validate(Member member) {
        if (!member.getEmail().contains("@")) {
            throw new IllegalStateException("이메일 형식으로 입력해주세요.");
        }

        if (member.getPassword().length() < 8) {
            throw new IllegalStateException("비밀번호는 8자 이상의 문자열로 입력해주세요.");
        }
    }
}
