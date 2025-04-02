plugins {
    id ("java")
}
version = "1.0"

group = "ru.ac.uniyar.testingcourse"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.12.0")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.12.0")
}

tasks.withType<Test> {
    useJUnitPlatform{
        includeEngines ("junit-jupiter")
        excludeEngines ("junit-vintage")
    }
}