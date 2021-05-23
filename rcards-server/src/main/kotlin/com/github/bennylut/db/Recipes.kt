package com.github.bennylut.db

import org.jetbrains.exposed.dao.id.LongIdTable

object Recipes : LongIdTable() {
    val name = varchar("name", 50)
    val text = text("text")
    val parentUrl = text("parent_url")
}