package com.example

import org.springframework.stereotype.Service

@Service
open class Feature1Service(
    val configurationProperties: HelloWorldConfigurationProperties
) {
    fun sayHi(name: String): String {
        return "${configurationProperties.responseString}, $name!"
    }
}