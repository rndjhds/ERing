package com.ering.ering.signup.service;

import com.ering.ering.error.Result;
import com.ering.ering.signup.model.SignUp;
import com.ering.ering.signup.model.User;

public interface SignUpService {

    public Result createMember(SignUp signUp);

    public User createLogin(User user);

}
