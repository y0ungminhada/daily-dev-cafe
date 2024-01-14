package com.jsyeo.dailydevcafe.repository;

import com.jsyeo.dailydevcafe.domain.Member;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class JpaMemberRepository implements MemberRepository {

    private final EntityManager em;

    @Override
    public Long save(Member member) {
        em.persist(member);
        return member.getId();
    }

    @Override
    public boolean existsByEmail(String email) {
        return !em.createQuery("select m from Member m where m.email=:email")
                .setParameter("email", email)
                .getResultList().isEmpty();
    }

    @Override
    public boolean existsByNickname(String nickname) {
        return !em.createQuery("select m from Member m where m.nickname=:nickname")
                .setParameter("nickname", nickname)
                .getResultList().isEmpty();
    }

    @Override
    public Member findById(Long memberId) {
        return em.find(Member.class, memberId);
    }

    @Override
    public Member findByEmail(String email) {
        return em.createQuery("select m from Member m where m.email = :email", Member.class)
                .setParameter("email", email)
                .getResultStream()
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Member> findAll() {
        return em.createQuery("select m from Member m")
                .getResultList();
    }
}
