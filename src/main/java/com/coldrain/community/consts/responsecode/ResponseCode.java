package com.coldrain.community.consts.responsecode;

import org.springframework.http.HttpStatus;

public interface ResponseCode {

    boolean isSuccess();

    String getMessage();

    HttpStatus getStatus();
}
