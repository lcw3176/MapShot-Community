package com.joebrooks.community.web.response;

import com.joebrooks.community.consts.responsecode.ResponseCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CommunityResponse {

    private final boolean success;
    private final String message;
    private Object data;

    public CommunityResponse(ResponseCode code) {
        this.success = code.isSuccess();
        this.message = code.getMessage();
    }


    public CommunityResponse(ResponseCode code, Object data) {
        this.success = code.isSuccess();
        this.message = code.getMessage();
        this.data = data;
    }

}
