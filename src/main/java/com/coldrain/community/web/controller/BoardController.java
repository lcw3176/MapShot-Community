package com.coldrain.community.web.controller;

import com.coldrain.community.consts.responsecode.SuccessCode;
import com.coldrain.community.web.response.CommonResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/board")
public class BoardController {

    // todo 나중에 X-FORWARDED-FOR 설정
    @GetMapping
    public CommonResponse test(HttpServletRequest request) {

        return new CommonResponse(SuccessCode.SUCCESS, request.getRemoteAddr());
    }
}
