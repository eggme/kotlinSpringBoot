package com.example.demo1.service

import com.example.demo1.dto.UserDTO
import com.example.demo1.dto.showDTOValue
import com.example.demo1.entity.user.UserMapper
import com.example.demo1.model.mapper.UserSqlRepository
import com.example.demo1.extensions.getLongerStringLength
import com.example.demo1.repository.HomeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class HomeService @Autowired constructor (
        private val homeRepository: HomeRepository,
        private val userMapper: UserMapper,
        private val mybatisMapper: UserSqlRepository
        ){

    fun saveUser(userDTO: UserDTO) : UserDTO{
        val savedUser = homeRepository.save(userMapper.userDTOTOUser(userDTO))

        println(userMapper.userToUserDTO(savedUser).name getLongerStringLength "2")
        println(userMapper.userToUserDTO(savedUser).showDTOValue());

        val savedUserFindByName = mybatisMapper.getUserByName(userDTO.name)
        println(userMapper.userToUserDTO(savedUserFindByName).showDTOValue())
        return userMapper.userToUserDTO(savedUser)
    }

}