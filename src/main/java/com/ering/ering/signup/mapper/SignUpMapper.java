package com.ering.ering.signup.mapper;

import com.ering.ering.signup.model.SignUp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SignUpMapper {

    public int createMember(SignUp signUp);
}
