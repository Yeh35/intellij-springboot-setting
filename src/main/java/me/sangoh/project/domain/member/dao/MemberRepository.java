package me.sangoh.project.domain.member.dao;

import me.sangoh.project.domain.member.domain.Member;
import me.sangoh.project.domain.member.domain.ReferralCode;
import me.sangoh.project.domain.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

  Optional<Member> findByEmail(Email email);

  boolean existsByEmail(Email email);

  boolean existsByReferralCode(ReferralCode referralCode);

}
