plugins {
    id("java")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

// utf-8
tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

repositories {
    maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")
}

dependencies {
    implementation(project(":api"))
    compileOnly("io.papermc.paper:paper-api:1.21.1-R0.1-SNAPSHOT")
    compileOnly("me.clip:placeholderapi:2.11.6")
}
