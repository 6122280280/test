package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.bean.User;

@Mapper
public interface UserDao {
	
	@Select("select * from USERINFO where 1=1")
	public List<User> getUserList();
	@Select("select * from USERINFO where username = #{username}")
	public List<User> findByName(@Param("username") String username);
	
	@Insert("insert into USERINFO(username, password) values(#{username}, #{password})")
	public int addUser(@Param("username") String username, @Param("password") String password);
}
