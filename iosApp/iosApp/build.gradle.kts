kotlin {
    iosArm64()  // для реальных устройств
    iosX64()    // для симуляторов

    sourceSets {
        val iosMain by creating {
            dependencies {
                implementation(kotlin("stdlib"))
            }
        }
        val iosTest by creating {
            dependsOn(iosMain)
        }
    }
}