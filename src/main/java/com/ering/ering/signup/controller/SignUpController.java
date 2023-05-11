package com.ering.ering.signup.controller;

import com.ering.ering.error.Result;
import com.ering.ering.signup.model.SignUp;
import com.ering.ering.signup.service.SignUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Slf4j
public class SignUpController {

    private final SignUpService signUpService;

    public SignUpController(SignUpService signUpService) {
        this.signUpService = signUpService;
    }

    @GetMapping("/signUp")
    public String signUp() {
        return "/member/sign-up";
    }

    @PostMapping("/signUp")
    public String Login(SignUp signUp) {

        Result result = signUpService.createMember(signUp);
        if (result.equals(Result.SUCCESS)) {
            log.info("저장 성공");
            return "/member/login";
        } else {
            log.info("저장 실패");
            return "/member/sign-up";
        }
    }

}
