package com.joebrooks.community.consts.responsecode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessCode implements ResponseCode {

    SUCCESS(HttpStatus.OK, true, "");

    private final HttpStatus status;
    private final boolean success;
    private final String message;
    
}
