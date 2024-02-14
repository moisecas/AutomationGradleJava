plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    //implementation("org.seleniumhq.selenium:selenium-java:4.16.1")
    implementation("org.seleniumhq.selenium:selenium-java:3.141.59")



    // https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
    implementation("io.github.bonigarcia:webdrivermanager:5.6.3")


    testImplementation("org.slf4j:slf4j-simple:1.7.32")

    // Cucumber
    testImplementation("io.cucumber:cucumber-java:6.10.4")
    testImplementation("io.cucumber:cucumber-junit:6.10.4")

}

tasks.test {
    useJUnitPlatform()
}