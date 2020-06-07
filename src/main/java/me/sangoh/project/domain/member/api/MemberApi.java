package me.sangoh.project.domain.member.api;

import lombok.AllArgsConstructor;
import me.sangoh.project.domain.member.application.MemberProfileService;
import lombok.RequiredArgsConstructor;
import me.sangoh.project.domain.member.application.MemberSignUpService;
import me.sangoh.project.domain.member.dao.MemberFindDao;
import me.sangoh.project.domain.member.domain.Member;
import me.sangoh.project.domain.member.dto.MemberExistenceType;
import me.sangoh.project.domain.member.dto.MemberProfileUpdate;
import me.sangoh.project.domain.member.dto.MemberResponse;
import me.sangoh.project.domain.member.dto.SignUpRequest;
import me.sangoh.project.global.common.response.Existence;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RequiredArgsConstructor
@RestController
@RequestMapping("/members")
public class MemberApi {

    private final MemberSignUpService memberSignUpService;
    private final MemberFindDao memberFindDao;
    private final MemberProfileService memberProfileService;

    @PostMapping
    public MemberResponse create(@RequestBody @Valid final SignUpRequest dto) {
        final Member member = memberSignUpService.doSignUp(dto);
        return new MemberResponse(member);
    }

    @GetMapping("/{id}")
    public MemberResponse getMember(@PathVariable long id) {
        return new MemberResponse(memberFindDao.findById(id));
    }

    @PutMapping("/{id}/profile")
    public void updateProfile(@PathVariable long id, @RequestBody @Valid final MemberProfileUpdate dto) {
        memberProfileService.update(id, dto);
    }

    @GetMapping("/existence")
    public Existence isExistTarget(
            @RequestParam("type") final MemberExistenceType type,
            @RequestParam(value = "value", required = false) final String value
    ) {
        return new Existence(memberFindDao.isExistTarget(type, value));
    }

}
