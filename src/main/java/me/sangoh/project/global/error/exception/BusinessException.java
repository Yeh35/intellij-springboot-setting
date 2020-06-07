package me.sangoh.project.global.error.exception;


import me.sangoh.project.global.error.ErrorCode;

/**
 * Business 로직과 관련된 Exception의 초상위 Exception이다.
 */
public class BusinessException extends RuntimeException {

    private ErrorCode errorCode;

    public BusinessException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
