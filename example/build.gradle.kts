plugins {
    kotlin("jvm") version ("2.1.0")
    application
    id("org.springframework.boot") version ("3.+")
}
tasks.wrapper {
    gradleVersion = "8.12.1"
}
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}
repositories {
    mavenCentral()
}
dependencies {
    // implementation("io.github.wakingrufus:spring-funk-base:0.3.0")
    // implementation("io.github.wakingrufus:spring-funk-webmvc:0.3.0")
    // implementation("io.github.wakingrufus:spring-funk-runtimeconfig:0.3.0")
    implementation("org.springframework.boot:spring-boot-starter:3.+")
    implementation("org.springframework.boot:spring-boot-starter-jetty:3.+")
    implementation("org.springframework:spring-webmvc:6.+")
    implementation(kotlin("reflect"))

    testImplementation("org.springframework.boot:spring-boot-starter-test:3.+")
    testImplementation("org.assertj:assertj-core:3.27.3")
}
testing {
    suites {
        named<JvmTestSuite>("test"){
            useJUnitJupiter()
        }
    }
}
kotlin {
    compilerOptions {
        javaParameters = true
    }
}
