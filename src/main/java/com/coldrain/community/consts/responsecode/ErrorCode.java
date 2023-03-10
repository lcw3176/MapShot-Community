package com.coldrain.community.consts.responsecode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode implements ResponseCode {

    BAD_REQUEST(HttpStatus.BAD_REQUEST, false, "잘못된 요청입니다."),
    NOT_FOUND(HttpStatus.NOT_FOUND, false, "해당되는 컨텐츠를 찾을 수 없습니다."),
    SYSTEM_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, false, "시스템 내부 오류입니다. 잠시 후 다시 시도해 주세요");

    private final HttpStatus status;
    private final boolean success;
    private final String message;
}
