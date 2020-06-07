package me.sangoh.project.domain.member.application;

import lombok.RequiredArgsConstructor;
import me.sangoh.project.domain.member.domain.Member;
import me.sangoh.project.domain.member.dto.SignUpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class MemberSignUpRestService {

  private final RestTemplate localTestTemplate;

  public Member requestSginUp(final SignUpRequest dto) {
    final ResponseEntity<Member> response = localTestTemplate
        .postForEntity("/members", dto, Member.class);
    return response.getBody();
  }
}
