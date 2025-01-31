package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
@EnableConfigurationProperties(HelloWorldConfigurationProperties::class)
@EnableWebMvc
open class ExampleApplication {
}