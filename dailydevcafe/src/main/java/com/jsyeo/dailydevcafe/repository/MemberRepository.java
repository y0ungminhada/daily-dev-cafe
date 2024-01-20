package com.jsyeo.dailydevcafe.repository;

import com.jsyeo.dailydevcafe.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    boolean existsByEmail(String email);

    boolean existsByNickname(String nickname);

    Member findByEmail(String email);
}
