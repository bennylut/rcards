package com.github.bennylut.app

import com.github.bennylut.db.DB
import java.io.File


object App {
    val workspace = File("workspace")

    fun setup() {
        DB.setup()
    }
}
