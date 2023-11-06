package day12

import java.util.UUID

enum class EntityType {
    EASY, MEDIUM, HARD, HELP;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityFactory {
    fun create(type: EntityType):Entity {
        val id = UUID.randomUUID().toString()
        val name = type.getFormattedName()
        return when (type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 1f)
            EntityType.HELP -> Entity.Help
        }
    }
}

sealed class Entity() {
    object Help : Entity() {
        val name = "Help"
    }
    data class Easy(val id:String, val name:String):Entity()
    data class Medium(val id:String, val name:String):Entity()
    data class Hard(val id:String, val name:String, val multiplier:Float):Entity()
}

fun test() {
    val thing = EntityFactory.create(EntityType.EASY)
    println(thing)

    val thing2 = EntityFactory.create(EntityType.MEDIUM)
    println(thing2)
}