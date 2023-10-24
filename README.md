# EisenPOWA

A small playground project for fiddling around with Kotlin, Java 21 and OpenJFX.

The ultimate goal is to have a somewhat convenient application to organize user tasks in Eisenhower decision matrices.

## Running the app

There are several ways to run the app.

### From the IDE

* Run the `com.github.mtf90.Main.kt` file in IntelliJ.

### From the CLI

* Run `mvn javafx:run`

### As a distributable

* Run `mvn package -Pdist` (optionally with `-Pwith-linux`, `-Pwith-mac`, `-Pwith-windows` to support more platforms).
* The `target/eisenPOWA.zip` artifact is a self-contained archive that should include all files necessary to run the app without any setup (such as installing a JRE).
