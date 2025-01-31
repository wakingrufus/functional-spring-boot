```kotlin
//@SpringBootApplication
//@EnableConfigurationProperties(HelloWorldConfigurationProperties::class)
//@EnableWebMvc
open class ExampleApplication : SpringFunkApplication {
    override fun dsl(): SpringDslContainer.() -> Unit = {
        beans {
            bean<Feature1Service>()
        }
        runtimeConfig {
            registerConfigClass<HelloWorldConfigurationProperties>()
        }
        webmvc {
            enableWebMvc {
                jetty()
            }
            routes {
                router { helloWorldApi(ref()) }
            }
        }
    }
}

fun helloWorldApi(service: Feature1Service) = router {
    GET("/test") {
        ServerResponse.ok().body(service.sayHi(it.pathVariable("name")))
    }
}
```