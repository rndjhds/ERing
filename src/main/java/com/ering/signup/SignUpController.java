package com.ering.signup;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignUpController {

    @RequestMapping("/signUp")
    public String signUp(Model model) {
        return "/member/sign-up";
    }
}
