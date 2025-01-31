package com.example

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "config")
data class HelloWorldConfigurationProperties(
    val responseString: String?
)
