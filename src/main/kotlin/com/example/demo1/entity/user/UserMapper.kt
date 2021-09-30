package com.example.demo1.entity.user

import com.example.demo1.dto.UserDTO
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
public interface UserMapper {


    fun userToUserDTO(user: User): UserDTO
       // return UserDTO(id= user.id, name = user.name, age = user.age)

    @InheritInverseConfiguration
    fun userDTOTOUser(userDTO: UserDTO): User
        //return User(name = userDTO.name, age = userDTO.age)
}