package com.ering.ering.signup.service;

import com.ering.ering.error.Result;
import com.ering.ering.signup.mapper.SignUpMapper;
import com.ering.ering.signup.model.SignUp;
import com.ering.ering.signup.model.User;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {

    private final SignUpMapper signUpMapper;

    public SignUpServiceImpl(SignUpMapper signUpMapper) {
        this.signUpMapper = signUpMapper;
    }

    @Override
    public Result createMember(SignUp signUp) {

        int result = signUpMapper.createMember(signUp);

        if (result == 1) {
            return Result.SUCCESS;
        } else {
            return Result.FAIL;
        }
    }

    @Override
    public User createLogin(User user) {

        User loginSuccess = signUpMapper.createLogin(user);

        return loginSuccess;
    }
}
