package com.example.demo1.controller

import com.example.demo1.dto.UserDTO
import com.example.demo1.service.HomeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class HomeController (private val homeService: HomeService){

    @RequestMapping(value = ["/home"], method = [RequestMethod.GET])
    fun home(model: Model): String {
        var userDTO = UserDTO(0, "이승준", 26)
        val savedUser = homeService.saveUser(userDTO)

        model["id"] = savedUser.id
        model["name"] = savedUser.name
        model["age"] = savedUser.age
        return "index"
    }

    @GetMapping(value = ["/test"])
    fun test(): String{
        println(apply("Kim", ::increase))
        println(getName { lastName, firstName -> setCommon() + "$firstName" + "$lastName" })
        return "index"
    }

    fun increase(n: Int): Int {
        println("num $n")
        return n + 10;
    }

    fun apply(name: String, body: (Int) -> Int): Int{
        println("name: $name")
        return body(0)
    }

    fun setCommon(): String{
        return "My name is "
    }

    fun getName(body: (String, String) -> String): String{
        return body("Lee","SeungJun")
    }

}

