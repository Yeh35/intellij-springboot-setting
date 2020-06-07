package me.sangoh.project.domain.member.error;


import me.sangoh.project.domain.member.error.MemberErrorCode;
import me.sangoh.project.domain.model.Email;
import me.sangoh.project.global.error.exception.InvalidValueException;

public class EmailDuplicateException extends InvalidValueException {

    public EmailDuplicateException(final Email email) {
        super(email.getValue(), MemberErrorCode.EMAIL_DUPLICATION);
    }
}
