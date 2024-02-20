package com.practicetwo.numberapi
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("numbers-api")
class NumbersController {

    @GetMapping("/index")             //localhost:8080/numbers-api
    fun index(): Boolean {
        return true;
    }

    @GetMapping("pi")       //localhost:8080/numbers-api/pi
    fun pi(): Double {
        return kotlin.math.PI
    }

    @GetMapping("multiply/{param1}/{param2}")   //localhost:8080/numbers-api/multiply/12/10  - output: 120
    fun multiply(@PathVariable param1: Int, @PathVariable param2: Int): Int {
        return param1 * param2
    }

    @GetMapping("prime/{param}")
    fun prime(@PathVariable param: Int): Boolean {
        var remainder: Int = 0
        for (i in 1..param) {
            remainder += param % i
        }
        return remainder > 2
    }

}