package com.ering.ering.signup.service;

import com.ering.ering.error.Result;
import com.ering.ering.signup.model.SignUp;

public interface SignUpService {

    public Result createMember(SignUp signUp);
}
