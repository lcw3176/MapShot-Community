package com.coldrain.community.web.exception;

import com.coldrain.community.consts.responsecode.ResponseCode;
import lombok.Getter;

@Getter
public class CommunityException extends RuntimeException {

    private final ResponseCode code;

    public CommunityException(ResponseCode code, String msg, Throwable throwable) {
        super(msg, throwable);
        this.code = code;
    }

}
