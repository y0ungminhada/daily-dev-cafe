//package com.jsyeo.dailydevcafe.service;
//
//import com.jsyeo.dailydevcafe.domain.Member;
//import com.jsyeo.dailydevcafe.repository.MemberRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.assertj.core.api.Assertions.assertThatThrownBy;
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//@Transactional
//class MemberServiceTest {
//
//    @Autowired
//    MemberService memberService;
//    @Autowired
//    MemberRepository memberRepository;
//
//    @Test
//    void 회원가입() {
//        // 정상 처리
//        String email = "test@test.com";
//        Member member = Member.createMember("kim", email, "12345678");
//        Long saveId = memberService.join(member);
//
//        Member findMember = memberRepository.findById(saveId);
//        assertThat(findMember).isEqualTo(member);
//
//        findMember = memberService.findMemberByEmail(email);
//        assertThat(findMember).isEqualTo(member);
//
//        // 이메일 오류
//        Member member2 = Member.createMember("kim", "test", "12345678");
//        assertThatThrownBy(() -> memberService.join(member2))
//                .isInstanceOf(IllegalStateException.class);
//
//        // 비밀번호 오류
//        Member member3 = Member.createMember("kim", "test@test.com", "1234");
//        assertThatThrownBy(() -> memberService.join(member3))
//                .isInstanceOf(IllegalStateException.class);
//    }
//}