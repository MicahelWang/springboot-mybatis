package com.example.demo.mapper;

import java.util.List;

import com.example.demo.entity.UserEntity;
import com.example.demo.enums.UserSexEnum;

import org.apache.ibatis.annotations.*;

/**
 * UserMapper
 */
public interface  UserMapper {

    @Select("select * from users")
    @Results({
        @Result(property="userSex",column="user_sex",javaType=UserSexEnum.class),
        @Result(property = "nickName", column = "nick_name")
    })
    List<UserEntity> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
	@Results({
		@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
		@Result(property = "nickName", column = "nick_name")
	})
	UserEntity getOne(Long id);

	@Insert("INSERT INTO users(userName,passWord,user_sex,nick_name) VALUES(#{userName}, #{passWord}, #{userSex}, #{nickName})")
	void insert(UserEntity user);

	@Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
	void update(UserEntity user);

	@Delete("DELETE FROM users WHERE id =#{id}")
	void delete(Long id);
}