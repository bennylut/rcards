package com.github.bennylut.db

import com.github.bennylut.app.App
import com.github.bennylut.service.Service
import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.batchInsert
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction
import java.io.File




fun main() {
    App.setup()

//    transaction {
//        SchemaUtils.createMissingTablesAndColumns(Recipes)
//
//        Recipes.batchInsert(0 until 100) {
//            this[Recipes.name] = "rcp$it"
//            this[Recipes.text] = "some long text that describes recipe $it"
//            this[Recipes.parentUrl] = "parent-url of $it"
//        }
//    }

//    transaction {
//        Recipes.selectAll().forEach {
//            println("got recipe: name=${it[Recipes.name]}")
//        }
//    }

    Service.start()
}