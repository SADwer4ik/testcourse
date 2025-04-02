plugins {
    id ("java")
}
version = "1.0"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

group = "ru.ac.uniyar.testingcourse"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.12.0")
    testImplementation("junit:junit:4.13.1")
}

tasks.withType<Test> {
    useJUnitPlatform{
        includeEngines ("junit-jupiter")
        excludeEngines ("junit-vintage")
    }
}