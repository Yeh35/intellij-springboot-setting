package me.sangoh.project.global.error.exception;

import me.sangoh.project.global.error.CommonErrorCode;
import me.sangoh.project.global.error.ErrorCode;

public class InvalidValueException extends BusinessException {

    public InvalidValueException(String value) {
        super(value, CommonErrorCode.INVALID_INPUT_VALUE);
    }

    public InvalidValueException(String value, ErrorCode errorCode) {
        super(value, errorCode);
    }
}
