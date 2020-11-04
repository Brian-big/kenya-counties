package com.brianbig.counties

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CountyController(){
    @GetMapping("/mombasa")
    fun getCounty() : County = County(1, "Mombasa", "Mombasa")
}