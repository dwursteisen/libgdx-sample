package sample

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Interpolation
import com.badlogic.gdx.math.Interpolation.*
import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.math.Vector2

const val duration = 3f

class SampleGame : Game() {
    private lateinit var batch: ShapeRenderer

    private val pos = Vector2(300f, 600f)
    private var t = 0f

    override fun create() {
        batch = ShapeRenderer()
    }

    override fun render() {
        Gdx.gl.glClearColor(0f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        t += Gdx.graphics.deltaTime

        pos.y = bounce.apply(500f, 100f, Math.abs(MathUtils.cos(t / duration)))
        pos.x = bounce.apply(100f, 500f, Math.abs(MathUtils.sin(2 * t / duration)))

        batch.begin(ShapeRenderer.ShapeType.Filled)
        batch.color = Color.WHITE
        batch.circle(pos.x, pos.y, 20f)
        batch.end()
    }

}