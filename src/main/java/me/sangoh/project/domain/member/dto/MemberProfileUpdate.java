package me.sangoh.project.domain.member.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.sangoh.project.domain.model.Name;

import javax.validation.Valid;

@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class MemberProfileUpdate {

    @Valid
    private Name name;

    public MemberProfileUpdate(@Valid Name name) {
        this.name = name;
    }
}
