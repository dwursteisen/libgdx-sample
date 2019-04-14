package sample

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration

object MainClass {
    @JvmStatic
    fun main(args: Array<String>) {
        LwjglApplication(SampleGame(), LwjglApplicationConfiguration().apply {
            width = 600
            height = 600
        })
    }
}