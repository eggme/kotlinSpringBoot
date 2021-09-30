package com.example.demo1.dto

data class UserDTO constructor (var id: Long, var name: String, var age: Int)


fun UserDTO.showDTOValue() = "[${this.javaClass} (id=${this.id}, name=${this.name}, age=${this.age})]"