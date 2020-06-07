package me.sangoh.project.domain.member.application;

import lombok.RequiredArgsConstructor;
import me.sangoh.project.domain.member.dao.MemberFindDao;
import me.sangoh.project.domain.member.domain.Member;
import me.sangoh.project.domain.member.dto.MemberProfileUpdate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberProfileService {

  private final MemberFindDao memberFindDao;

    public Member update(final long memberId, final MemberProfileUpdate dto) {
      final Member member = memberFindDao.findById(memberId);
        member.updateProfile(dto.getName());
        return member;
    }

}
