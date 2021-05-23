package com.github.bennylut.db

import com.github.bennylut.app.App
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

object DB {
    val database = Database.connect("jdbc:h2:" + App.workspace.absolutePath + "/database/db", driver = "org.h2.Driver")
    fun setup() {
        transaction {
            SchemaUtils.createMissingTablesAndColumns(Recipes)
        }
    }
}