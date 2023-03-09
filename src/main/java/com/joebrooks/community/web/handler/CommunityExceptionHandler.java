package com.joebrooks.community.web.handler;

import com.joebrooks.community.consts.responsecode.ErrorCode;
import com.joebrooks.community.consts.responsecode.ResponseCode;
import com.joebrooks.community.web.response.CommunityResponse;
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
    public CommunityResponse communityException(RuntimeException e) {
        ResponseCode errorCode = ErrorCode.SYSTEM_ERROR;

        return new CommunityResponse(errorCode);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public CommunityResponse handleNoHandlerFound(NoHandlerFoundException e) {
        ResponseCode errorCode = ErrorCode.NOT_FOUND;

        return new CommunityResponse(errorCode);
    }


}
