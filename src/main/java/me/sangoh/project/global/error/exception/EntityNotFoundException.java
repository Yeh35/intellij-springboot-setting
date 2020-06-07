package me.sangoh.project.global.error.exception;

import me.sangoh.project.global.error.CommonErrorCode;

public class EntityNotFoundException extends BusinessException {

    public EntityNotFoundException(String message) {
        super(message, CommonErrorCode.ENTITY_NOT_FOUND);
    }
}
