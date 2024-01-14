package com.jsyeo.dailydevcafe.repository;

import com.jsyeo.dailydevcafe.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MemberRepository {
    Long save(Member member);

    boolean existsByEmail(String email);

    boolean existsByNickname(String nickname);

    Member findById(Long memberId);

    Member findByEmail(String email);

    List<Member> findAll();
}
