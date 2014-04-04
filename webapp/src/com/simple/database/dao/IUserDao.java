package com.simple.database.dao;

import com.simple.database.dto.User;

public interface IUserDao {

    public int insert(User account);
    
    public int update(User account);
    
    public int delete(String uuid);

    public User selectById(int id);

    public User selectByUuid(String uuid);

    public User selectByUsername(String username);

    public int countByUsername(String username);

    public int countByEmail(String email);
}
