import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("jvm")
    id("org.jetbrains.compose")
}

group = "com.plain-note"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

dependencies {
    // Note, if you develop a library, you should use compose.desktop.common.
    // compose.desktop.currentOs should be used in launcher-sourceSet
    // (in a separate module for demo project and in testMain).
    // With compose.desktop.common you will also lose @Preview functionality
    implementation(compose.desktop.currentOs)
}

compose.desktop {
    application {
        mainClass = "Plain Note"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "plain-note"
            packageVersion = "1.0.0"

            linux {
                iconFile.set(project.file("src/main/resources/plain_note_icon.png"))
            }

            windows {
                iconFile.set(project.file("src/main/resources/plain_note_icon.png"))
            }

            macOS {
                iconFile.set(project.file("src/main/resources/plain_note_icon.png"))
            }
        }
    }
}
