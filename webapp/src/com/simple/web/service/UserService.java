package com.simple.web.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simple.database.dao.IUserDao;
import com.simple.database.dto.User;
import com.simple.web.exception.UniqueIdentityException;

/**
 * UserService
 */
@Service
public class UserService {

    @Autowired
    private IUserDao userDao;

	@Transactional
    public void register(User user) throws UniqueIdentityException {
        int count = userDao.countByUsername(user.getName());
        if(count > 0) {
            throw new UniqueIdentityException("user[" + user.getName() + "] was already existed.");
        }
        count = userDao.countByEmail(user.getEmail());
        if(count > 0) {
            throw new UniqueIdentityException("email[" + user.getEmail() + "] was already used.");
        }
        user.setUuid(UUID.randomUUID().toString());
        userDao.insert(user);

    }
}
