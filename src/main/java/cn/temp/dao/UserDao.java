package cn.temp.dao;

import cn.temp.domain.User;

public interface UserDao {
	public abstract User findByUsername(String username);
}
