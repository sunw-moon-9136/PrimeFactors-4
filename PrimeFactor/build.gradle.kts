plugins {
    id("java") // 'java' 플러그인은 Kotlin DSL에서 'java' 문자열 ID로 사용합니다.
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // JUnit Jupiter API는 'testImplementation'으로 선언
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")

    // JUnit Jupiter Engine은 'testRuntimeOnly'로 선언
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.0")

    // !!! 이 부분이 중요합니다. JUnit Platform Launcher를 명시적으로 추가합니다.
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.10.0") // JUnit 버전에 맞춰서 1.10.0으로 지정
}

tasks.test {
    useJUnitPlatform()
}