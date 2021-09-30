package com.example.demo1.repository

import com.example.demo1.entity.user.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HomeRepository : JpaRepository<User, Long> {
}