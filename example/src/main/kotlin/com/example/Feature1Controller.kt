package com.example

import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
open class Feature1Controller(val service: Feature1Service) {
    @GetMapping("hi/{name}", produces = [MediaType.TEXT_PLAIN_VALUE])
    fun helloWorld(@PathVariable("name") name: String): ResponseEntity<String> {
        return ResponseEntity.ok(service.sayHi(name))
    }
}