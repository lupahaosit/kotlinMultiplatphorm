plugins {
    kotlin("multiplatform")
}

kotlin {
    iosX64()  // для симуляторов
    iosArm64() // для реальных устройств

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