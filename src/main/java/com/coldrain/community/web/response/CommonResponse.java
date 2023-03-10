package com.coldrain.community.web.response;

import com.coldrain.community.consts.responsecode.ResponseCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CommonResponse {

    private final boolean success;
    private final String message;
    private Object data;

    public CommonResponse(ResponseCode code) {
        this.success = code.isSuccess();
        this.message = code.getMessage();
    }


    public CommonResponse(ResponseCode code, Object data) {
        this.success = code.isSuccess();
        this.message = code.getMessage();
        this.data = data;
    }

}
