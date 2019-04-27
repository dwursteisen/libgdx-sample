package com.github.dwursteisen.libgdx.sample

import android.os.Bundle
import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import sample.SampleGame

class AndroidLauncher : AndroidApplication() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val config = AndroidApplicationConfiguration()
        super.onCreate(savedInstanceState)
        initialize(SampleGame(), config)
    }
}
