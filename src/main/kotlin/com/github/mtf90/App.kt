package com.github.mtf90

import com.github.mtf90.util.SceneFactory
import com.github.mtf90.util.Scenes
import javafx.application.Application
import javafx.stage.Stage
import java.io.IOException

class App : Application() {

    @Throws(IOException::class)
    override fun start(primaryStage: Stage) {
        SceneFactory.initStage(primaryStage)
        SceneFactory.setScene(Scenes.Menu)

        primaryStage.title = "EisenPOWA"
        primaryStage.width = 800.0
        primaryStage.height = 600.0
        primaryStage.centerOnScreen()
        primaryStage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(App::class.java, *args)
        }
    }
}
