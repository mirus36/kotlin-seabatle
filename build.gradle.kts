plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.21"
    application
    id("org.gretty") version "2.3.1"
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("javax.servlet:javax.servlet-api:4.0.1")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    mainClassName = "me.yakunin.kseabatle.AppKt"
}

gretty {
    contextPath = "/"
}
