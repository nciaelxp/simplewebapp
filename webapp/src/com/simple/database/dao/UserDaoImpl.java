package com.simple.database.dao;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.simple.database.dto.User;

public class UserDaoImpl extends NamedParameterJdbcDaoSupport implements IUserDao {

	@Override
	public int insert(User user) {
		String insertFileString = "INSERT INTO users "
			      + "(id, name, password, verify_code, create_time) VALUES "
			      + "(:id, :name, :password, :email, :verifyCode,:createTime)";
			    SqlParameterSource fileParameters = new BeanPropertySqlParameterSource(user);
			    KeyHolder keyHolder = new GeneratedKeyHolder();
			    getNamedParameterJdbcTemplate().update(insertFileString, fileParameters, keyHolder);
			    return keyHolder.getKey().intValue();
	}

	@Override
	public int update(User account) {
		return 0;
	}

	@Override
	public int delete(String uuid) {
		return 0;
	}

	@Override
	public User selectById(int id) {
		return null;
	}

	@Override
	public User selectByUuid(String uuid) {
		return null;
	}

	@Override
	public User selectByUsername(String username) {
		return null;
	}

	@Override
	public int countByUsername(String username) {
		return 0;
	}

	@Override
	public int countByEmail(String email) {
		return 0;
	}

}
