package com.coldrain.community.web.handler;

import com.coldrain.community.consts.responsecode.ErrorCode;
import com.coldrain.community.consts.responsecode.ResponseCode;
import com.coldrain.community.web.response.CommonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class CommunityExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public CommonResponse communityException(RuntimeException e) {
        ResponseCode errorCode = ErrorCode.SYSTEM_ERROR;

        return new CommonResponse(errorCode);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public CommonResponse handleNoHandlerFound(NoHandlerFoundException e) {
        ResponseCode errorCode = ErrorCode.NOT_FOUND;

        return new CommonResponse(errorCode);
    }


}
