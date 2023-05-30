package com.ering.ering.signup.mapper;

import com.ering.ering.signup.model.SignUp;
import com.ering.ering.signup.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SignUpMapper {

    public int createMember(SignUp signUp);

    public User createLogin(User user);
}
