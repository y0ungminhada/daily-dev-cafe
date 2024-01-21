//package com.jsyeo.dailydevcafe.repository;
//
//import com.jsyeo.dailydevcafe.domain.Member;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//@Transactional
//class MemberRepositoryTest {
//
//    @Autowired
//    MemberRepository repository;
//
//    @Test
//    void 회원가입() {
//        String email = "test@test.com";
//        Member member = Member.createMember("kim", email, "1234");
//        Long saveId = repository.save(member);
//
//        Member findMember = repository.findById(saveId);
//        assertThat(findMember).isEqualTo(member);
//
//        findMember = repository.findByEmail(email);
//        assertThat(findMember).isEqualTo(member);
//    }
//}