package com.example.demo1.model.mapper

import com.example.demo1.entity.user.User
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Repository
@Mapper
interface UserSqlRepository {

    fun getUser(): User

    fun getUserByName(name: String): User
}