package com.jsyeo.dailydevcafe.repository;

import com.jsyeo.dailydevcafe.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    boolean existsById(String id);

    boolean existsByEmail(String email);

    boolean existsByNickname(String nickname);

    Member findByEmail(String email);
}
