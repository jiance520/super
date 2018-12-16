package com.service.impl;

import com.entity.*;
import java.util.*;
import com.dao.*;
import com.service.IUserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@MapperScan(basePackages = "com.dao")
@Service("userService")
public class UserService implements IUserService{

    @Autowired
    private IUsersDao usersDao ;

    @Override
    public List<Users> selectAll() {
        return usersDao.selectAll();
    }
}
